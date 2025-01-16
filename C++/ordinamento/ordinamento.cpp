#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

 template <typename T>
    void bubbleSort(T arr[], int size)
    {
        for (int i = 0; i < size - 1; ++i)
        {
            for (int j = 0; j < size - 1 - i; ++j)
            {
                if (arr[j] > arr[j + 1])        //descrescente: arr[j]<arr[j+1]
                {
                    std::swap(arr[j], arr[j + 1]);
                }
            }
        }
    }

int main()
{

    int num[10];

    int c= sizeof(num)/sizeof(num[0]);

    sort(num,num+c);

    for(int i=0; i<10;i++){
        num[i]=i+1;
    }
    cout<<"Array con sort:"<<endl;
    for(int i=0; i<10;i++){
        cout<<num[i]<<endl;
    }




   std::vector<int> numeri = {5, 3, 8, 1, 2};

    // Ordinamento crescente (default)
    std::sort(numeri.begin(), numeri.end());
    cout<<"\nVettore ordinato con sort: "<<endl;
    // Stampa del vettore ordinato
    for (int num : numeri)
    {
        std::cout << num << "\n";
    }

    
    int dati[10] = {5, 3, 8, 1, 200, 9, 4, 7, 644, 110};

    int n = sizeof(dati) / sizeof(dati[0]);

    // Ordinamento crescente con bubbleSort
    bubbleSort(dati, n);
    cout<<"Array con bbble sort:"<<endl;
    for(int j=0; j<n;j++){
        cout<<dati[j]<<endl;
    }
   

    return 0;
}