/*
 * Il Singleton è un pattern creazionale che assicura che una classe abbia una
sola istanza e fornisce un punto globale di accesso ad essa.
• Utilità: Ideale quando si deve garantire che solo una singola istanza di una
classe sia creata durante l'intero ciclo di vita dell'applicazione (es. gestione
della connessione al database).
Vantaggi del Singleton:
• Garantisce il controllo su una singola istanza dell'oggetto.
• Riduce il consumo di risorse evitando creazioni multiple.
 */
package model;

import java.util.ArrayList;
import java.util.List;

public class Inventario { // Utilizza il pattern singleton per questa classe, in modo che ci sia un'unica
                          // istanza di inventario.

    private List<Prodotto> prodottiDisponibili = new ArrayList<>();
    private static Inventario istanza; // faccio l'istanzia (fa parte per implemnetare singleton), sarà l unica istanza

    public static Inventario getIstanza() { // va fatto sempre per implementare singlenton, se è null, istanzio oggetto
       //è una sorta di costruttore
        if (istanza == null) {
            istanza = new Inventario();
        }
        return istanza;

    }

    public void aggiungiProdotto(Prodotto prodotto) { // aggiunge all inventario

        prodottiDisponibili.add(prodotto);
    }

    public List<Prodotto> cercaProdottoCategoria(Categoria categoria) { // per ottenere tutti i prodotti di una data
                                                                        // categoria
        List<Prodotto> prodittiCategoria = new ArrayList<>();
        Prodotto prodotto;

        for (int i = 0; i < prodottiDisponibili.size(); i++) {

            prodotto = prodottiDisponibili.get(i); // .get(i) è come array[i]
            if (prodotto.getCategoria().equals(categoria)) {    //richiamo un metodo di prodotto per sapere la categoria
                prodittiCategoria.add(prodotto);
            }

        }
        return prodittiCategoria;
    }

    /*
     * public List<Prodotto> cercaProdottiPerCategoria(Categoria categoria) {
     * List<Prodotto> prodottiCategoria = new ArrayList<>();
     * for (Prodotto prodotto : prodottiDisponibili) { con foreach itero cosi
     * if (prodotto.getCategoria().equals(categoria)) {
     * prodottiCategoria.add(prodotto);
     * }
     * }
     * return prodottiCategoria;
     * }
     */

    public void mostraInventario() { // stampare prodotti disponibili

        if (prodottiDisponibili.isEmpty()== true) {
            System.out.println("L'inventario è vuoto");
        } else {
            for (Prodotto prodotto : prodottiDisponibili) { // Prodotto prodotto, rappresenta ogni prodotto preso in
                                                            // considerazione nella lista
                                                            // : "in"
                                                            // prodottiDisponibili: è la collezione (in questo caso, una
                                                            // lista) su cui stiamo iterando.
                System.out.println(prodotto);
            }
        }

    }

}
