package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Imbarco {
    private String codiceVolo;
    private List<Passeggero> passeggeri;

    public Imbarco(String codiceVolo){
        this.codiceVolo=codiceVolo;
        passeggeri= new ArrayList<>();
    }

    public void aggiungiPasseggero(Passeggero p){
        passeggeri.add(p);
    }

    public String getCodiceVolo(){
        return codiceVolo;
    }

    public void setCodiceVolo(String codiceVolo){
        this.codiceVolo=codiceVolo;

    }

    public List<Passeggero> getListPassegegri(){
        return passeggeri;
    }

}
