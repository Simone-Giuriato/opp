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

import model.GestioneLibreria;
import model.Libro;
import model.MiaLibreria;
import model.SecondaLibreria;
import model.TerzaLibreria;

public class App {

    public static void main(String[] args) {
        
        Libro l1=new Libro("Titolo 1", "AAA", 1950);
        Libro l2=new Libro("Titolo 2", "BBBB", 1960);
        Libro l3=new Libro("Titolo 3", "CCC", 1970);
        Libro l4=new Libro("Titolo 4", "DDDD", 1980);
        Libro l5=new Libro("Titolo 5", "EEEE", 1990);
        Libro l6=new Libro("Titolo 6", "FFFF", 2000);
        
        //Mia libreria con array
       GestioneLibreria libreria=new MiaLibreria();
        libreria.aggiungiLibro(l1);
        libreria.aggiungiLibro(l2);
        libreria.aggiungiLibro(l3);
        libreria.aggiungiLibro(l4);
        libreria.aggiungiLibro(l5);
        libreria.aggiungiLibro(l6); //libro in più che non ci sta quindi messaggio d erroe (non ho piu spazio)
        
        
        libreria.rimuoviLibro("Titolo 2");
        
        System.out.println(libreria.cercaLibro("Titolo 4"));      
        
        System.out.println("La libreria contiene: "+libreria.nroLibri());   //ho 4 libri, perche erano 5 ma ho rimosso il 2
        
        System.out.println("Il secondo libro è: "+libreria.getLibroByIdx(2));   //con 2 mi da null, perchè l ho rimosso prima
        
        System.out.println("FINE");


        //implemento SECONDA LIBRERIA, fatto con le liste

        /*GestioneLibreria libreria=new SecondaLibreria();
        libreria.aggiungiLibro(l1);
        libreria.aggiungiLibro(l2);
        libreria.aggiungiLibro(l3);
        libreria.aggiungiLibro(l4);
        libreria.aggiungiLibro(l5);
        libreria.aggiungiLibro(l6); //libro in più che non ci sta quindi messaggio d erroe (non ho piu spazio)
        
        
        libreria.rimuoviLibro("Titolo 2");
        
        System.out.println(libreria.cercaLibro("Titolo 4"));      
        
        System.out.println("La libreria contiene: "+libreria.nroLibri());   //ho 4 libri, perche erano 5 ma ho rimosso il 2
        
        System.out.println("Il secondo libro è: "+libreria.getLibroByIdx(2));   //con 2 mi da null, perchè l ho rimosso prima
        
        System.out.println("FINE");

        //Terza Libreria gestita da Hash Map

        GestioneLibreria libreria=new TerzaLibreria();
        libreria.aggiungiLibro(l1);
        libreria.aggiungiLibro(l2);
        libreria.aggiungiLibro(l3);
        libreria.aggiungiLibro(l4);
        libreria.aggiungiLibro(l5);
        libreria.aggiungiLibro(l6); //libro in più che non ci sta quindi messaggio d erroe (non ho piu spazio)
        
        
        libreria.rimuoviLibro("Titolo 2");
        
        System.out.println(libreria.cercaLibro("Titolo 4"));      
        
        System.out.println("La libreria contiene: "+libreria.nroLibri());   //ho 4 libri, perche erano 5 ma ho rimosso il 2
        
        System.out.println("Il secondo libro è: "+libreria.getLibroByIdx(2));   //con 2 mi da null, perchè l ho rimosso prima
        
        System.out.println("FINE");*/

    }
    
}
