import java.util.Scanner;

public class primo{ 


    public static void main(String[]args){
        System.out.println("hello world");

        //tipi di dato:
        //per i dati di tipo numerico ovviamente si possono avere occupazioni di valori diversi ma alla fine si possono riassumere come degli interi o decimali che occupano più bit
        int intero=0;
        String Frase="qusta è una frase";
        //i char vanno solo con caratteri singoli
        char carattere='c';
        double decimale=10.44;
        boolean vero=false;
        System.out.println("i valori sono intero: "+intero+"; decimale: "+decimale+"; la frase: "+Frase+"; carattere: "+carattere+"; e boleano: "+vero+"\n");

        //creazione di un oggetto scanner t.c. mi prenda gli input
        //[data_type] [variable_name] = creazioneOggetto
        Scanner scan = new Scanner(System.in);
        System.out.println("dammi il valore di un numero\n");
        intero=scan.nextInt();
        System.out.println("nuovo valore del numero itnero ma preso da input: "+intero+"\n");



    }


}