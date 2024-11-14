package model;


public class Prodotto implements Scontabile {

    private String nome;
    private double prezzo;
    private Categoria categoria; //enum

    public Prodotto(String nome, double prezzo, Categoria categoria){      //costruttore
        this.nome=nome;
        this.prezzo=prezzo;
        this.categoria=categoria;
    }

    public void applicaSconto(double percentuale){  //implemento Scontabile

        prezzo=prezzo-((percentuale*prezzo)/100);


    }

    public String getNome(){
        return nome;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public String toString(){
        return "Nome prodotto: " + nome +" Prezzo: "+ prezzo+ " Categoria: "+categoria;
    }


    

   

}
