import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.DataOutputStream;
import java.io.DataInputStream;

public class GestioneFileBinari {
    


    public static void main(String[] args) {
        
        //le classi principali per l'input e l'output su dei file binari sono FileInputStream e FileOutputStream
        //scrittura su un file binario NB: QUESTI SONO VALORI IN BINARIO
        {
        try {
            //dichiarazione della variabile associata al file binario
            @SuppressWarnings("resource")
            FileOutputStream fileBin = new FileOutputStream("provaBinary.bin");
            byte[] data = {67, 73, 65, 79, 33};
            //scrittura dell'array di byte sul file binario
            fileBin.write(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }
        }
    
        //lettura da un file binario
        {
        try {
            FileInputStream FilebinInput = new FileInputStream("provaBinary.bin");
            int byteRead;
            //viene letto byte per byte per poi venir tradotto in int, nell'output ho messo un char che traduce il valore int del codice ascii tradotto dal binario in un 
            //carattere del codice ascii
            while((byteRead=FilebinInput.read()) != -1){
                System.out.print((char)byteRead+" ");
            }
            System.out.println();
            FilebinInput.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    
        //scrittura di valori primitivi in un file binario (int, double, float, ....)
        {
        try {
            DataOutputStream ScritturaPrimitivi = new DataOutputStream(new FileOutputStream("primitiviBinary.bin"));
            //per la scrittura di dati primiti basta usare il metodo [Variable_name.writeInt(Variable)] dove al posto di Int si mette il tipo di dato primitivo
            ScritturaPrimitivi.writeInt(42);        //scrive un Int nel file in byte
            ScritturaPrimitivi.writeDouble(3.14);   //scrive un valore double in byte
            ScritturaPrimitivi.writeUTF("CIAO!");   //scrittura di una stringa in UTF

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    
    
        //lettura di valori primitivi in un file binario (int, double, float, ....)
        {
        try {
            DataInputStream FileInputBinary = new DataInputStream(new FileInputStream("primitiviBinary.bin"));
            //la lettura del file avviene proceduralmente, quindi in caso di lettura invertita dei valori il metodo restituisce valori sfasati
            int dataInt = FileInputBinary.readInt();
            double dataDouble = FileInputBinary.readDouble();
            String dataMessaggio = FileInputBinary.readUTF();
            System.out.println("i valori primitivi letti dal file binario:");
            System.out.println("int: "+dataInt+"\ndouble: "+dataDouble+"\nfrase: "+dataMessaggio);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }
}



