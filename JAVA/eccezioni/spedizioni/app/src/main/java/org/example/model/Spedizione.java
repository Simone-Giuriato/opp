package org.example.model;

public class Spedizione implements ISpedizione {

    private int id;
    private String destinatario;
    private String indirizzo;

    public Spedizione( int id, String destinatario, String indirizzo){
        this.id=id;
        this.destinatario=destinatario;
        this.indirizzo=indirizzo;

    }
    @Override
    public int getId(){
        return id;
    }

    @Override
    public String getDestinatario(){
        return destinatario;
    }

    @Override
    public String getIndirizzo(){
        return indirizzo;
    }

    public String toString(){
        return id + ": " + destinatario + " " + indirizzo;
    }



}
