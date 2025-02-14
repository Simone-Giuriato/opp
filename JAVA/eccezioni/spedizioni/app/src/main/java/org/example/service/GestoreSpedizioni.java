package org.example.service;

import java.util.*;

import org.example.exceptions.SpedizioneNonTrovataException;
import org.example.model.*;

public class GestoreSpedizioni {

    private static GestoreSpedizioni instance;
    private List<Spedizione> spedizioni;

    private GestoreSpedizioni() {
        spedizioni = new ArrayList<>();

    }

    public static GestoreSpedizioni getInstance() {
        if (instance == null) {
            instance = new GestoreSpedizioni();
        }
        return instance;
    }

    public void aggiungiSpedizione(Spedizione s){
        spedizioni.add(s);
    }

    public void visualizzaSpedizioni(){
        for(Spedizione s: spedizioni){
            System.out.println(s);
        }
    }

    public Spedizione cercaSpedizione(int id) throws SpedizioneNonTrovataException{
        for(Spedizione s: spedizioni){
            if(s.getId()==id){
                return s;
            }

        }
        throw new SpedizioneNonTrovataException("Spedizione con ID " + id + " non trovata");
        //return null;
        //mettendo throw new non serve che metta return null, comunico all utente che non ho trovato nada
   
    }

}

//throws SpedizioneNonTrovataException indica che il metodo può generare un'eccezione di tipo SpedizioneNonTrovataException


//throw new SpedizioneNonTrovataException("Spedizione con ID " + id + " non trovata");
//Se il ciclo for termina senza trovare una spedizione con quell'ID, il metodo genera un'eccezione di tipo SpedizioneNonTrovataException.

//Se la spedizione non esiste, il metodo solleva un'eccezione (throw), interrompendo il flusso normale del programma. va in app. java dove c'è il  catch