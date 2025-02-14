package it.unife.oop.services;

import java.util.*;
import it.unife.oop.model.*;



public class CatalogoBrani {
    private static CatalogoBrani instance;
    private List<Brano> catalogo= new ArrayList<>();

    private CatalogoBrani(){

    }

    public static CatalogoBrani getInstance(){
        if(instance==null){
            instance= new CatalogoBrani();
        }
        return instance;

    }

    public void addBrano(Brano b){
        catalogo.add(b);
    }

   

    public List<Brano> getBrani(){
        return catalogo;
    }

    public void ordinaBrani(){

        Collections.sort(catalogo);

    }

   

   /*
    * Il metodo Collections.sort() è un'utility fornita dalla classe Collections di Java che permette di ordinare una lista.
     Ordina gli elementi di una lista in base al criterio definito nel metodo compareTo() degli oggetti contenuti nella lista.
    */


}
