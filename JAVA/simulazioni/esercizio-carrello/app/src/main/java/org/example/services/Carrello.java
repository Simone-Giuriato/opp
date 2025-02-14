package org.example.services;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.example.model.Articolo;


public class Carrello {
    private static Carrello instance;
    private List<Articolo> articoli;

    private Carrello() {
        articoli = new ArrayList<>();
    }

    public static Carrello getInstance() {
        if (instance == null) {
            instance = new Carrello();
        }
        return instance;
    }

    public void aggiungiArticolo(Articolo articolo) {
        articoli.add(articolo);
    }

    public void stampaArticoliOrdinatiPerPrezzo() {
        articoli.sort(Comparator.comparingDouble(Articolo::getPrezzo));
        stampaArticoli();
    }

    public void stampaArticoliOrdinatiPerCategoria() {
        articoli.sort(Comparator.comparing(Articolo::getCategoria));
        stampaArticoli();
    }

    private void stampaArticoli() {
        for (Articolo articolo : articoli) {
            System.out.println("Nome: " + articolo.getNome() + ", Prezzo: " + articolo.getPrezzo() + ", Categoria: " + articolo.getCategoria());
        }
    }

    
}