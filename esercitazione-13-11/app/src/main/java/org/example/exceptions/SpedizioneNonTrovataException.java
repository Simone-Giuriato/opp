package org.example.exceptions;

public class SpedizioneNonTrovataException extends Exception {
    public SpedizioneNonTrovataException(String message) {
        super(message);
    }
}

/*Prima di tutto, hai creato un'eccezione personalizzata, SpedizioneNonTrovataException. 
Si tratta di un'eccezione che viene lanciata quando una spedizione con un certo ID non viene trovata nel gestore. 
Questa classe estende la classe Exception di Java, il che significa che può essere utilizzata come un'eccezione standard. 
Quando la spedizione non viene trovata nel gestore, questa eccezione viene "lanciata" con un messaggio che indica l'errore*/