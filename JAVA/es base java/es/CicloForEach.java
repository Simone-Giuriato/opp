/* il ciclo foreach è molto utile per quando vuoi gestire o modificare un insieme
 * di elementi come quello di un array senza dover gestire manualmente un indice
 * di un for in maniera manuale  
*/

/* syntax:
 * for([type_element] [element] : [collection_name]){
 *      instruction
 * }
*/
import java.util.ArrayList;
import java.util.List;

public class CicloForEach {
    
    static int CalcoloSommaConForEach(int insieme[]){
        int somma=0;
        for(int numero : insieme)
            somma=somma+numero;
        System.out.println("la somma sei valori è: "+somma);
        return somma;
    }

    static void StampaVocale(String frase){
        int NumeroVocali=0;
        for(char carattere : frase.toCharArray()){
            if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u' || carattere == 'A' || carattere == 'E' || carattere == 'I' || carattere == 'O' || carattere == 'U') {
                NumeroVocali++;
            }
        }
        System.out.println("la frase ha "+NumeroVocali+" vocali");
    }

    static float CalcolaMediaVoti(int[] x){
        float media=0;
        media=CalcoloSommaConForEach(x)/x.length;
        return (media);
    }

    static void conteggioParole(String[] parole, String parola){
        int conteggio=0;
        for(String controllo : parole){
            if (controllo.equals(parola)) {
                conteggio++;
            }
        }
        System.out.println("la parola "+parola+" è presente "+conteggio+" volte");
    }



    public static void main(){
        //esempio creazione ed utilizzo
        int[] numeri= {1, 2, 3, 4, 5, 6};
        String frase="non ho idea di cosa scrivere, quindi scriverò cose a caso";
        for(int numero : numeri){
            System.out.print(numero+" ");
        }

        CalcoloSommaConForEach(numeri);

        //StampaVocale(frase);
        StampaVocale(frase);

        //stampa lista
        CalcolaMediaVoti(numeri);

        //Stampa di una Lista
        List<String> Lista = new ArrayList<>();
        Lista.add("ciao");
        Lista.add("mondo");
        Lista.add("java");

        for(String parola : Lista)
            System.out.print(parola+" ");
        System.out.println();

        String[] insieme = {"parole", "a", "caso", "scriverò", "scriverò", "per", "un", "poco"};
        conteggioParole(insieme, "scriverò");

        



    }
}
