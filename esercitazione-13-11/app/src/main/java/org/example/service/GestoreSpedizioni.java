package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.exceptions.SpedizioneNonTrovataException;
import org.example.model.Spedizione;

public class GestoreSpedizioni {

    private static GestoreSpedizioni instance;
    List<Spedizione> gs;

    private GestoreSpedizioni() {

        gs = new ArrayList<>();

    }

    public static GestoreSpedizioni getInstance() {
        if (instance == null) {
            instance = new GestoreSpedizioni();
        }
        return instance;
    }

    // aggiungere

    public void aggiungiSpedizione(Spedizione instance) {

        gs.add(instance);

    }
    // visualizzare tutte{}

    public void visualizzaSpedizioni() {

        for (Spedizione spedizione : gs) {
            System.out.println(spedizione);

        }

    }

    // cercrae per id
    public Spedizione  cercaSpedizione (int id) throws SpedizioneNonTrovataException {

        for (Spedizione spedizione : gs) {
            if (spedizione.getId() == id) {
                return spedizione;  // Se trova la spedizione, la restituisce
            }
        }
        // Se non trova la spedizione, lancia l'eccezione
        throw new SpedizioneNonTrovataException("Spedizione con ID " + id + " non trovata.");

    }

}

/*
 * Nel metodo cercaSpedizione della classe GestoreSpedizioni, la logica è quella di cercare una spedizione con un determinato id.
 *  Se la spedizione non viene trovata, il metodo lancia l'eccezione SpedizioneNonTrovataException.
 * Notare che il metodo è stato dichiarato con throws SpedizioneNonTrovataException,
 *  il che significa che il metodo può lanciare questa eccezione e che il chiamante (nel caso il main) deve occuparsi della sua gestione.
 */
