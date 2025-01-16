#include <iostream>
#include <fstream>
#include <vector>
using namespace std;


int main(){

    ofstream outputFile("esempio.txt",ios::out);    //ios:out sovrascrive ogni volta
//ios::app scrive dopo, oltre al contenuto del file gia presente
    if(outputFile.fail()){
        cerr<<"Errore nell'apertura del file";
        return -1;
    }

    outputFile<<"Simone Giuriato"<<endl;
    outputFile<<"Domenico Berardi"<<endl;

    outputFile.close();


    ifstream inputFile("esempio.txt");
    if(inputFile.fail()){
        cerr<<"Errore nell'apertura del file in lettura\n";    //cerr è come cout ma scrive nello standard di errore (piu figo)
        return -1;  
    }
    string lineaInput;

    vector<string> elenco;
    while(getline(inputFile,lineaInput)){
        cout<<lineaInput<<endl;
        elenco.push_back(lineaInput);

    }
    cout<<"Contenuto del vettore (e del file)\n:";
    for(auto i: elenco){
        cout<<i<<endl;
    }

    inputFile.close();
    return 0;

}

/*
std::ios::in: Modalità lettura (default per std::ifstream).

std::ios::out: Modalità scrittura (default per std::ofstream).

std::ios::app: Scrittura in append.

std::ios::trunc: Cancella il contenuto del file esistente (default per std::ofstream).

std::ios::binary: Modalità binaria.
*/

