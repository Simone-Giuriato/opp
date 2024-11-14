package model;

import model.Sesso.TipoSesso;

public class Contatto {

    private String nome;
    private String cognome;
    private TipoSesso sesso; // enum della classe Sesso

    public Contatto(String nome, String cognome, TipoSesso sesso) { // costruttore
        this.nome = nome;
        this.cognome = cognome;
        this.sesso = sesso;
    }

    /*
     * public Contatto(){
     * 
     * }
     */

    public String getNome() {
        return nome; // this.nome uguale

    }

    public String getCognomeome() {
        return cognome; // this.nome uguale

    }

    public TipoSesso getSesso() {
        return sesso; // this.nome uguale

    }

    public void setNome(String stringa) {
        this.nome = stringa;
    }

    public void setCognome(String stringa) {

        cognome = stringa;

    }

    public void setSesso(TipoSesso sex) {
        this.sesso = sex; // con this o senza non cambia basta capirsi
    }

    public String toString() {
        return nome + ", " + cognome + ", " + sesso; // anche this.nome + ","...
    }

    /*
     * SE non metto il toString, java usa il suo toString e stampa questo
     * model.Contatto@3764951d
     * model.Contatto@4b1210ee
     * model.Contatto@4d7e1886
     * 
     */

}
