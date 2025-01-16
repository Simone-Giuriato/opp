#include <iostream>
#include <fstream>
#include <memory>
#include <cctype>
#include <sstream>
#include <cmath>
#include <vector>

using namespace std;

class Complex // z=a+ib
{
private:
    double a; // reale
    double b; // immaginaria

public:
    Complex(double a, double b)
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

    string stampa() // capire i to_string
    {
        if (b > 0)
        {
            return to_string(a) + "+" + to_string(b) + "i";
        }
        else if (b < 0)
        {

            return to_string(a) + " " + to_string(b) + "i"; // il - lo mette gia il numero letto da file
        }
        else
        { // b=0;
            return to_string(a);
        }
    }

    Complex operator+(Complex other)
    {

        Complex z(this->a + other.getA(), this->b + other.getB());
        return z;
    }

    Complex operator-(Complex other)
    {
        Complex z(this->a - other.getA(), this->b - other.getB());
        return z;
    }

    Complex operator*(Complex other)
    {
        Complex z(this->a * other.getA() - this->b * other.getB(), this->a * other.getB() + this->b * other.getA());
        return z;
    }

    double mod()
    {
        double mod = 0;
        mod = sqrt(pow(a, 2) + pow(b, 2)); // provare se va metodo artigianale
        return mod;
    }

    string polar()
    {
        double r = mod();
        double teta = atan2(b, a); // giusto cosi non (a,b) calcola angolo in radianti
        return to_string(r) + " (cos(" + to_string(teta) + ") + i*sin(" + to_string(teta) + "))";
    }
};

int main()
{

    Complex z1(2, 4);
    Complex z2(3, 2);

    Complex somma(1, 1);
    somma = z1 + z2;
    cout << "La somma: " << somma.stampa() << endl;
    cout << "La differenza: " << (z1 - z2).stampa() << endl;
    cout << "Moltiplicazione: " << (z1 * z2).stampa() << endl;
    cout << "Moduli:" << z1.mod() << z2.mod() << endl;
    cout << "Coordinate Polari: " << z1.polar() << z2.polar() << endl;

    vector<Complex> numeriFile;
    ifstream fileInput("input.txt");
    if (fileInput.fail())
    {
        cerr << "Errore apertura del file";
        return -1;
    }
    string linea;
    while (getline(fileInput, linea))
    {
        stringstream iss(linea);
        string a, b;

        getline(iss, a, ',');
        getline(iss, b, ',');


        numeriFile.push_back(Complex(stod(a), stod(b)));
    }
    cout << "\nNumeri letti da file:\n";
    for (auto complesso : numeriFile)
    {

        cout << complesso.stampa();
        cout << "     Modulo: " << complesso.mod() << endl;
        cout << "In polari: " << complesso.polar() << endl;
    }

    return 0;
}

