
//EREDITÀ SINGOLA
#include <iostream>

using namespace std;

class first{

    private:
    int valore=0;

    public:
    int getValore(){
        return valore;

    }
    void setValore(int val){
        valore=val;
    }
};

class second : public first{

    private:
    int valore2=0;

    public:
    int getValore2(){
        return valore2;
    }

    void setValore2(int val){
        valore2=val;
    }
};

class third: public first, public second{
        //non fa nulla ma eredita da 2 classi--> MULTIPLA   (dovrebbe)


};

int main(){
    

    third t;//la classe third di suo non fa nulla, ma eredita dalle altre 2
    t.setValore(10);

    cout << "valore first: "<<t.getValore()<<endl;

    //non so perche non vada

}