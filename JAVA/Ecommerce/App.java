import model.Carrello;
import model.Categoria;
import model.Inventario;
import model.Prodotto;



public class App {
   

    public static void main(String[] args) {
        // Creazione inventario
        Inventario inventario = Inventario.getIstanza();        //Singlenton vedi Inventario.java per spiegazione, fondamentale gestIstance sia statico
        Prodotto p1 = new Prodotto("Laptop", 1200, Categoria.ELETTRONICA);
        Prodotto p2 = new Prodotto("T-Shirt", 20, Categoria.ABBIGLIAMENTO);
        Prodotto p3 = new Prodotto("TV", 458, Categoria.ELETTRONICA);


        //Aggiungo all'inventario
        inventario.aggiungiProdotto(p1);
        inventario.aggiungiProdotto(p2);
        inventario.aggiungiProdotto(p3);
        System.out.println("Ecco il tuo inventario");
        inventario.mostraInventario();

        // Creazione carrello
        Carrello carrello = new Carrello();
        carrello.aggiungiProdotto(p1);
        carrello.aggiungiProdotto(p3);

        // Applicazione sconto
        p1.applicaSconto(10);
        p3.applicaSconto(75);
    
        System.out.println("Ecco il tuo carrello (con eventuali sconti)");
        // Mostra carrello e totale
        System.out.println(carrello);
    }
    
}


