package org.example.model;

public class Camion extends MezzoDiTrasporto {
    private int numeroAssi;

    public Camion(String id, double portataMassima, String tipoCarburante, int numeroAssi) {
        super(id, portataMassima, tipoCarburante);
        this.numeroAssi = numeroAssi;
    }

    @Override
    public double calcolaCostoPerChilometro() {
        return 1.5 * numeroAssi; // Esempio: 1.5€/km per asse
    }
}
    //Discorso diverso da Drone e FurgoneEcoFriendly, qui ho tipoCarburante infatti in App.java glielo passo