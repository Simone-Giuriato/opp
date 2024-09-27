#include <iostream>

using namespace std;

enum frutta{pera, mela=10, banana};        //enum è insieme di elementi numerato, con una certa definizione, c e c++ danno valore a "pera", "banana"....

int main(){
    frutta f= pera;
    //o faccio quello nell
    int pera=104; //se metto la variabile con il stesso nome dell'elemento dell'enum, DA IMPORTANZA ALLA VARIABILE E non all'oggetto, nomi da nulla perchè pera non è 1 (come nell'enum) ma è 104 detatat dalla variabile

    if(f==frutta::pera){    //oggetto f è uguale all'elemento pera dell'enum? per sorpassare la variabile devo fare "frutta: : pera"    (mettere ::)sifnigicato ::?

        cout << "Ho trovato una pera"<< endl;
        cout <<"il valore è: "<<frutta::pera <<endl;    //valore pera è 0 poichè primo elemento (come negli array) frutta::pera ripetere sempre questo, per superare la variabile
    }

    cout <<"Il valore di banana è:"<<banana<<endl;  //banana è 11 poichè ho dato a mela, l'elemento precedente il valore 10
}


// se non metto frutta:: pera, ma uso solo pera mi prende la variabile pera e non l'elemento dell enum