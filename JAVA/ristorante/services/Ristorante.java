package services;

import java.util.HashMap;
import java.util.Map;

import model.Ordine;

public class Ristorante {

     private Map<Integer, Ordine> ordini;
    private int numeroOrdineCorrente;

    public Ristorante() {
        ordini = new HashMap<>();
        numeroOrdineCorrente = 1;
    }

    public void aggiungiOrdine(Ordine ordine) {
        //: implementare il metodo di aggiunta nuovo ordine
        ordini.put(numeroOrdineCorrente, ordine);
        numeroOrdineCorrente++;     //aumento indice della map
    }

    public Ordine getOrdine(int numeroOrdine) { 
        //: implementare il metodo che restituisce l'ordine in base al numer ordine
        return ordini.get(numeroOrdine);
    }

    public void visualizzaTuttiGliOrdini() {
        //: implementare il metodo che stampa tutti gli ordini
        for(int numeroOrdine: ordini.keySet()){
            Ordine ordine=ordini.get(numeroOrdine); // Otteniamo il valore (Ordine) usando la chiave
            System.out.println("Ordine #" + numeroOrdine + ": " );
            ordine.visualizzaOrdine();
        }
    }

}



/*Il metodo keySet() restituisce un insieme di tutte le chiavi presenti nella mappa.
Questo per accedere a ciascun ordine. 
numero ordine corrisponderebbe alla chiave integer della hashmap*/
