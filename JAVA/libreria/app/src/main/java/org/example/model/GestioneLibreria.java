package org.example.model;

public interface GestioneLibreria {

    public String toString();

    public int nroLibri();

    public Libro getLibroByIdx(int idx);

    public void aggiungiLibro(Libro libro);

    public void rimuoviLibro(String titolo);

    public Libro cercaLibro(String titolo);

}
