package org.example.models;

import org.example.interfaces.Merce;

public class Vestito implements Merce {
    private int peso;
    private String modello;
    private String taglia;

    public Vestito(int peso, String modello, String taglia) {
        this.peso = peso;
        this.modello = modello;
        this.taglia = taglia;
    }

    @Override
    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Vestito{" +
                "peso=" + peso +
                ", modello='" + modello + '\'' +
                ", taglia='" + taglia + '\'' +
                '}';
    }
}
