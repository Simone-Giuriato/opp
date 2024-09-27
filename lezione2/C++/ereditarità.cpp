
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

int main(){
    first f;
    second s;

    f.setValore(10);
    s.setValore2(20);
    s.setValore(8);

    cout << "valore first: "<<f.getValore()<< "\nvalore second: "<< s.getValore()<<endl;
}