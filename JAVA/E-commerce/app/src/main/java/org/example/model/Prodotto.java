package org.example.model;

public class Prodotto implements Scontabile {

    private String nome;
    private double prezzo;
    private Categoria categoria;

    public Prodotto(String nome, double prezzo, Categoria categoria) {
        this.nome = nome;
        this.categoria = categoria;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String toString() {
        return nome + ", " + prezzo + ", " + categoria;
    }

    @Override
    public double applicaSconto(double percentuale) {

        if (percentuale > 0 && percentuale <= 100) {
            prezzo = prezzo - ((prezzo * percentuale) / 100);   //l'attributo prezzo si modifica cosi

        }
        return prezzo;  //ritorno inutile 

    }

}
