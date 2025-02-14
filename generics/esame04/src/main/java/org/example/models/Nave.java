package org.example.models;

import java.util.ArrayList;

public class Nave<T> {
    private ArrayList<T> carico = new ArrayList<>();

    public void aggiungiCarico(T oggetto) {
        carico.add(oggetto);
    }

    public void distintaDiCarico() {
        carico.forEach(oggetto -> {
            System.out.println(oggetto.toString());
        });
    }
}
