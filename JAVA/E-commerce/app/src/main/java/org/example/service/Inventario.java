package org.example.service;

import java.util.ArrayList;
import java.util.List;

import org.example.model.Categoria;
import org.example.model.Prodotto;

public class Inventario {
    private static Inventario instance;
    protected List<Prodotto> prodottiDisponibili;

    private Inventario() {
        prodottiDisponibili = new ArrayList<>();

    }

    public static Inventario getInstance() {
        if (instance == null) {
            instance = new Inventario();
        }
        return instance;
    }

    public void aggiungiProdotto(Prodotto p) {
        prodottiDisponibili.add(p);
    }

    public List<Prodotto> cercaPrdottiPerCategoria(Categoria categoria) {
        List<Prodotto> category = new ArrayList<>();

        for (Prodotto p : prodottiDisponibili) {
            if (p.getCategoria().equals(categoria)) {
                category.add(p);

            }
        }

        if (category.isEmpty()) {
            System.out.println("Non sono presenti prodotti con questa categoria");
            return null;
        } else {
            return category;
        }

    }

    public void mostraInventario() {
        System.out.println("Prodotti disponibili in Inventario:");
        for (Prodotto p : prodottiDisponibili) {
            System.out.println(p);
        }
    }

    public class getInstance {
    }

}
