package it.unife.oop.model;

public class Libro {

    protected int id;
    protected String titolo;
    protected String autore;
    protected TipoLibro tipo;

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getTitolo(){
        return this.titolo;
    }

    public void setTitolo(String titolo){
        this.titolo=titolo;
    }

    public String getAutore(){
        return this.autore;
    }

    public void setAutore(String autore){
        this.autore=autore;
    }

    public TipoLibro getTipo(){
        return this.tipo;
    }

    public void setTipo(TipoLibro tipo){
        this.tipo=tipo;
    }

    public Libro(){}

    public Libro(int id, String titolo, String autore, TipoLibro tipo){
        this.id=id;
        this.titolo=titolo;
        this.autore=autore;
        this.tipo=tipo;
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Titolo: "+titolo);
        sb.append(" - Autore: "+titolo);
        sb.append(" - Tipo: "+tipo);
        return sb.toString();
    }


}
