#include <iostream>
#include <string>
#include <algorithm>//per roba toUpper
#include <vector>
#include <cctype>
#include <memory>   //per puntatorui sfae

using namespace std;

string toUpper(const std::string &str)
{ // roba sua di to upper
    std::string upperStr = str;
    std::transform(upperStr.begin(), upperStr.end(), upperStr.begin(), ::toupper);
    return upperStr;
}

class IContatto
{ // interfaccia condivisa dai contatti
public:
    virtual void stampaDettagli() = 0;
    virtual string getId() = 0;     // ottiene cf se perfona, P.iva se azienda
    virtual ~IContatto() = default; // distruttore di default PERCHE?
};

class Persona : public IContatto
{
private:
    string nome;
    string cognome;
    string cF;
    string numeroTelefono;

public:
    // qua dice roba sui const e puntatori
    Persona(string nome, string cognome, string cF, string numeroT)
    {
        this->nome = toUpper(nome);
        this->cognome = toUpper(cognome);
        this->cF = toUpper(cF);
        this->numeroTelefono = toUpper(numeroT);
    }

    // non è obbligatorio mettere override, ma consigliato

    void stampaDettagli() override
    {
        cout << "Perosna Fisica:\n"
             << endl;
        cout << "Nome: " << nome << endl;
        cout << "Cogonome: " << cognome << endl;
        cout << "Codice Fiscale: " << cF << endl;
        cout << "Numero di Telefono: " << numeroTelefono << endl;
    }

    string getId() override
    {
        return cF;
    }
};

class Azienda : public IContatto
{
private:
    string ragioneSociale;
    string partitaIva;
    string numeroTelefono;

public:
    Azienda(string ragioneSoc, string partitaIva, string numeroT)
    {
        this->ragioneSociale = ragioneSoc;
        this->numeroTelefono = numeroT;
        this->partitaIva = partitaIva;
    }
    string getId() override
    {
        return partitaIva;
    }

    void stampaDettagli() override
    {
        cout << "Azienda:\n"
             << endl;
        cout << "Ragione Sociale: " << ragioneSociale << endl;
        cout << "Parita Iva: " << partitaIva << endl;
        cout << "Numero di Telefono: " << numeroTelefono << endl;
    }
};

// classe Rubrica per gestire i contatti
class Rubrica
{

    private:
    vector<shared_ptr<IContatto>> contatti;

    public:

    void aggiungiContatto(shared_ptr<IContatto> contatto){  //lui mette & commerciale
        contatti.push_back(contatto);

    }

     void rimuoviContatto(string id) {  //RIVEDERE
        // in questo caso si può usare nel ciclo sia il tipo della IContatto shared_ptr<IContatto> o usare la parola chiave "auto" che
        // ricava il tipo direttamente dall'oggetto. In questo caso uso un iteratore, oggetto che viene definito nella classe vector e che
        // serve a puntare un determinato elemento del vettore
        for (auto i = contatti.begin(); i != contatti.end(); ++i) {
            // con questa definizione chiedo il metodo getId() della classe puntata (*it) dall'iteratore it. Si fa questo per ottimizzare la ricerca
            // e per poter eliminare un elemento specifico del vector
            if ((*i)->getId() == id) {
                contatti.erase(i);
                std::cout << "Contatto con ID " << id << " rimosso.\n";
                return;
            }
        }
        std::cout << "Contatto con ID " << id << " non trovato.\n";
    }

   

    shared_ptr<IContatto> trovaContatto(string id) {
        for (auto contatto : contatti) {    //for each
            if (contatto->getId()== id) {
                return contatto;
            }
        }
        return nullptr; //valore che dice non essere torvato nulla
    }
    void stampaContatti(){
        if (contatti.empty()) {
            std::cout << "La rubrica è vuota.\n";
            return;
        }

        std::cout << "Elenco contatti:\n";
        for (auto contatto : contatti) {
            contatto->stampaDettagli();
        }
    }
};

void mostraMenu() {
    std::cout << "\n--- Rubrica ---\n";
    std::cout << "1. Aggiungi contatto persona fisica\n";
    std::cout << "2. Aggiungi contatto azienda\n";
    std::cout << "3. Rimuovi contatto\n";
    std::cout << "4. Trova contatto\n";
    std::cout << "5. Elenca contatti\n";
    std::cout << "6. Esci\n";
    std::cout << "Scegli un'opzione: ";
}

int main()
{
     Rubrica rubrica;
    int scelta;

    do {
        mostraMenu();
        std::cin >> scelta;
        // si usa ignore() per ignorare eventuale input rimanente nel buffer di invio prima di invocare una getline(). Si usa principalmente
        // per evitare che una successiva getline() consideri il ritorno a capo \n come una stringa da processare
        std::cin.ignore();

        if (scelta == 1) {
            std::string nome, cognome, cf, numeroTelefono;
            std::cout << "Inserisci nome: ";
            std::getline(std::cin, nome);
            // va bene anche cin>>nome
            std::cout << "Inserisci cognome: ";
            std::getline(std::cin, cognome);
            std::cout << "Inserisci codice fiscale: ";
            std::getline(std::cin, cf);
            std::cout << "Inserisci numero di telefono: ";
            std::getline(std::cin, numeroTelefono);
            //Passo 1
            Persona* persona = new Persona(nome, cognome, cf, numeroTelefono);

// Passo 2: Creare un shared_ptr che punta all'oggetto appena creato
std::shared_ptr<IContatto> contatto = std::make_shared<Persona>(nome, cognome, cf, numeroTelefono);

// Passo 3: Aggiungere il contatto alla rubrica
rubrica.aggiungiContatto(contatto);

            //rubrica.aggiungiContatto(std::make_shared<Persona>(nome, cognome, cf, numeroTelefono));
            std::cout << "Contatto persona fisica aggiunto.\n";

        } else if (scelta == 2) {
            std::string ragioneSociale, partitaIVA, numeroTelefono;
            std::cout << "Inserisci ragione sociale: ";
            std::getline(std::cin, ragioneSociale);
            std::cout << "Inserisci partita IVA: ";
            std::getline(std::cin, partitaIVA);
            std::cout << "Inserisci numero di telefono: ";
            std::getline(std::cin, numeroTelefono);
            rubrica.aggiungiContatto(make_shared<Azienda>(ragioneSociale, partitaIVA, numeroTelefono));
            std::cout << "Contatto azienda aggiunto.\n";

        } else if (scelta == 3) {
            std::string id;
            std::cout << "Inserisci CF o P.IVA del contatto da rimuovere: ";
            std::getline(std::cin, id);
            rubrica.rimuoviContatto(id);

        } else if (scelta == 4) {
            std::string id;
            std::cout << "Inserisci CF o P.IVA del contatto da trovare: ";
            std::getline(std::cin, id);
            auto contatto = rubrica.trovaContatto(id);
            if (contatto) {
                std::cout << "Contatto trovato:\n";
                contatto->stampaDettagli();
            } else {
                std::cout << "Contatto con ID " << id << " non trovato.\n";
            }

        } else if (scelta == 5) {
            rubrica.stampaContatti();
        }

    } while (scelta != 6);

    std::cout << "Programma terminato.\n";
}