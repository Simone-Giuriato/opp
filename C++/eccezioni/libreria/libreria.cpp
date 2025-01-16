#include <iostream>
#include <vector>
#include <memory>
using namespace std;

enum TIPO
{
    LIBRO,
    GIORNALE,
    RIVISTA,
    DVD
};

class Codice_Duplicato : public exception{  //eccezione personalizzata si fa cosi (public exception roba di sintassi)
    public:
        const char* what(){
            return "Elemento gia' presente nella libreria\n";
        }
};

class Rimozione_Impossibile : public exception{
    public:
    const char* what(){
        return "Impossibile rimuovere l'oggetto perchè non è presente\n";
    }
};

class Ricerca_Impossibile : public exception{
    public:
    const char* what(){
        return "Elemento non presente nella libreria\n";
    }
};

class IItemLibreria
{
public:
    virtual string getId() = 0;
    virtual TIPO getTipo() = 0;
    virtual void showInfo() = 0;
    virtual string getTitolo() = 0;
    virtual ~IItemLibreria() = default;
};

class Libro : public IItemLibreria
{
private:
    string id;
    string titolo;
    string autore;
    double costo;
    TIPO tipo = LIBRO;

public:
    Libro(string id, string titolo, string autore, double costo) : id(id), titolo(titolo), autore(autore), costo(costo) {}

    string getId()
    {
        return id;
    }

    void showInfo()
    {
        cout << "ID:            " << id << endl;
        cout << "Titolo:        " << titolo << endl;
        cout << "Autore:        " << autore << endl;
        cout << "costo:         " << costo << endl;
        cout << "---------------" << endl;
    }
    TIPO getTipo()
    {
        return tipo;
    }

    string getTitolo()
    {
        return titolo;
    }
};

class Rivista : public IItemLibreria
{
private:
    string id;
    string titolo;
    string casaEditrice;
    string tipologia;
    double costo;
    TIPO tipo = RIVISTA;

public:
    Rivista(string id, string titolo, string casaEditrice, string tipologia, double costo) : id(id), titolo(titolo), casaEditrice(casaEditrice), tipologia(tipologia), costo(costo) {}

    string getId()
    {
        return id;
    }

    void showInfo()
    {
        cout << "ID:            " << id << endl;
        cout << "Titolo:        " << titolo << endl;
        cout << "Tipologia:     " << tipologia << endl;
        cout << "Casa editrice: " << casaEditrice << endl;
        cout << "costo:         " << costo << endl;
        cout << "---------------" << endl;
    }
    TIPO getTipo()
    {
        return tipo;
    }
    string getTitolo()
    {
        return titolo;
    }
};

class Libreria
{
private:
    // usiamo d'ora in poi gli shared_ptr, delle classi 'safe' per l'uso dei puntatori che, a differenza
    // degli unique_ptr non hanno bisogno di usare il metodo move(...) per assegnarli a varie collections
    vector<shared_ptr<IItemLibreria>> contenuto;

public:
    /*void insert(shared_ptr<IItemLibreria> item)
    {
        contenuto.push_back(item);
    }*/

   void insert(shared_ptr<IItemLibreria> item){
            try{
                for(auto elem : contenuto){
                    if(elem->getId() == item->getId()) throw Codice_Duplicato();
                }
                contenuto.push_back(item);
            } catch(Codice_Duplicato cd){
                cout << "Eccezione: " << cd.what() << endl;
            
            }
        }

    shared_ptr<IItemLibreria> trovaID(string id)
    {
        try
        { // boh l eccezione me pare inutile, si risolve con un else no?
            for (auto item : contenuto)
            {
                if (item->getId() == id)
                {
                    cout << "Oggetto trovato con successo:" << endl;
                    return item;
                }
            }
            // se non l'ho trovato, sollevo un'eccezione che verrà gestita in seguito
            throw Ricerca_Impossibile();
        }
        catch (Ricerca_Impossibile rImp)
        {
            cout<<"Eccezione: "<<rImp.what();
        }
        return nullptr;
    }

    void readContent()
    {
        cout << "Contenuto della libreria:" << endl;
        for (shared_ptr<IItemLibreria> item : contenuto)
        {
            item->showInfo();
        }
    }

    void rimuovi(string id)
    {
        try{
        for (auto it = contenuto.begin(); it != contenuto.end(); it++)
        {
            if ((*it)->getId() == id)
            { // qui *it perchè è un iterator che modifica
                contenuto.erase(it);
                return;
            }
        }
        throw Rimozione_Impossibile();
        }
        catch(Rimozione_Impossibile rI){
            cout<<"Eccezione:"<<rI.what()<<endl;

        }
        
    }

    void ricercaTIPO(TIPO tipo)
    {

        vector<shared_ptr<IItemLibreria>> richiesta;
        for (auto item : contenuto)
        { // quindi item senza * perchè non modifica
            if ((item->getTipo() == tipo))
            {
                richiesta.push_back(item);
                item->showInfo();
            }
        }
        if (richiesta.empty())
        {
            cout << "Non sono presenti elementi di questo tipo!" << endl;
        }
    }

    void ricercaTitolo(string titolo)
    {
        vector<shared_ptr<IItemLibreria>> richiesta; // metto nel vettore quelli che hanno lo stesso titolo
        for (auto item : contenuto)
        {
            if (item->getTitolo() == titolo)
            {
                richiesta.push_back(item);
            }
        }

        if (richiesta.empty())
        {
            cout << "Non sono stati trovati elementi con questo titolo" << endl;
        }
        else
        {
            for (auto i : richiesta)
            {
                i->showInfo();
            }
        }
    }

      ~Libreria() = default;  // é superfluo perché il vettore di shared_ptr è già gestito automaticamente
};

int main()
{
    Libreria lib;

    shared_ptr<IItemLibreria> libro01 = make_shared<Libro>("ISBN-0001", "Il signore degli anelli", "J.R.R. Tolkien", 30.0);
    shared_ptr<IItemLibreria> libro02 = make_shared<Libro>("ISBN-0002", "Abissi d'acciaio", "I. Asimov", 20.0);
    shared_ptr<IItemLibreria> rivista01 = make_shared<Rivista>("ISBN-0003", "Vermi preziosi", "Pesca", "BE Edizioni", 10.0);

    lib.insert(libro01);
    lib.insert(libro01);    //elemento gia presente in libreria, è un codice duplicato genera eccezione
    lib.insert(libro02);
    lib.insert(rivista01);

    lib.readContent();

    auto item1 = lib.trovaID("ISBN-0003"); // l oggetto c'è
    if (item1)
    {
        item1->showInfo();
    }

    shared_ptr<IItemLibreria> item2 = lib.trovaID("NOID"); // faccio vedere che funziona se non dovesse esserci un libro, scata l'eccezione Ricaerca_Impossibile
    if (item2)
    {
        item2->showInfo();
    }

    cout << "Elementi trovati con il tipo richiesto:" << endl;
    lib.ricercaTIPO(LIBRO);

    cout << endl
         << "Ricerca elementi da titolo, inserire stringa: ";
    string s;
    getline(cin, s);

    cout << "Elementi trovati con il titolo: " << s << endl;
    lib.ricercaTitolo(s);

    lib.rimuovi("ISBN-0003");   //rimuovo un oggetto
    lib.rimuovi("ISBN-00056");   //rimuovo un oggetto che non c'è fa scattare un eccezione (Rimozione_Impossibile)

    lib.readContent();  //non c'è 003 perchè l ho rimosso 

    return 0;
}