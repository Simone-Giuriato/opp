#include <iostream>
#include <iomanip>
#include <vector>
using namespace std;
//OVERLOAD operatori riguardante una matrice
//other.data[][] si riferisce alla matrice passata per argomento (matrice di destra rispetto all'operatore)
//data[][] è la matrice corrente quella con this diciamo    (matrice di sinistra che chiama l'operatore)

class Matrice
{
private:
    int data[10][10];
    int righe, colonne;

public:
    Matrice(int r, int c)
    {
        righe = r;
        colonne = c;

        for (int i = 0; i < r; i++)
        {
            for (int j = 0; j < c; j++)
            {
                data[i][j] = 0;
            }
        }
    }

    int getElement(int r, int c)
    {
        if (r < 0 || r > righe || c < 0 || c > colonne)
        {
            throw std::invalid_argument("valori non concessi"); //gestisce l'eccezione, dadnone avviso
        }
        return data[r][c];
    }

    void setElement(int r, int c, int value)
    {
        if (r < 0 || r > righe || c < 0 || c > colonne)
        {
            throw std::invalid_argument("valori non concessi");
        }
        data[r][c] = value;
    }

    void printMatrice()
    {
        for (int i = 0; i < righe; i++)
        {
            for (int k = 0; k < colonne; k++)
            {
                cout << "------";
            }
            cout << "-" << endl;
            for (int j = 0; j < colonne; j++)
            {
                cout << "|" << setw(4) << data[i][j] << " ";
            }
            cout << "|" << endl;
        }
        for (int k = 0; k < colonne; k++)
        {
            cout << "------";
        }
        cout << "-" << endl;
    }

    // overload dell'operatore ()
    // gestisce due funzionalità:
    //  -- il recupero di un elemento nella forma M(riga, colonna)
    //  -- il suo assegnamento M(riga, colonna) = valore
    // per ottenere la prima funzionalità si effettua l'overload dell'operatore () passando due argomenti
    // per implementare la seconda funzionalità si setta come valore di ritorno il riferimento al valore intero e non solo il valore stesso (tramite operatore unario &)
    int &operator()(int r, int c)
    {
        return data[r][c];
    }

    bool operator==(Matrice other)
    {

        if (righe != other.righe || colonne != other.colonne){
            return false;
        }

            for (int i = 0; i < righe; i++)
            {
                for (int j = 0; j < colonne; j++)
                {
                    if (other.data[i][j] != data[i][j])
                        
                    return false;
                }
            }
        return true;
        
        // due matrici risultano uguali se:
        //  -- hanno lo stesso numero di righe
        //  -- hanno lo stesso numero di colonne
        //  -- hanno gli stessi elementi nelle stesse posizioni
    }

    Matrice operator+(Matrice &other)
    {
         if (righe != other.righe || colonne != other.colonne) {
            throw std::invalid_argument("Le matrici devono avere la stessa dimensione per la somma.");
        }
        Matrice result(righe, colonne);
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < colonne; j++) {
                result(i, j) = data[i][j] + other.data[i][j];
            }
        }
        return result;
        
        // la somma S tra due matrici M e N si può effettuare solo in queste condizioni:
        //  -- le matrici M e N hanno lo stesso numero di righe e lo stesso numero di colonne
        //  -- la matrice somma S è composta da elementi di questo valore: S(r, c) = M(r, c) + N(r, c), quindi ogni elemento della matrice somma
        //     è la somma dei rispettivi elementi di M e N in quella posizione
    }

    Matrice operator*(Matrice &other)
    
    {
        if (colonne != other.righe) {
            throw std::invalid_argument("Il numero di colonne della prima matrice deve essere uguale al numero di righe della seconda.");
        }
        Matrice result(righe,other.colonne);
        for (int i = 0; i < righe; i++) {
            for (int j = 0; j < other.colonne; j++) {
                result(i, j) = 0; // Inizializza l'elemento
                for (int k = 0; k < colonne; k++) {
                    result(i, j) += data[i][k] * other.data[k][j]; // Somma i prodotti
                }
            }
        }
        return result;
        
        
        // il prodotto P tra due matrici M e N si può effettuare solo in queste condizioni:
        //  -- il numero di colonne della matrice M deve essere uguale al numero di righe della matrice N. Il prodotto avrà il numero di righe della
        //     prima e il numero di colonne della seconda [ M(r, x) * N(x, c) = P(r, c) ]
        //  -- l'elemento in posizione r e c della patrice prodotto P [ P(r, c) ] è la somma dei prodotti tra ogni elemento della riga r di M e il rispettivo della colonna c di N
        // TIP
        // usare due cicli annidati per ciclare tra tutte le righe della prima matrice M e tra tutte le colonne della seconda N
        // ed usare un terzo ciclo per fare la somma dei prodotti dei rispettivi elementi
    }

    static Matrice identity(int size)
    {
         Matrice result(size, size);
         for(int i=0;i<size;i++){
            for(int j=0; j<size;j++){
                if(i==j){
                    result(i,j)=1;
                }else{
                    result(i,j)=0;
                }

            }
         }
         return result;
        
        // questo costruttore statico (non dipendente quindi dall'istanza della classe ma disponibile come membro richiamabile come Matrice::identity(x))
        // genera una matrice Identità. La matrice identità I è una matrice quadrata (righe = colonne) che ha tutti gli elementi pari a 0 tranne quelli
        // della diagonale principale (gli elementi con righa = colonna) che saranno pari a 1
        // ogni prodotto con la matrice identità restituisce la matrice iniziale: se P = M * I allora P = M
    }
};

int main()
{
    Matrice M = Matrice(2, 2);
    M(0, 0) = 1;
    M(0, 1) = 2;
    M(1, 0) = 0;
    M(1, 1) = -1;

    Matrice N = Matrice(2, 2);
    N(0, 0) = 3;
    N(0, 1) = -2;
    N(1, 0) = 1;
    N(1, 1) = 0;

    M.printMatrice();
    /*
    mi aspetto:
    | 1  2 |
    | 0 -1 |
    */

    N.printMatrice();
    /*
    mi aspetto:
    | 3 -2 |
    | 1  0 |
    */

    Matrice S(2, 2);
    S = M + N;

    S.printMatrice();
    /*
    mi aspetto:
    | 4  0 |
    | 1 -1 |
    */

    Matrice P(2, 2);
    P = M * N;

    P.printMatrice();
    /*
    mi aspetto:
    | 5 -2 |
    |-1  0 |
    */

    Matrice I = Matrice::identity(2);

    I.printMatrice();
    /*
    mi aspetto:
    | 1  0 |
    | 0  1 |
    */

    Matrice T(2, 2);
    T = M * I;

    if (T == M)
    {
        cout << "la matrice identità è corretta" << endl;
    }
}