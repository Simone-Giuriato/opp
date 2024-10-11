package libreria;

public interface GestioneLibreria {

    public void aggiungiLibro(Libro libro);

    public void rimuoviLibro(String titolo);

    public Libro cercaLibro(String titolo);
    public String toString();

}
