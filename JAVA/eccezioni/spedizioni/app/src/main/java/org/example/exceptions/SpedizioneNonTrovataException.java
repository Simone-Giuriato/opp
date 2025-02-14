package org.example.exceptions;

public class SpedizioneNonTrovataException extends Exception {

    public SpedizioneNonTrovataException(String message){   //costruttore personalizzato
        super(message);
    }
//message rappresenta il messaggio d’errore che verrà associato all'eccezione.
//La riga super(message); chiama il costruttore della classe madre (Exception) passando il messaggio. è prassi così
}


/*
 * STEP di un eccezione:
 * 
 * Definisco una classe col nome di eccezione che voglio generare che ESTENDE la classe Exception
 * (si fa così di base)
 * 
 * in App.java eseguo del codice dentro un try
 * se so che puo andare storto qualcosa metto un catch
 * 
 * App.java mentre esgue il SUO codice richiama un metodo del gestore
 * Questo metodo sa che può generare un eccezzione con throws nella firma...
 * 
 * nella casistica che ci sia l eccezzione come il "Non trovare una cosa"
 * genera un messaggio che voglio stapare con throw new
 * 
 * Torno in App.java e sono nel catch perchè non ho trovato nulla, istanzio la classe dell eccezzione
 * e stampo il messaggio del gestore con System.err(getMessage());
 * 
 * 
 */