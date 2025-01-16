#include <iostream>
#include <fstream>
#include <memory>
#include <cctype>
#include <cmath>
#include <sstream>
#include <vector>

using namespace std;

class Lettura_Impossibile : public exception
{
public:
    const string what()
    {
        return "File input formattato male";
    }
};
class Complex
{ // z=a+ib
private:
    double a;
    double b; // parte immaginaria

public:
    Complex(int a, int b)
    {
        this->a = a;
        this->b = b;
    }

    double getA()
    {
        return a;
    }

    double getB()
    {
        return b;
    }

    string stampa()
    {
        if (b >= 0)
        {
            return to_string(a) + "+" + to_string(b) + "i";
        }
        else
        {
            return to_string(b) + " " + to_string(b) + "i"; // il segno - ce lo mette il numero che pesco dal file
        }
    }

    Complex operator+(Complex other)
    {
        Complex z((a + other.getA()), (b + other.getB()));
        return z;
    }

    Complex operator-(Complex other)
    {
        return Complex((this->a - other.getA()), (this->b - other.getB()));
    }

    Complex operator*(Complex other)
    {
        return Complex(this->a * other.getA() - this->b * other.getB(), this->a * other.getB() - this->b * other.getA());
    }

    double mod()
    {
        double mod;
        mod = sqrt(pow(a, 2) + pow(b, 2)); // radice quadrata di a^2+b^2
        return mod;
    }

    string polar()
    {
        double r;
        double teta;
        r = mod();
        teta = atan2(b, a);
        return to_string(r) + " (cos(" + to_string(teta) + ") + i*sin(" + to_string(teta) + "))";
    }
};

vector<shared_ptr<Complex>> read(string filename)
{
    vector<shared_ptr<Complex>> numeriFile;
    ifstream fileInput(filename);
    if (fileInput.fail())
    {
        cerr << "Errore nell apertura del file" << filename;
        exit(-1);
    }

    string linea; // ci andrà ogni linea del file per poi spachettarla
    while (getline(fileInput, linea))
    {

        stringstream iss(linea); // trasformo linea in un flusso di input per getline
        string a, b;             // numeri che leggo da file, prima stringa poi convergo
        try
        {
            if (getline(iss, a, ',');
                getline(iss, b, ','))
            {

                shared_ptr<Complex> z = make_shared<Complex>(stod(a), (stod(b)));
                numeriFile.push_back(z); // butto dentro al vettore

                // o:
                // numeriFile.push_back(make_shared<Complex>(stod(a), (stod(b)))); // butto dentro al vettore
                throw Lettura_Impossibile();
            }
        }
        catch (Lettura_Impossibile imp)
        {

            cout << "Eccezione" << imp.what() << endl;
        }
    }
    fileInput.close();
    return numeriFile; // ritorno il vettore
}

int main()
{

    Complex z1(2, 4);
    Complex z2(3, 1);
    Complex somma = z1 + z2;
    cout << "La somma: " << somma.stampa() << endl;
    cout << "Differenza: " << (z1 - z2).stampa() << endl;
    cout << "Prodotto: " << (z1 * z2).stampa() << endl;
    cout << "Modulo: " << z1.mod() << z2.mod() << endl;
    cout << "Coordinate Polari:" << z1.polar() << z2.polar() << endl;

    cout << "Numeri del file: \n";
    vector<shared_ptr<Complex>> numeri;

    numeri = read("Input.txt");

    for (auto complesso : numeri)
    {

        cout << complesso->stampa() << endl;
        cout << "Modulo: " << complesso->mod() << endl;
        cout << "Coordinate Polari:" << complesso->polar() << endl;
    }

    return 0;
}