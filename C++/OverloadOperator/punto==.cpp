#include <iostream>

using namespace std;

class Punto
{
private:
    int x;
    int y;

public:
    Punto(int vx, int vy)
    {
        x = vx;
        y = vy;
    }

    int getAscissa()
    {
        return x;
    }
    int getOridnata()
    {
        return y;
    }

    bool operator==(Punto p) //== può essere solo true o false
    {                        // sintassi: "tipo" "operator con attaccato il simbolo"()

        if (x == p.x && y == p.y) // x sarebbe this--> ed è la coordinata di chi chiama loperatore(operando sinistro), p.x (operando di destra) che viene passato per argomento
        {
            return true; // se i due punti sono uguali, restituisco true
        }

        return false; // diversi
    }
};

int main()
{
    Punto p1(2, 6);
    Punto p2(2, 6);
    // per verificare cambia le coordinate e verrà che i punti son diversi

    if (p1 == p2) // se true..
    {
        cout << "I punti sono uguali" << endl;
    }
    else
    {
        cout << "I due punti sono diversi" << endl;
    }
}