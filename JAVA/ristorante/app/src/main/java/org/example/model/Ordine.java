package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Ordine {

    private List<ElementoMenu> elementi;

    public Ordine() {
        elementi = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoMenu elemento) {
        elementi.add(elemento);
    }

    public double calcolaTotale() {
        double totale = 0;
        for (ElementoMenu e : elementi) {
            totale = totale + e.getPrezzo();

        }
        return totale;
    }

    public List<ElementoMenu> filtraPerTipo(TipoPiatto tipo) {
        // implementare il metodo di ricerca elementi dell'ordine in base al tipo piatto
        List<ElementoMenu> stessotipo = new ArrayList<>();
        for (ElementoMenu e : elementi) {
            if (e.getTipo() == tipo) {
                stessotipo.add(e);
            }
        }
        return stessotipo;
    }

    public void visualizzaOrdine() {
        //implementare il metodo che stampa tutti gli elementi dell'ordine
        if (elementi.isEmpty()) {
            System.out.println("Orinde è vuoto!!!");
        } else {
            for (ElementoMenu e : elementi) {
                System.out.println("Elemento:" + e.toString());
            }

        }

    }
}