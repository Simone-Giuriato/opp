package org.example.services;

import java.util.ArrayList;
import java.util.List;

import org.example.model.EcoFriendly;
import org.example.model.MezzoDiTrasporto;

public class GestioneLogistica {
    private List<MezzoDiTrasporto> mezzi = new ArrayList<>();

    public void aggiungiMezzo(MezzoDiTrasporto mezzo) {
        mezzi.add(mezzo);
    }

    public void visualizzaMezzi() {
        for (MezzoDiTrasporto mezzo : mezzi) {
            if (mezzo instanceof EcoFriendly eco){
                System.out.println("Ecologico (emissioni): "+eco.livelloEmissioniCO2());
            }
            System.out.println(mezzo.descrizione());
        }
    }

    public void stampaCostoPerDistanza(double distanza) {
        for (MezzoDiTrasporto mezzo : mezzi) {
            System.out.println("Mezzo: "+mezzo.descrizione()+" - "+mezzo.calcolaCostoPerChilometro() * distanza);
        }
    }
}
