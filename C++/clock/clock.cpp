#include <iostream>
#include <chrono>
#include <thread>
using namespace std;
using namespace std::this_thread;
using namespace std::chrono;

//SIMULA UN OROLOGIO IN OOP

class ICounter
{ // interfaccia
public:
    virtual void reset() = 0;
    virtual int increment() = 0;
    virtual int getVal() = 0;
};

class DigitCounter : public ICounter
{
private:
    int val = 0;      // valore corrente, che viene incrementato ogni volta
    int resetVal = 0; // valore massimo dove quando raggiunto, viene azzerato il contatore

public:
    DigitCounter(int value)
    { // costruttore si poteva fare: DigitCounter(int value) : resetVal(value) {}

        resetVal = value; // il valore massimo (24 o 60) viene passato quando istanzio oggetto
    }
    void reset()
    {
        val = 0;
    }

    int increment()
    {
        val = val + 1;
        if (val == resetVal)    //reset val è i vari 60 o 24
        { // se raggiunge il valore massimo, resetto
            reset();
            return 1;
        }
        return 0;
    }
    int getVal()
    {
        return val;
    }
};

class Clock
{ // rappresente l'orologio

private:
    /*ICounter digits[3] = {new DigitCounter(24)
                             , new DigitCounter(60)
                             , new DigitCounter(60)
                             };*/

    DigitCounter digits[3] = {DigitCounter(24), DigitCounter(60), DigitCounter(60)};
    // 24 sono le ore
    // 60 i minuti
    // 60 i secondi
public:
    void tick()
    {
        if (digits[2].increment())  //se i secondi raggiungo il resetval=60, fa incrementare i minuti, a resettare ci pensa la funzione increment 
        {
            if (digits[1].increment())  //se raggiunge il set val=60 minuti, incrementa le ore
            {
                digits[0].increment();  //devo incremnetare le ore
            }
        }
    }
    void printTime()
    {
        cout << "orario --> " << digits[0].getVal() << ":" << digits[1].getVal() << ":" << digits[2].getVal() << endl;
    }
};

int main()
{
    Clock c;

    while (true) // sempre
    {
        c.printTime();
        c.tick();

        sleep_until(system_clock::now() + seconds(1));
    }

    return 0;
}

/*
system_clock::now(): Ottiene il tempo corrente secondo l'orologio di sistema.
seconds(1): Crea un intervallo di un secondo.
system_clock::now() + seconds(1): Calcola un punto nel tempo che è esattamente un secondo dopo l'orario corrente.
sleep_until(...): Fa attendere il programma fino a quando l'orologio di sistema raggiunge il momento specificato come argomento.
*/