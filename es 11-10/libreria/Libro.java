package libreria;

public class Libro {

    private String titolo;
    private String autore;
    private int annoPubblicazione;

    public Libro() {

    }

    public Libro(String titolo, String autore, int annoPubblicazione) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;

    }

    public String getTitolo() {
        return this.titolo;
    }

    public String getAutore() {
        return this.autore;
    }

    public int getAnnoPubblicazione() {
        return this.annoPubblicazione;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public String toString() {
        return this.titolo + ", " + this.autore + ", " + this.annoPubblicazione;
    }

}