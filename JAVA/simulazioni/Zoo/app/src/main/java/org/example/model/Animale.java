package org.example.model;

public abstract class Animale {

    protected String nome;
    protected Razza razza;

    public Animale(String nome, Razza razza){
        this.nome=nome;
        this.razza=razza;
    }

    public String getNome(){
        return nome;
    }

    public Razza getRazza(){    //questi 2 get non cambiano per i tipi di animali
        return razza;
    }

    public abstract String verso(); //questo cambierà per ogni TIPO di animale(mammifero, pesce, volatile)

}
