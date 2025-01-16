#include <iostream>
#include <string>
#include <vector>
#include <memory>
#include <cmath>
#include <fstream>
#include <sstream> //per lo stringstream

using namespace std;

class IForma
{
public:
    virtual double calcolaPerimetro() = 0;
    virtual double calcolaArea() = 0;
   // ~IForma() = default;
};

class Rettangolo : public IForma
{

private:
    double b, h; // lati del rettangolo

public:
    Rettangolo(double b, double h)
    {
        this->b = b;
        this->h = h;
    }

    double calcolaPerimetro()
    {
        return (2 * b) + (2 * h);
    }

    double calcolaArea()
    {

        return b * h;
    }
};

class Cerchio : public IForma
{

private:
    double r; // raggio del cerchio

public:
    Cerchio(double r)
    {
        this->r = r;
    }

    double calcolaPerimetro()
    {
        return 2 * 3.14 * r;
    }

    double calcolaArea()
    {

        return 3.14 * r * r;
    }
};

class Triangolo : public IForma
{

private:
    double l1, l2, l3; // lati del triangolo

public:
    Triangolo(double l1, double l2, double l3)
    {
        this->l1 = l1;
        this->l2 = l2;
        this->l3 = l3;
    }

    double calcolaPerimetro()
    {
        return (l1 + l2 + l3);
    }

    double calcolaArea()
    {

        double p = calcolaPerimetro() / 2; // semiperimetro

        return sqrt(p * (p - l1) * (p - l2) * (p - l3));
    }
};
void readForma(string nomeFile)
{ // funzione esterna che mi serve per leggere da file

    ifstream fileInput(nomeFile);

    if (fileInput.fail())
    {
        cerr << "Errore nell'apertura del file" << endl;
        return;
    }

    string linea;
    double result_p = 0;
    double result_a = 0;

    while (getline(fileInput, linea))
    {

        string forma;
        stringstream iss(linea);  // stringstream trasforma linea in un flusso di dati, mi serve per il getline (non accetta linea perchè non è flusso di input)
        string p1, p2, p3;        // sono le "parti" che compongono la riga oltre alla lettere che rappresenta la froma (rettangolo avendo solo base e altezza userò solo p1 p2)
        string op;                // la parte che riguarda l'operazione (+ o-)
        getline(iss, forma, ','); // getline vuole flusso di input, trasformo linea in un strigstream
        // leggo il contenuto riga, metto nella variabile forma quello che c'è prima della virgola sarà sempre il primo carattere del file che mi va a dire che tipo di forma è

        if (forma == "R")
        {

            getline(iss, p1, ','); // altezza
            getline(iss, p2, ','); // base
            getline(iss, op, ','); // operazione
            if (op == "+")
            { // stod converte da string a double
                result_a = result_a + Rettangolo(stod(p1), stod(p2)).calcolaArea();
                result_p = result_p + Rettangolo(stod(p1), stod(p2)).calcolaPerimetro();
            }
            else if (op == "-")
            {
                result_a = result_a - Rettangolo(stod(p1), stod(p2)).calcolaArea();
                result_p = result_p - Rettangolo(stod(p1), stod(p2)).calcolaPerimetro();
            }
            else if (op == "+/2")
            {
                result_p = result_p + (Rettangolo(stod(p1), stod(p2)).calcolaPerimetro()) / 2;
                result_a = result_a + (Rettangolo(stod(p1), stod(p2)).calcolaArea()) / 2;
            }
        }
        else if (forma == "T")
        {

            getline(iss, p1, ','); // l1
            getline(iss, p2, ','); // l2
            getline(iss, p3, ','); // l3
            getline(iss, op, ','); // operazione
            if (op == "+")
            { // stod converte da string a double
                result_a = result_a + Triangolo(stod(p1), stod(p2), stod(p3)).calcolaArea();
                result_p = result_p + Triangolo(stod(p1), stod(p2), stod(p3)).calcolaPerimetro();
            }
            else if (op == "-")
            {
                result_a = result_a - Triangolo(stod(p1), stod(p2), stod(p3)).calcolaArea();
                result_p = result_p - Triangolo(stod(p1), stod(p2), stod(p3)).calcolaPerimetro();
            }
            else if (op == "+/2")
            {
                result_p = result_p + (Triangolo(stod(p1), stod(p2), stod(p3)).calcolaPerimetro()) / 2;
                result_a = result_a + (Triangolo(stod(p1), stod(p2), stod(p3)).calcolaArea()) / 2;
            }
        }else if (forma == "C")
        {

            getline(iss, p1, ','); // raggio
            getline(iss, op, ','); // operazione
            if (op == "+")
            { // stod converte da string a double
                result_a = result_a + Cerchio(stod(p1)).calcolaArea();
                result_p = result_p + Cerchio(stod(p1)).calcolaPerimetro();
            }
            else if (op == "-")
            {
                result_a = result_a - Cerchio(stod(p1)).calcolaArea();
                result_p = result_p - Cerchio(stod(p1)).calcolaPerimetro();
            }
            else if (op == "+/2")
            {
                result_p = result_p + (Cerchio(stod(p1)).calcolaPerimetro()) / 2;
                result_a = result_a + (Cerchio(stod(p1)).calcolaArea()) / 2;
            }
        }
    }
    
    fileInput.close();

    cout << "L'area totale della forma: " << nomeFile << " e': "  <<  result_a << endl;
    cout << "Il perimetro totale della forma: " << nomeFile << " e': "  <<  result_p << endl;
}

int main(){

     vector<string> filenames = {"Figura1.txt", "Figura2.txt", "Figura3.txt", "Figura4.txt"};
    for (auto filename : filenames) {
        readForma(filename);
    }

    

    return 0;
}

