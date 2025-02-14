package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class SecondaLibreria implements GestioneLibreria {

    protected List<Libro> libri = new ArrayList<>();
//va bene costruttore default
    public void aggiungiLibro(Libro libro) {
        libri.add(libro);
    }

    public void rimuoviLibro(String titolo) {

        for( Libro l: libri){
            if(l.getTitolo().equalsIgnoreCase(titolo)){
                libri.remove(l);
                break;
            }
        }
        //libri.removeIf(libro -> libro.getTitolo().equalsIgnoreCase(titolo));
        // "Per ogni elemento della collezione libri, chiamiamo quell'elemento libro
        // e applichiamo la logica definita a destra dell'operatore -> che sarebbe se il
        // get titolo è il titolo passato."

    }

    public Libro cercaLibro(String titolo){
        for(Libro l :libri){
            if(l.getTitolo().equalsIgnoreCase(titolo)){
                return l;
            }
        }
        return null;    //nessun libro trovato
    }

    @Override   //posso fare a meno di mettere @Override
    public int nroLibri() {
        /*int i=0;
        for(Libro l: libri){
            
            i++;
        }
        return i;*/

        return libri.size();
        
    }

    @Override
    public Libro getLibroByIdx(int idx) {

        return libri.get(idx-1);    //io parto da indice 0, quindi l id 2 dell utente(che parte da 1) sarebbe l'1 mio
       
    }

    

}