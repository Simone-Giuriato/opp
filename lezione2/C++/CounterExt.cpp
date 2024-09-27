#include <iostream>

// std::cout <<"Ciao" << std::end1;
// con namespace tolgo std in cout quindi: cout<<"Ciao"<<endl;

using namespace std;

class ICounter
{
public:
    virtual void reset()=0;       //VIRTUAL dice che c'è una cosa che funziona cosi, se noti non metti le graffe
    virtual void increment()=0; //mettere =0 per farlo fuznionare, pe4rche con virtual dico c'è un metodo che non fa nulla, ma deve esserci =0 è OBBLIGATORIO se no da errore
    virtual int getVal()=0;
};

class SingleIncCounter : public ICounter
{ // classe singleIncCounter ESTENDE (i :) alla classe ICounter
private:
    int val;    //stato oggetto, le variabili sempre buona nomra private

public:
    void reset(){
        val=0;
    }

    void increment(){
        val+=2;
    }

    int getVal(){
        return val;
    }
};

int main()
{
   
    ICounter* c1= new SingleIncCounter();   //se ho punattore ad una classe, accedo con -> al metodo e non col punto
    ICounter* c2= new SingleIncCounter();

   

    cout << "Valore inziale: " << c1->getVal() << endl;
    c1->increment();
    c1->increment();
    cout << "Dopo 2 incrementi il valore è: " << c1->getVal() << endl;
    c1->reset();
    cout << "Valore resettato: " << c1->getVal() << endl;

    cout << "Usiamo ora il double conuter: " << c1->getVal() << endl;

    cout << "Valore inziale: " << c2->getVal() << endl;
    c2->increment();
    c2->increment();
    cout << "Dopo 2 incrementi il valore è: " << c2->getVal() << endl;
    c2->reset();
    cout << "Valore resettato: " << c2->getVal() << endl;

    cout << "Usiamo ora il double conuter: " << c2->getVal() << endl;



    
    return 0;
}