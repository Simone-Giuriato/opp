#include <iostream>
#include <vector>
#include <memory>
#include <cctype>
#include <fstream>
#include <sstream>

using namespace std;

class Vehicle
{

public:
    virtual string getBrand() = 0;
    virtual string getModel() = 0;
    virtual int getYear() = 0;
    virtual double getPrice() = 0;
    virtual string stampa() = 0;
};

class Car : public Vehicle
{

private:
    string brand, model;
    int year;
    double price;

public:
    Car(string brand, string model, int year, double price)
    {
        this->brand = brand;
        this->model = model;
        this->year = year;
        this->price = price;
    }

    string getBrand()
    {
        return brand;
    }

    string getModel()
    {
        return model;
    }
    int getYear()
    {
        return year;
    }

    double getPrice()
    {
        return price;
    }

    string stampa()
    {
        return brand + " " + model + "  " + "Anno: " + to_string(year) + "  " + "Prezzo: " + to_string(price);
    }
};

class Dealership
{
private:
    vector<shared_ptr<Vehicle>> magazzino; // tipo Vehicle perchè non crea ogetti ma punta a classi derivate (in magazzino porei avere piu tipi di veicoli, non solo macchine), se metto Car ecco che la classe Camion che potrebbe avere un attributo diverso da Car non sarebbe piu compresa

public:
    void loadInventory(string filename)
    { // carico il magazzino leggendo dal file

        ifstream FileInput(filename);
        if (FileInput.fail())
        {
            cerr << "Errore nell apertura del file input";
            return;
        }
        string linea; // leggo una linea del file
        while (getline(FileInput, linea))
        {

            stringstream iss(linea); // butto cio che cè in linea stringa in iss che è flusso dati input
            string brand, model;
            string yearStr; // dentro getline vuole (flusso dati, stringa, ',')
            string priceStr;

            if (getline(iss, brand, ',') && // se il file è composto cosi
                getline(iss, model, ',') &&
                getline(iss, yearStr, ',') &&
                getline(iss, priceStr, ','))
            {

                // Converto i campi che mi servono numerici:

                int year = stod(yearStr);
                double price = stod(priceStr);

                magazzino.push_back(make_shared<Car>(brand, model, year, price)); // butto cio che leggo dentro al vettore magazzino, faccio un ogetto tipo puntatore classe Car, non posso fare di tipo vehicle perchè astratta (il vettore posso)
            }
            else // se la riga nel file è brutta
            {
                cerr << "Riga non valida nel file" << linea << endl;
            }
        }
        FileInput.close();
    }

    void show()
    { // stampo ciò che c'è in magazzino
        for (auto i : magazzino)
        {

            cout << i->stampa() << endl;
        }
    }

    void remove(shared_ptr<Vehicle> v)
    {
        // per ogni auto in magazzino vedo se corrisponde a quella che è stata prenotata che mi verrà detto dal main
        // indicando tutti gli attributi
        for (auto it = magazzino.begin(); it != magazzino.end(); it++)
        {
            if ((*it)->getBrand() == v->getBrand() && (*it)->getModel() == v->getModel() && (*it)->getPrice() == v->getPrice() && (*it)->getYear() == v->getYear())
            {
                magazzino.erase((it));
                return;
            }
        }
    }

    void saveMgazzino(string filename)
    {

        ofstream fileOutput(filename); // lo apro in modalità scrittura, ogni volta sovrascrive
        if (fileOutput.fail())
        {
            cerr << "Errore nell'apertura del file";
            return;
        }

        // fileOutput<<"Veicoli disponibili dopo la rimozione:\n"<<endl;

        for (auto i : magazzino)
        {
            fileOutput << i->getBrand() << "," << i->getModel() << "," << i->getYear() << "," << i->getPrice() << endl;
        }
        fileOutput.close();
    }
};

int main()
{
    Dealership d;
    d.loadInventory("Input.txt");
    string scelta;

    do
    {
        string scelta;

        cout << "\nConcessionaria Auto" << endl
             << "1 Visualizzare Inventario\n"
             << "2 Rimuovere auto\n"
             << "3 Aggiornamento Inventario\n"
             << "4 Uscita\n";

        cin >> scelta;
        cin.ignore(); // Aggiungi questa riga per ignorare il carattere '\n' nel buffer

        if (scelta == "1")
        {
            cout << "Veicoli disponibili in magazzino:" << endl;
            d.show();
        }
        else if (scelta == "2")
        {

            string brand, modello;
            string yearStr;
            string priceStr;
            cout << "Configura il veicolo da rimuovere:" << endl;
            cout << "Brand:" << endl;
            getline(cin, brand);
            cout << "Modello:" << endl;
            getline(cin, modello);
            cout << "Anno:" << endl;
            getline(cin, yearStr);
            cout << "Prezzo:" << endl;
            getline(cin, priceStr);
            int year = stod(yearStr);
            double price = stod(priceStr);
            shared_ptr<Vehicle> veicolo1 = make_shared<Car>(brand, modello, year, price); // creo un oggetto che so essere presente nel file e lo mando a rimuovere
            d.remove(veicolo1);
        }
        else if (scelta == "3")
        {
            string fileOut; // come chiamare file output
            fileOut = "Output.txt";
            d.saveMgazzino(fileOut);
        }
        else if (scelta == "4")
        {
            cout << "Arrivederci" << endl;
            return 0;
        }

    } while (scelta != "1" || scelta != "4" || scelta != "3" || scelta != "4");

    return 0;
}