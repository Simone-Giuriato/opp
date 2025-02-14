package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Carrello {

    protected List<Prodotto> carrello;

    public Carrello() {
        carrello = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        carrello.add(prodotto);

    }

    public void rimuoviProdotto(Prodotto prodotto) {

        carrello.remove(prodotto);

    }

    public double calcolaTotale() {
        double totale = 0;
        for (Prodotto p : carrello) {
            totale = totale + p.getPrezzo();
        }
        return totale;

    }

    public List<Prodotto> getProdotti(){    //ritorna la lista di prodotti nel carrello
        return carrello;
    }

}
