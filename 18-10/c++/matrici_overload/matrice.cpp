#include <iostream>
//DA CONCLUDERE 
using namespace std;

class Matrice
{

private:
    int righe, colonne;
    int data[10][10];

public:
    Matrice(int nr, int nc)
    {
        righe = nr;
        colonne = nc;

        for (int r = 0; r < nr; r++)
        {
            for (int c = 0; c < nc; c++)
            {
                data[r][c] = 0;
            }
        }
    }

    /*void printMatrice(int nr, int nc)
    {

        for (int r = 0; r < nr; r++)
        {
            for (int c = 0; c < nc; c++)
            {
                cout<<"------------"<<endl;
            }
        }
    }*/

    int getElemento(int nr, int nc)
    {

        return data[nr][nc];
    }

    void setElemento(int nr, int nc, int val)
    {

        data[nr][nc] = val;
    }

    int operator()(int r, int c)    //setto operatore ()
    {

        return data[r][c];
    }
};

int main()
{
    Matrice M(2, 2);
    M.setElemento(0, 0, 7);
    M.setElemento(0, 1, 9);
    M.setElemento(1, 0, 56);
    M.setElemento(1, 1, 74);

    // come posso fare in questo modo???
    /*
        M(0, 0) = 7;
        M(0, 1) = 9;
        M(1, 0) = 56;
        M(1, 1) = 74;
    */
    // M.printMatrice();
    return 0;
}