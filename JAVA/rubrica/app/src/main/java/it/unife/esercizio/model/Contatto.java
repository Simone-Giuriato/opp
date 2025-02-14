package it.unife.esercizio.model;


public class Contatto {
    private String nome;
    private String cognome;
    private Sesso sesso;

    public Contatto(String nome, String cognome, Sesso sesso){
        this.cognome=cognome;
        this.nome=nome;
        this.sesso=sesso;
    }

    public Contatto(){

    }

    public String getNome(){
        return this.nome;
    }
    
    public String getCognome(){
        return this.cognome;
    }

    public Sesso getSesso(){
        return this.sesso;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setCognome(String cognome){
        this.cognome=cognome;
    }

    public void setSesso(Sesso sesso){
        this.sesso=sesso;
    }

   public String toString(){
    return this.nome + ", " + this.cognome + ", " + this.sesso;
   }
    
}
