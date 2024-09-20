#include <iostream>

using namespace std;

class Counter
{
private:    //lo stato ovvero le variabili sono private
    int val = 0;

public:
    
    void reset()
    {
        val = 0;
        
    }

    void setVal(int valoreIniziale){
        val=valoreIniziale;
    }

    int getVal(){

    }
};

int main()
{
    Counter count;
    //count.val=0;  NON POSSO PERCHÈ val è private
    
    count.reset();
    cout<<"Valore reset:" << count.getVal()<<endl;
    count.setVal(10);

   
    

    return 0;
}

//PRIVATE E PUBLIC servono per chiunque NON SIA l'oggetto Counter, all'interno dell'oggetto poso usare le cose private