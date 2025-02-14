package org.example;

import org.example.model.Carrello;
import org.example.model.Categoria;
import org.example.model.Prodotto;
import org.example.service.Inventario;


public class App{
    public static void main(String[] args){
         // Creazione inventario
         Inventario inventario = Inventario.getInstance();
         Prodotto p1 = new Prodotto("Laptop", 1200, Categoria.ELETTRONICA);
         Prodotto p2 = new Prodotto("T-Shirt", 20, Categoria.ABBIGLIAMENTO);
         Prodotto p3 = new Prodotto("Mela", 10, Categoria.ALIMENTARI);
         Prodotto p4 = new Prodotto("Geografia", 28, Categoria.LIBRI);
         inventario.aggiungiProdotto(p1);
         inventario.aggiungiProdotto(p2);
         inventario.aggiungiProdotto(p3);
         inventario.aggiungiProdotto(p4);
         inventario.mostraInventario();
        System.out.println("\nRicerca prodotto appartententi alla categoria:" +Categoria.ABBIGLIAMENTO);
         System.out.println(inventario.cercaPrdottiPerCategoria(Categoria.ABBIGLIAMENTO));
 
         // Creazione carrello
         Carrello carrello = new Carrello();
         carrello.aggiungiProdotto(p1);
         carrello.aggiungiProdotto(p3);

         System.out.println("\nRIEPILOGO CARRELLO:");
         System.out.println(carrello.getProdotti());
 
         // Applicazione sconto
         p1.applicaSconto(50);  //50% di sconto
 
         // Mostra carrello e totale
         System.out.println("Elementi in carrello:");
         carrello.getProdotti();
         System.out.println("Prezzo totale del carrello: " + carrello.calcolaTotale());
    }
}
