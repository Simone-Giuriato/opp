#include <iostream>
#include <string>
using namespace std;

void stampa(string s)
{
    cout << "RISULTATO: " << s << endl;
}

int main()
{

    string s = "questa è una prova";

    s.append(" di un append"); //.append--> mette in fondo ciò che metto
    stampa(s);

    s.resize(25); // modifica la lunghezza della stringa s a 25 caratteri. Con l'append avrò 38 caratteri, RESIZE toglie fino al carattere che dico.
    stampa(s);
    s.resize(19); // torno alla stringa di partenza (con spazio finale)

    stampa(s);

    int l = 0;
    l = s.length(); // metto in l, la lunghezza della stringa (utile nei for)

    stampa(to_string(l));   //Quando chiami to_string con uno di questi tipi, la funzione converte il valore numerico in una stringa. (poi lo scrive sempre come numero, ma è una stringa)

    cout << "primo carattere: " << s[0] << endl;

    stampa(s.substr(0, 6)); // Viene estratta la sottostringa che inizia dall'indice 0 (il primo carattere, 'q') e comprende i successivi 6 caratteri.
    // La sottostringa risultante sarà "questa".

    stampa(s.replace(10, 9, "un test"));    //s.replace(10, 9, "un test") sostituisce i 9 caratteri a partire dalla posizione 10 con la stringa "un test", 
    //risultando in "questa è un test"

    //s.replace(da quale carattere, quanti caratteri, con che cosa)

    return 0;
}