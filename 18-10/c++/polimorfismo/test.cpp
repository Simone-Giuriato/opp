
// implementato il Polimorfismo poichè stesso nome matodi ma in base alle classi eseguono formule/case diverse
#include <iostream>
#include <math.h>

using namespace std;

class Forma
{ // classe astratta di cui non verrà mai creata un'istanza

public:
    virtual double perimetro() = 0; // virtual metodo()=0;
    virtual double area() = 0;
};

class Quadrato : public Forma
{ // quadrato figlia/eredita da forma, ma ne definisce altri di parametri risp a forma che magari non ha

private:
    int lato;

public:
    Quadrato(int x)
    { // Costruttore classe quadrato
        lato = x;
    }

    double perimetro()
    {
        return lato * 4;
    }

    double area()
    {
        return lato * lato;
    }
};

class Cerchio : public Forma
{ // Cerchio figlia di Forma

private:
    double raggio;

public:
    double perimetro()
    {
        return 2 * raggio * M_PI;       //M_PI è pigreco, ho implementato la liobreria
    }

    double area()
    {
        return raggio * M_PI * raggio;
    }

    Cerchio(int x)      //costruttore, specificandolo non c'è piu quello di default
    {
        raggio = x;
    }
};

int main()
{
    Quadrato q(10); //devo specificare i parametro per il costruttore che ho fatto, se c'è quello di default, niente parametri
    Cerchio c(10); // gli passo raggio perchè parametro del costrutore

    cout << "Periemtro: " << q.perimetro() << endl;
    cout << "Area: " << q.area() << endl;

    cout << "Circonferenza: " << c.perimetro() << endl;
    cout << "Area: " << c.area() << endl;

    return 0;
}