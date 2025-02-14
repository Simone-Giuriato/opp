package it.unife.appello2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.management.openmbean.ArrayType;

public class Squadra extends BaseEntity implements Valutabile{

private List<Giocatore> giocatori;

public Squadra(String nome) {
    super(nome);
    giocatori=new ArrayList<>();
   
}

public void aggiungiGiocatore(Giocatore g){
    giocatori.add(g);
}

//implementare costruttore, getter, setter ed eventuali altri metodi.

    public void mostraGiocatoriOrdinati() {
        //implementare la logica con stampa su System.out
        Collections.sort(giocatori);
        for(Giocatore g: giocatori){
            System.out.println(g.descrivi());
        }
    }

    @Override
    public double valore() {
        double valore=0;
        for(Giocatore g : giocatori){
            valore=valore+g.valore();
        }
        return valore;
    }

    @Override
    public String descrivi() {
        return "Squadra: " + getNome() + " - Valore: " + valore();
    }

    
}
