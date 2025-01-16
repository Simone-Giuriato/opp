#include <iostream>

using namespace std;

class Counter
{
private: // lo stato ovvero le variabili sono private
    int val = 0;

public:
    void reset()
    {
        val = 0;
    }

    void setVal(int valoreIniziale)
    {
        val = valoreIniziale;
    }

    int getVal()
    {
        return val;
    }
    void increment(){
        val++;
    }
};

int main()
{
    Counter count;
    // count.val=0;  NON POSSO PERCHÈ val è private
    cout << "Valore iniziale:" << count.getVal() << endl;

    count.increment();
    count.increment();
    cout << "Valore dopo 2 incrementi:" << count.getVal() << endl;

    count.reset();
    cout << "Valore dopo reset reset:" << count.getVal() << endl;
   
    count.setVal(20);
    cout << "Valore dopo setVal reset:" <<  count.getVal() << endl;

    return 0;
}

// PRIVATE E PUBLIC servono per chiunque NON SIA l'oggetto Counter, all'interno dell'oggetto poso usare le cose private