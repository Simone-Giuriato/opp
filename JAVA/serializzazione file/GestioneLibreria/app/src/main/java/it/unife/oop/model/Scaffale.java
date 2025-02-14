package it.unife.oop.model;

public class Scaffale {

    protected String codice;
    protected int capienza;

    public String getCodice(){
        return this.codice;
    }

    public int getCapienza(){
        return this.capienza;
    }

    public void setCodice(String codice){
        this.codice=codice;
    }

    public void setCapienza(int capienza){
        this.capienza=capienza;
    }

    public Scaffale(){}

    public Scaffale(String codice, int capienza){
        this.codice=codice;
        this.capienza=capienza;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Scaffale "+codice+" - Capienza "+capienza);
        return sb.toString();
    }

}
