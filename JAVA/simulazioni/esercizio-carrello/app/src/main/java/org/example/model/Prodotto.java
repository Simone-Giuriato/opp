package org.example.model;

public class Prodotto implements Articolo {

    protected String nome;
    protected Categoria categoria;
    protected double prezzo;

    
    public Prodotto(String nome,double prezzo, Categoria categoria) {
        this.nome=nome;
        this.prezzo=prezzo;
        this.categoria=categoria;
    }


    @Override
    public String getNome() {
        return nome;
    }


    @Override
    public Double getPrezzo() {
        return prezzo;
    }


    @Override
    public Categoria getCategoria() {
        return categoria;
    }
    
}
