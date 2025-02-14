package org.example.model;

public class PasseggeroBase  implements Passeggero {
    private String nome;
    private String cognome;
    private String numeroPassaporto;

    //implementare costruttore, getter e setter

    public PasseggeroBase(String nome, String cognome, String numeroPassaporto){
        this.nome=nome;
        this.cognome=cognome;
        this.numeroPassaporto=numeroPassaporto;

    }

    @Override
    public String toString() {
        return nome + " " + cognome + " (Passaporto: " + numeroPassaporto + ")";
    }

    @Override
    public String getNome() {
      return nome;
    }

    @Override
    public String getCognome() {
       return cognome;
    }

    @Override
    public String getNumeroPassaporto() {
       return numeroPassaporto;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public void setCognome(String cognome){
        this.cognome=cognome;
    }
    public void setNumeroPassaporto(String numeroPassaporto){
        this.numeroPassaporto=numeroPassaporto;
    }
}