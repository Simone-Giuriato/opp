package org.example.model;

public class Libro {

    protected String titolo;
    protected String autore;
    protected Integer annoPubblicazione;
    
    public Libro(){}

    public Libro(String titolo, String autore, Integer annoPubblicazione){
        this.titolo=titolo;
        this.autore=autore;
        this.annoPubblicazione=annoPubblicazione;
    }

    public String getAutore(){
        return this.autore;
    }

    public String getTitolo(){
        return this.titolo;
    }

    public Integer getAnnoPubblicazione(){
        return this.annoPubblicazione;
    }

    public void setTitolo(String titolo){
        this.titolo=titolo;
    }

    public void setAutore(String autore){
        this.autore=autore;
    }

    public void setAnnoPubblicazione(Integer anno){
        this.annoPubblicazione=anno;
    }

    public String toString(){
        return "Titolo: "+this.titolo+", Autore: "+this.autore+", Anno pubblicazione: "+annoPubblicazione;
    }

}
