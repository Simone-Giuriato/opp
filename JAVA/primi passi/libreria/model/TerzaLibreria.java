//Gestione Libreria implementata con array
/*
 * implementate una versione di GestioneLibreria che utilizza un HashMap<String, Libro> 
 * per memorizzare i vari libri presenti in libreria (come chiave usiamo il titolo del libro)
 */
package model;
import java.util.HashMap;
import java.util.Map;

public class TerzaLibreria implements GestioneLibreria {
    // HashMap che utilizza il titolo come chiave e l'oggetto Libro come valore
    private Map<String, Libro> libri = new HashMap<>();

    @Override
    public void aggiungiLibro(Libro libro) {
        // Aggiunge il libro nella mappa usando il titolo come chiave
        if (libri.containsKey(libro.getTitolo())) {
            System.out.println("Il libro è già presente nella libreria.");
        } else {
            libri.put(libro.getTitolo(), libro);
        }
    }

    @Override
    public void rimuoviLibro(String titolo) {
        // Rimuove il libro dalla mappa usando il titolo come chiave
        if (libri.remove(titolo) == null) {
            System.out.println("Libro non trovato.");
        }
    }

    @Override
    public Libro cercaLibro(String titolo) {
        // Cerca e restituisce il libro corrispondente al titolo specificato
        return libri.getOrDefault(titolo, null);
    }

    @Override
    public int nroLibri() {
        // Restituisce il numero di libri presenti nella mappa
        return libri.size();
    }

    @Override
    public Libro getLibroByIdx(int idx) {
        // Converte la mappa in una lista per ottenere l'elemento all'indice specificato
        if (idx < 1 || idx > libri.size()) {
            System.out.println("Indice fuori dai limiti.");
            return null;
        }
        return (Libro) libri.values().toArray()[idx - 1];
    }

    @Override
    public String toString() {
        // Genera una stringa con i dettagli di tutti i libri nella libreria
        StringBuilder sb = new StringBuilder("Libri in libreria:\n");
        libri.values().forEach(libro -> sb.append(" - ").append(libro).append("\n"));
        return sb.toString();
    }

}
