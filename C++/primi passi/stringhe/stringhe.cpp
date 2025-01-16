#include <iostream>
#include <string>

using namespace std;
//Più modi per gestire le stringhe:
int main()
{
    char str[80] = "ciao";  //Qui stai dichiarando un array di caratteri di dimensione 80 e lo stai inizializzando con la stringa "ciao". 
    //C++ aggiunge automaticamente un carattere di terminazione ('\0') alla fine della stringa per indicare dove finisce.

    cout << str << endl;

    char *str2 = "ciao!";   //Qui stai creando un puntatore a una stringa letterale.
    /*Quando dichiari una stringa in C++ utilizzando la sintassi char *str2 = "ciao!";
    il compilatore genera un avviso (warning) perché stai tentando di utilizzare un puntatore a una stringa letterale, 
    che è memorizzata in una sezione di memoria di sola lettura
    In C++, le stringhe letterali (come "ciao!") sono considerate costanti e non possono essere modificate. 
    Sono allocate in una sezione di memoria di sola lettura. Se tenti di modificare una stringa letterale attraverso un puntatore che punta a essa, 
    il comportamento sarà indefinito e può portare a crash del programma.*/
    cout << str2 << endl;

    cout << (str2 +1) << endl; //Qui stai spostando il puntatore str2 in avanti di uno, quindi stampi la stringa a partire dal secondo carattere. Il risultato sarà "iao!".
    //se metti il - stai puntando a un carattere prima dell'inizio della stringa, ed è una cosa non valida
    string s;   //usi il tipo di dato più  moderno string
    s = "CIAO";
    cout << s << endl;
}
