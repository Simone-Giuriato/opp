package libreria;


public class Main {

    public static void main(String[] Args){

        Libro l1 = new Libro("fisica", "viola", 2025);
        Libro l2 = new Libro("mate", "viodddddddla", 2024);
        Libro l3 = new Libro("calcio", "ddd", 1525);
        Libro l4 = new Libro("uuuu", "marco", 1985);
        Libro l5 = new Libro("ffffff", "simo", 2025);
       // Libro l6 = new Libro("ffffff", "simo", 2025);

        //System.out.println(l1.toString());

        GestioneLibreria libreria=new MiaLibreria();
        libreria.aggiungiLibro(l1);
        libreria.aggiungiLibro(l2);
        libreria.aggiungiLibro(l3);
        libreria.aggiungiLibro(l4);
        libreria.aggiungiLibro(l5);
        //libreria.aggiungiLibro(l6); // mi dirà non ho piu spazio

        libreria.cercaLibro("mate");


        System.out.println("FINE");

    }
    
}
