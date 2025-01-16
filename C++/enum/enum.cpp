#include <iostream>
using namespace std;

enum space_coords : char {x = 'x', y = 'y', z = 'z'};   //space_cord tipo enumerato
int main()
{
    cout << "Coordinata x: " <<  x << endl; //vince enum perchè non ho ancora dichiarato la variabile che mi crea problemi

    char x = 'f';   //conflitto, stesso nome che ho nell'enum. Vince la variabile dichiarata poi

    cout << "Variabile x: " << x << endl;
    cout << "Coordinata asse::x: " << (char) space_coords::x << endl;   //per far vincere enum

    return 0;
}