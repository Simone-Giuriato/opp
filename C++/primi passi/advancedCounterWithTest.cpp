//Esempio di 2 Incrementi in OOP
//si specifica

#include <iostream>

using namespace std;

class Counter   //sora di Interfaccia
{

    //private: int val=0; non posso metterlo perchè le altre classi non lo vederebbero (private visto solo nella sua classe, non nelle eredi)
public:
    virtual void reset()=0;
    virtual int get() = 0; // =0 indica che la classe è astratta, quando metti virtual, metti anche =0;
    virtual void set() = 0;//astratta--> non ha implemnetazione, quando la "importo in altre classi", devo fare un implemnetazione
};

// OVVERRIDE--> sono sicuro che quel metodo vada a  sovrascrivere il metodo astratto, posso anche non metterlo ma devo essere sicuro non sia una distrazione/accidentale
class SingleIncrement : public Counter
{//BISOGNA METTERE : public "nome classe padre"

private:
    int val = 0;

public:
    void reset() override
    {
        val = 0;
    }
    void set() override
    {
        val++;
    }
    int get() override
    {
        return val;
    }
};

class DoubleIncrement : public Counter{

    private: int val=0;

    public:
    void reset(){
        val=0;
    };
    void set(){
        val+=2;
    }
    int get(){
        return val;
    }

};

void testCounter(Counter* c, string titolo) {
   

    cout<<titolo<<endl;
    cout <<"valore iniziale: "<< c->get()<<endl;    //avendo un puntatore non posso fare c.get() ma uso la freccetta ->
    c->set();
    c->set();
    cout<<"Dopo 2 incrementi: "<<c->get()<<endl;
    c->reset();
    cout<<"Dopo il reset: "<<c->get()<<endl;
    cout<<endl;
}//ho passato un puntatore Counter poichè la classe Counter è astratta e quindi non posso istanziare per valore
//se nelle classi Single Increment o Double ho altri metodi, che non fanno parte di Counter ecco che non posso più istanziarli con c, perchè il punattaore permette di usare solo i metodi che sono definiti nella classe Counter virtuali
//una soluzione potrebbe essere un dynamic Cast, o definire tutti i metodi (se in comune) nella classe Counter padre
int main()

{
    SingleIncrement c1;
    DoubleIncrement c2;


    testCounter(&c1,"Singolo incremento: ");
    testCounter(&c2, "Doppio Incremento: ");

    //oopure faccio:
    /*Sounter* c1 = new SingleIncrement(); //creo oggetto Single Increment, e lo assegno al puntatore
    Sounter* c2 = new SoubleIncrement();

    testCounter(c1, "-- Esempio contatore singolo --");
    testCounter(c2, "-- Esempio contatore doppio --");*/

    return 0;
}