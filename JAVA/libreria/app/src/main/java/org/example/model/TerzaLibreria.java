package org.example.model;

import java.util.HashMap;
import java.util.Map;

public class TerzaLibreria implements GestioneLibreria{

    protected Map<String,Libro> map= new HashMap<>();   //chiave è il titolo, valore è un libro che comprende più attributi

    public void aggiungiLibro(Libro libro){
        if (map.containsKey(libro.getTitolo())) {
            System.out.println("Il libro è già presente nella libreria.");
        } else {
            map.put(libro.getTitolo(), libro);
        }
    }

    public void rimuoviLibro(String titolo){

        map.remove(titolo);//rimuove libro con quel titolo

    }

    public Libro cercaLibro(String titolo){
        return map.get(titolo);// Restituisce il libro associato al titolo, o null se non esiste

    }

    public int nroLibri(){

        return map.size();
        /*int i=0;
        for(Map.Entry<String,Libro> entry : map.entrySet()){
            i++;
        }
        return i;*/

    }

    @Override
    public Libro getLibroByIdx(int idx) {
         // Converte la mappa in una lista per ottenere l'elemento all'indice specificato
         if (idx < 1 || idx > map.size()) {
            System.out.println("Indice fuori dai limiti.");
            return null;
        }
        return (Libro) map.values().toArray()[idx - 1];
    }

    

   
}


/*
 *  for(Map.Entry<String,Libro> entry : map.entrySet()){    //ieterare così

}
 */

//entrySet() è un metodo di Map che restituisce un insieme di tutte le coppie chiave-valore presenti nella mappa
//Map.Entry è una classe interna dell'interfaccia Map che rappresenta una singola coppia chiave-valore.
//La variabile entry in questo caso rappresenta una singola coppia chiave-valore ad ogni iterazione del ciclo. In altre parole, entry è un oggetto che ha due componenti:
//Chiave (di tipo String in questo caso)
//Valore (di tipo Libro in questo caso)