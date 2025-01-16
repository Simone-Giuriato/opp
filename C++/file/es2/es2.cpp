#include <iostream>
#include <fstream>
using namespace std;

int main()
{
//se voglio scrivere in append di seguito.. ios::app
    string filename = "file.txt";
    ofstream Fo(filename);    //apro in scrittura
    if (Fo.fail())
    {
        cerr << "Errore nell'apertura del file in scrittura";
        return -1;
    }

    Fo << "Juve" << endl;   //scrivo cose nel file
    Fo << "Milan" << endl;
    Fo << "Inter" << endl;

    cout << "-----Inserisci studenti:------" << endl;

    string s; // ci butto cio che scrivo da tastier nel terminale

    while (getline(cin, s)) //scrivo altre cose nel file ma da tastiera che chiedo all utente
    {
        if (s == "fine")
        {
            break; // stoppo tutto
        }

        Fo << s << endl;
    }
    Fo.close(); //chiudo scrittura

    ifstream Fi(filename);  //apro in lettura il file
    if (Fi.fail())
    {
        cerr << "ERRORE in lettura ";
    }

    string linea; // cio che leggo dal file in una riga;
    cout<<"Contenuto del file"<<endl;
    while (getline(Fi, linea))  //leggo, ciò che leggo lo scrivo a video
    {
        cout << linea << endl;
    }

    Fi.close();

    return 0;
}