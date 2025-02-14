/*
 * Creare classe Libro
 * - titolo: stringa
 * - autore: stringa
 * - annoPubblicazione: int
 * 
 * Costruttore senza argomenti, costruttore con argomenti, getters, setters, toString.
 * 
 * Interfaccia GestioneLibreria
 * metodi: 
 *  - aggiungiLibro: accetta Libro come argomento, non restituisce nulla
 *  - rimuoviLibro: accetta titolo come argomento, non restituisce nulla
 *  - cercaLibro: accetta titolo come argomento e restituisce i Libro
 * 
 * 
 */
package org.example;

import org.example.model.GestioneLibreria;
import org.example.model.Libro;
import org.example.model.MiaLibreria;
import org.example.model.SecondaLibreria;

public class App {

    public static void main(String[] args) {

        Libro l1 = new Libro("Titolo 1", "Tolkien", 1970);
        Libro l2 = new Libro("Titolo 2", "Tolkien", 1970);
        Libro l3 = new Libro("Titolo 3", "Tolkien", 1970);
        Libro l4 = new Libro("Titolo 4", "Tolkien", 1970);
        Libro l5 = new Libro("Titolo 5", "Tolkien", 1970);
        Libro l6 = new Libro("Titolo 6", "Tolkien", 1970);


        System.out.println("\nPRIMA LIBRERIA (ARRAY):");
        GestioneLibreria libreria = new MiaLibreria();
        libreria.aggiungiLibro(l1);
        libreria.aggiungiLibro(l2);
        libreria.aggiungiLibro(l3);
        libreria.aggiungiLibro(l4);
        libreria.aggiungiLibro(l5);
        libreria.aggiungiLibro(l6); // Mia libreria array da 5 dirà non ho piu spazio

        libreria.rimuoviLibro("Titolo 3");

        System.out.println(libreria.cercaLibro("Titolo 2"));

        System.out.println("La libreria contiene: " + libreria.nroLibri()); // 5-1 che è rimosso=4

        System.out.println("Il secondo libro è: " + libreria.getLibroByIdx(2));

        System.out.println("FINE");

        GestioneLibreria libreria2 = new SecondaLibreria();
        System.out.println("\nSECONDA LIBRERIA (LISTE):");
        libreria2.aggiungiLibro(l1);
        libreria2.aggiungiLibro(l2);
        libreria2.aggiungiLibro(l3);
        libreria2.aggiungiLibro(l4);

        System.out.println(libreria2.cercaLibro("Titolo 2"));

        System.out.println("La libreria contiene: " + libreria2.nroLibri()); // 5-1 che è rimosso=4

        System.out.println("Il secondo libro è: " + libreria2.getLibroByIdx(2));

        System.out.println("FINE");

        System.out.println("\nTERZA LIBRERIA (MAP):");

        GestioneLibreria libreria3 = new SecondaLibreria();
    
        libreria3.aggiungiLibro(l1);
        libreria3.aggiungiLibro(l2);
        libreria3.aggiungiLibro(l3);
        libreria3.aggiungiLibro(l4);

        System.out.println(libreria3.cercaLibro("Titolo 2"));

        System.out.println("La libreria contiene: " + libreria3.nroLibri()); // 5-1 che è rimosso=4

        System.out.println("Il secondo libro è: " + libreria3.getLibroByIdx(2));

        System.out.println("FINE");

        


    }
}
