/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.exceptions.SpedizioneNonTrovataException;
import org.example.model.ISpedizione;
import org.example.model.Spedizione;
import org.example.service.GestoreSpedizioni;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        Spedizione s1= new Spedizione(1, "Mario Rossi", "Via Roma 1, Milano");
        Spedizione s2= new Spedizione(2, "Luca Bianchi", "Via Verdi 5, Torino") ; 
        GestoreSpedizioni gestore = GestoreSpedizioni.getInstance();

        // Aggiungiamo alcune spedizioni
        gestore.aggiungiSpedizione(s1);
        gestore.aggiungiSpedizione(s2);

        // Visualizza tutte le spedizioni
        System.out.println("Lista spedizioni:");
        gestore.visualizzaSpedizioni();

        // Cerca una spedizione per ID
        try {
            ISpedizione spedizione = gestore.cercaSpedizione(1);
            System.out.println("Spedizione trovata: " + spedizione);
        } catch (SpedizioneNonTrovataException e) {
            System.err.println(e.getMessage());
        }

        // Prova a cercare una spedizione inesistente
        try {
            ISpedizione spedizione = gestore.cercaSpedizione(3);
            System.out.println("Spedizione trovata: " + spedizione);
        } catch (SpedizioneNonTrovataException e) {
            System.err.println(e.getMessage());
        }
    }
}


/*Nel metodo main della classe App, hai un blocco try-catch che gestisce l'eccezione che potrebbe essere lanciata dal metodo cercaSpedizione. */

/*
 * Blocco try:

    All'interno del blocco try, viene invocato il metodo cercaSpedizione per cercare una spedizione. Se la spedizione esiste (ID trovato), la stampa.
    Nel primo try, viene cercato l'ID 1, che esiste. Quindi, il programma stampa la spedizione.
    Nel secondo try, viene cercato l'ID 3, che non esiste. In questo caso, il metodo cercaSpedizione lancerà un'eccezione (SpedizioneNonTrovataException).

Blocco catch:

    Quando l'eccezione viene lanciata, il controllo passa al blocco catch.
    L'oggetto e è un'istanza dell'eccezione SpedizioneNonTrovataException e viene gestito stampando il suo messaggio di errore (e.getMessage()).
    Nel caso dell'ID non trovato (3), il programma stampa il messaggio di errore: Spedizione con ID 3 non trovata.
 */