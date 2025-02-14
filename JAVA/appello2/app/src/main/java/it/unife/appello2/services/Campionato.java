package it.unife.appello2.services;

import java.util.HashMap;
import java.util.Map;

import it.unife.appello2.model.Squadra;

public class Campionato {
    
    private Map<String, Squadra> squadre;
    private static Campionato instance;

    //implementare Singleton, e completare la logica dei metodi

    private Campionato(){
        squadre=new HashMap<>();
    }

    public static Campionato getInstance(){
        if(instance==null){
            instance=new Campionato();
        }
        return instance;
    }

    public void aggiungiSquadra(Squadra squadra) {
        squadre.put(squadra.getNome(), squadra);
    }

    public void mostraTutteLeSquadre() {
        //implementare stampa delle squadre su System.out. Usare il metodo "descrivi" per mostrare il dettaglio delle squadre.

        for(Squadra squadra: squadre.values()){
            System.out.println(squadra.descrivi());
        }
    }
}
