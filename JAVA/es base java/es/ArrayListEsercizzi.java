import java.util.ArrayList;
public class ArrayListEsercizzi {


    static void displayList(ArrayList<Integer> Array){
        for(int numeri : Array){
            System.out.print(numeri+" ");
            System.out.println();
        }
    }

    //i valori impostati in un arraylist vanno passati per riferimento
    static void trovaMassimo(ArrayList<Integer> array){
        int massimo=-1;
        for(int numeri : array){
            if (numeri>massimo) {
                massimo=numeri;
            }
        }
        System.out.println("il valore massimo è "+massimo);
    }   
    
    static void trovaMinimo(ArrayList<Integer> Array){
        int minimo=0;
        boolean primo=true;
        for(int numeri : Array){
            if (minimo>numeri || primo) {
                minimo=numeri;
            }
        }
        System.out.println("il valore minimo è "+minimo);
    }

    static void valoreMedio(ArrayList<Integer> Array){
        float media=0;
        for(int numeri : Array)
            media=media+numeri;
        media=media/(Array.size());
        System.out.println("grandezza array: "+Array.size());
        System.out.println("la media dei valori dell'array è uguale a: "+media);
    }

    static void CopiaArray(int[] primoArray, int[] secondo){
        if (primoArray.length==secondo.length) {
            for(int i=0; i<primoArray.length; i++){
                secondo[i]=primoArray[i];
            }
        }else
            System.out.println("i due array hanno dimensione diversa");
        
    }

    static void VerificaContenuto(ArrayList<Integer> Array, int x){
        boolean controllo=false;
        for(int numeri : Array){
            if (x==numeri || !controllo) {
                System.out.println("il numero è presente");
            }
        }
    }

    static void InversioneOrdine(ArrayList<Integer> Array, ArrayList<Integer> ArrayInverso){
        int[] copiaInversa = new int[Array.size()];
        int contatore=copiaInversa.length-1;
        for(int numeri : Array){
            copiaInversa[contatore]=numeri;
            contatore--;
        }
        
        for(int i=0; i<Array.size(); i++){
            ArrayInverso.add(copiaInversa[i]);
        }
    }

    static void SommaDiArrayPerElemento(int[] primo, int[] secondo, ArrayList<Integer>  somma){
        for(int i=0; i<primo.length; i++){
            somma.add((primo[i]+secondo[i]));
        }
        System.out.print("l'arraylist somma è: ");
        displayList(somma);
    }
    
    static void PosizioneDiUnElemento(ArrayList<Integer> Array, int x){
        int posizione=1;
        for(int numeri : Array){
            if (numeri==x) {
                System.out.println("l'elemento è in posizione: "+posizione);
            }
        }
    }
    
    
    
    public static void main(){
        ArrayList<Integer> prova = new ArrayList<Integer>();
        prova.add(8);
        prova.add(5);

        displayList(prova);
        
        trovaMassimo(prova);

        trovaMinimo(prova);

        valoreMedio(prova);

        VerificaContenuto(prova, 5);

        ArrayList<Integer> Inversa = new ArrayList<>();
        InversioneOrdine(prova, Inversa);
        displayList(Inversa);

        ArrayList<Integer> somma = new ArrayList<>();
        int[] secondoArray= {9,8,7,6,5,4,3,2,1};
        int[] primoArray= {1,2,3,4,5,6,7,8,9};
        SommaDiArrayPerElemento(primoArray, secondoArray, somma);

        PosizioneDiUnElemento(prova, 5);

        CopiaArray(primoArray, secondoArray);
    }



}
