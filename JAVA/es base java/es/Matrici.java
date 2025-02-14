public class Matrici {
    
    static void SommaArrayNumeri(int[] array){
        int Somma=0;
        for(int numeri : array)
            Somma=Somma+numeri;
        System.out.println("la somma degli elementi è: "+Somma);
    }

    static void ValoreMassimoArray(int[] Matrice){
        int massimo=0;
        for(int numero : Matrice){
            if (numero>massimo) {
                massimo=numero;
            }
        }
        System.out.println("il valore massimo è: "+massimo);
    }

    static void ValoreMinimoArray(int[] Matrice){
        int minimo=0;
        for(int numero : Matrice){
            if (minimo>numero) {
                minimo=numero;
            }
        }
        System.out.println("il numero minimo dell'array è: "+minimo);
    }

    static void CalcoloValoreMedioArray(int[] Matrice){
        int ValoreMedio=0;
        for(int numero : Matrice)
            ValoreMedio=ValoreMedio+numero;

        ValoreMedio=ValoreMedio/Matrice.length;
    }

    static void QuanteVolteUnElementoSiRipete(String[] Matrice, String parola){
        int conteggio=0;
        for(String confronto : Matrice){
            if (confronto.equals(parola)) {
                conteggio++;
            }
        }
        System.out.println("il conteggio della parola viene fatto: "+conteggio+" volte");
    }

    static int[] CopiaArray(int[] Matrice){
        int[] Final = new int[Matrice.length];
        for(int i=0; i<Matrice.length; i++)
            Final[i]=Matrice[i];
        return Final;
    }

    static boolean controlloElemento(int[] Matrice, int x){
        for(int numeri : Matrice){
            if (numeri==x) {
                return true;
            }
        }
        return false;
    }

    static int[] InvertiOrdineArray(int[] Matrice){
        int x=Matrice.length;
        int[] Final= new int[x];
        for(int i=0; i<x; i++){
            Final[x-i]=Matrice[i];
        }
        return Final;
    }

    static int[] SommaArrayPerElemento(int[] Matrice, int[] Array){
        int x=Matrice.length;
        if (x!=Array.length) {
            return null;
        }
        
        int[] Final = new int[x];
        for(int i=0; i<x; i++)
            Final[i]=Matrice[i]+Array[i];
        return Final;
    }

    static void PosizioneElemento(int[] Matrice, int x){
        int controllo=1;
        int i;
        for(i=1; i<=Matrice.length && controllo==1; i++){
            if (x==Matrice[i]) {
                controllo=0;
                i--;
            }
        }
        System.out.println("l'elemento si trova in posizione: "+i);

    }

    static void StampaArray(int[] Matrice){
        for(int numero : Matrice)
            System.out.println(numero+" ");
    }


    public static void main(){
        String[] ArrayStringhe={"parola", "casa", "volpe", "volpe", "parola"};
        int[] Matrice={15, 14, 94, 85, 62};
        int[] CopiaMatrice;
        int[] SommaMatrice;
        int[] Matriceinvertita;
        for(int numeri : Matrice)
            System.out.print(numeri+" ");
        System.out.println();

        SommaArrayNumeri(Matrice);

        ValoreMassimoArray(Matrice);

        ValoreMinimoArray(Matrice);

        CalcoloValoreMedioArray(Matrice);

        QuanteVolteUnElementoSiRipete(ArrayStringhe, "volpe");

        CopiaMatrice=CopiaArray(Matrice);

        if(controlloElemento(Matrice, 42))
            System.out.println("l'elemento è presente nell'array");
        else
            System.out.println("l'elemento non è presente nell'array");

        Matriceinvertita=InvertiOrdineArray(Matrice);

        SommaMatrice=SommaArrayPerElemento(Matrice, CopiaMatrice);

        PosizioneElemento(Matrice, 85);


        //giusto per togliere il warning
        StampaArray(SommaMatrice);
        StampaArray(Matriceinvertita);
    }
}
