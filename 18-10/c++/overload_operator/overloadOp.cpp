//Overload dell'operatore ==

#include <iostream>

using namespace std;

class Punto{
    private:
    int x,y;

    public:
    Punto(int vx,int vy){
        x=vx;
        y=vy;
    }

    int getAscissa(){
        return x;
    }

    int getOrdinata(){
        return y;
    }

    bool operator==(Punto p){      //overload operatore ==, si scrive cosi
        //return false;  se faccio così mi darà sempre se sono diversi

        return p.x==x && p.y==y;    //x operatore destra== x sinistra, se così mi da true


    }



};

int main(){

    Punto p1(4,2);  //istanzio 2 punti
    Punto p2(3,-5); //per verificare, ed è giusto, metti 2 punti uguali
    

   

    if(p1==p2){

        cout<<"Sono uguali"<<endl;

    }else{
        cout<<"Sono diversi"<<endl;
    }
    return 0;
}