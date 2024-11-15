package org.example.model;

public class Spedizione  implements ISpedizione{
    private int id;
    private String destinatario;
    private String indirizzo;

    public Spedizione(int id, String destinatario, String indirizzo){
        this.id=id;
        this.destinatario=destinatario;
        this.indirizzo=indirizzo;
    }

    public int getId(){
        return id;
    } 

    public String getDestinatario(){
        return destinatario;
    } 

    public String getIndirizzo(){
        return indirizzo;
    } 

    public String toString(){
        return "id: " + id+"destinatario: " +destinatario+ "indirizzo: "+indirizzo;
    }

}
