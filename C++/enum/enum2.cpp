#include <iostream>
using namespace std;

enum colore {rosso, verde, blu};    //enum semplice, assegna default i numeri alle parole, 0,1,2    (usa questo)
enum frutta : int {pera, mela, banana}; // con frutta:int dico io di assegnare gli int (potrei aver messo anche char)
enum class forme : int {quadrato, rettangolo, cerchio}; //altro metodo più sicuro

int main() {
    colore c = rosso;   //c ha il rosso(0)
    int pera = frutta::pera;    //assegna valore pera(0) alla variabile pera
    int rosso = 6;//sovrascrivendo il nome dell'enumerazione rosso (vince 6)
    int test = static_cast<int>(forme::cerchio);    //Converti forme::cerchio in int, il che restituisce 2

    cout << "colore: " << rosso << endl;

    cout << "frutta: " << pera << endl;

    cout << "forma: " << test << endl;
    return 0;
}