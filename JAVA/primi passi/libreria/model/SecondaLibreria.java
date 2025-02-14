////Gestione Libreria implementata con liste

package model;

import java.util.ArrayList;
import java.util.List;

public class SecondaLibreria implements GestioneLibreria{
    List<Libro> libri=new ArrayList<>();

    @Override
    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    @Override
    public void rimuoviLibro(String titolo) {
        libri.removeIf(libro -> libro.getTitolo().equalsIgnoreCase(titolo));
    }

    @Override
    public Libro cercaLibro(String titolo) {
        return libri
        .stream()
        .filter(libro -> 
        libro.getTitolo().equalsIgnoreCase(titolo))
        .findFirst().orElse(null);
    }

    @Override
    public String toString(){
        StringBuilder ret=new StringBuilder();
        libri.forEach(libro -> {
            ret.append(" - ");
            ret.append(libro);
        });
        return ret.toString();
    }

    @Override
    public int nroLibri() {
        return libri.size();
    }

    @Override
    public Libro getLibroByIdx(int idx) {
        return libri.get(idx-1);
    }

}
