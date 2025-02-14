package org.example.services;

import java.util.HashMap;
import java.util.Map;

import org.example.model.Ordine;

public class Ristorante {

    private Map<Integer, Ordine> ordini;
    private int numeroOrdineCorrente;

    public Ristorante() {
        ordini = new HashMap<>();
        numeroOrdineCorrente = 1;   //una sorta di id ordine, fa da chiave
    }

    public void aggiungiOrdine(Ordine ordine) {
        // metodo di aggiunta nuovo ordine
        ordini.put(numeroOrdineCorrente, ordine);
        numeroOrdineCorrente++; //aumento l id per l ordine successivo
    }

    public Ordine getOrdine(int numeroOrdine) { 
        //metodo che restituisce l'ordine in base al numer ordine
        return ordini.get(numeroOrdineCorrente); //in base all id mi restituisce la coppia id-ordine
    }

    public void visualizzaTuttiGliOrdini() {
        //metodo che stampa tutti gli ordini

        for(int numeroOrdine : ordini.keySet()){    //keySet() tutte le chiavi (è un int), e per ogni chiave quindi ogni ordine
            Ordine ordine= ordini.get(numeroOrdine);    //per ogni chiave che rappresenta un ordine, mi tiro fuori l ordine formato dai vari elementi
            System.out.println("Ordine: #" + numeroOrdine + " ");   //stampo l id dell ordine
            ordine.visualizzaOrdine();  //col tostring della classe Ordine stampo i vari elementi dell ordine
            
        }
        
    }
}
