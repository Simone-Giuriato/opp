package org.example.model;

public abstract class MezzoDiTrasporto {

    protected String id;
    protected double portataMassima;
    protected String tipoCarburante;
    
    public MezzoDiTrasporto(String id, double portataMassima, String tipoCarburante) {
        this.id=id;
        this.portataMassima=portataMassima;
        this.tipoCarburante=tipoCarburante;
    }

    public abstract double calcolaCostoPerChilometro();
    
    public String descrizione() {
        return "ID: " + id + ", Portata: " + portataMassima + " kg, Carburante: " + tipoCarburante;
    }
}