//CIAO MONDO fatto con le classi
#include <iostream>

//Il costruttore non lo mettiamo, non serve esplecitarlo è di default

//using namespace std;
//questo comando sopra mi farebbe togliere std dai vari cout... (endl--> endline fa parte degli std, fare come si vuole)
//forse meglio fare using namespace

class Saluto
{ // creo la classe Saluto, non dare nomi che possano interferire come include, std...

    public:
        void metodo(){
            std::cout<<"Ciao Mondo"<<std::endl;
        }

};

int main()
{
    Saluto sal; //istanzio la classe
    sal.metodo();   //richiamo il metodo della classe Saluto

    return 0;
}

// private--> cosa privata dell'oggetto, utilizzabile solo dall'oggetto in questione... non posso richiamarla dall'esterno
// public--> visti dall'esterno