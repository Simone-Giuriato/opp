// implementato il Polimorfismo poichè stesso nome matodi ma in base alle classi eseguono formule/case diverse
//per essere sicuro,potrei usare la parola "override" nelle classi figlie quando uso i metodi delle classi padre es. double are() override
#include <iostream>
#include <math.h>

using namespace std;

class Forma
{//classe padre
public:
    virtual double perimetro() = 0;
    virtual double area() = 0;
};

class Quadrato : public Forma{
//figlio 1
    private:
    int lato;

    public:
    Quadrato(int x){
        lato=x;
    }

    double perimetro(){
        return lato*4;
    }
    double area(){
        return lato*lato;
    }

};

class Cerchio : public Forma{
//figlio 2
    private:
    int raggio;

    public:

    Cerchio(int x){
        raggio=x;
    }

    double perimetro(){
        return raggio*M_PI*2;
    }

    double area(){
        return raggio*raggio*M_PI;  //M_PI è il pi greco
    }

};

int main(){
    Quadrato q(5);
    Cerchio c(4);

    cout<<"Perimetro del quadrato: "<<q.perimetro()<<endl;
    cout<<"Area del quadrato: "<<q.area()<<endl;
    cout<<"Circonferenza: "<< c.perimetro()<<endl;
    cout<<"Area del cerchio: "<<c.area()<<endl;
}