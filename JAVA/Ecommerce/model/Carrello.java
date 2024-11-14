package model;

import java.util.ArrayList; //importali entrambi
import java.util.List;;

public class Carrello {

    private List<Prodotto> prodotti = new ArrayList<>(); // liste di prodotto
    private double somma;

    public void aggiungiProdotto(Prodotto prodotto) { // aggiunge al carello

        prodotti.add(prodotto);

    }

    public void rimuoviProdotto(Prodotto prodotto) {

        prodotti.remove(prodotto);

    }

    public void calcolaTotale() {

        somma = 0;

        for (Prodotto prodotto : prodotti) {
            somma = somma + prodotto.getPrezzo();

        }

    }

    public List<Prodotto> getProdotti() { // lista prodotti nel carello

        return prodotti;

    }

    // Implementa un metodo toString() per stampare i dettagli del carrello
    // (prodotti e totale

    public String toString() {
        calcolaTotale();
        for (Prodotto prodotto : prodotti) {
            System.out.println(prodotto);
        }

        return "Prezzo totale: " + somma + "euro";
    }

}
