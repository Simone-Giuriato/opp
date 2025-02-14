//come creare || rinominare || eliminare un file;
//come recuperare il percorso file || permessi || dimensione || metadati
//come gestire lettura || scrittura di un file di testo
//migliorare le prestazioni usando buffer
//copia spostamento e e lettura di interi file

//import fondamentali:
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

@SuppressWarnings("unused")
public class GestioneFile {
    
public static void main(String[]args){
    //apertura file || verifica file esistente o che non sia una cartella || eliminazione file
    {
    //dichiarazione della variabile associata al file
    //File [nome_Varabile] = new File("percosoFile.estensione");
    File file = new File("C:\\Users\\lucab\\Desktop\\cpp_e_java\\java\\java_per_i_cazzi_miei\\es_midali\\GestioneDiUnFile\\prova.txt");
    
    //ritorna true <=> ha trovato il percorso file (quindi con il "!" se non lo trova mi viene segnalato errore)
    if(!file.exists()){
        System.out.println("errore nell'apertura del file");
        
    }
    
    //controllo che sia effetivamente un file e non una cartella o cose strane (metto il parametro "!" solo perchè è più efficente) 
    if (!file.isFile()) {
        System.out.println("questo che stai controllando non è un file");
    }else
        System.out.println("si questo è un file");

    //eliminazione di un file. N.B.: non serve immettere nel metodo un percorso perche è gia all'interno alla istanza file
    //file.delete();
    }

    //apertura di un file non in sola lettura ma anche in scrittura, in caso non esista me lo crea
    {
    try{
        FileWriter writer = new FileWriter("prova.txt");
        //scrittura di una riga nel file:
        //questo metodo cancella quello che c'è nel file e riscrive solo quello che gli sto dicendo nel metodo 
        writer.write("hello world.\nThis is a line");
        //mentre con questo metodo  aggiunge in coda al file
        writer.append(", mentre questa frase è stata inserita dopo");
        writer.append("\nPure questa è stata messa dopo");
        //necessaria la chiusura del file sennò la scrittura fatta dai metodi va persa
        writer.close();
    }catch (IOException e){
        e.printStackTrace();
    }
    }   

    //apertura del file in sola lettura    
    {
    try{
        FileReader reader = new FileReader("prova.txt");
        //con le prossime due righe ho inserito il valore in ascci del primo carattere in data
        int data = reader.read();
        System.out.println("il valore ascii del primo carattere è: "+data);

        System.out.println("\nil testo completo invece è:");
        while (data!= -1) {
            //conversione da codice ascii a lettera con stampa
            System.out.print((char)data);
            //passaggio al carattere successivo
            data = reader.read();
        }
        reader.close();
    }catch (FileNotFoundException e){
        e.printStackTrace();;
    }catch (IOException e){
        e.printStackTrace();
    }
    }   

    //cazzatine che puoi fare con il file:
    {
        File file = new File("prova.txt");
        if (file.exists()) {
            System.out.println("Nome: " + file.getName());
            System.out.println("Path: " + file.getAbsolutePath());
            System.out.println("Lunghezza in bytes: " + file.length());
            System.out.println("Eliminazione riuscita: " + file.delete());
        }else
            System.out.println("il file non esiste");
    }

}
}
