

import model.ElementoMenu;
import model.Ordine;
import model.TipoPiatto;
import services.Ristorante;

public class App {
    
    public static void main(String[] args) {
     Ristorante ristorante = new Ristorante();

        // Creazione di alcuni elementi del menù
        ElementoMenu pizza = new ElementoMenu("Pizza Margherita", 8.50, TipoPiatto.PRIMO);
        ElementoMenu vino = new ElementoMenu("Vino Rosso", 4.00, TipoPiatto.BEVANDA);
        ElementoMenu tiramisu = new ElementoMenu("Tiramisù", 5.00, TipoPiatto.DESSERT);
        ElementoMenu bruschetta = new ElementoMenu("Bruschetta", 3.50, TipoPiatto.ANTIPASTO);

        // Creazione e gestione degli ordini
        Ordine ordine1 = new Ordine();
        ordine1.aggiungiElemento(pizza);
        ordine1.aggiungiElemento(vino);

        Ordine ordine2 = new Ordine();
        ordine2.aggiungiElemento(tiramisu);
        ordine2.aggiungiElemento(bruschetta);
        ordine2.aggiungiElemento(vino);

        //Confermo/Aggiungo ordine
        ristorante.aggiungiOrdine(ordine1);
        ristorante.aggiungiOrdine(ordine2);

        // Visualizzazione di tutti gli ordini
        System.out.println("Tutti gli ordini:");
        ristorante.visualizzaTuttiGliOrdini();

        // Filtraggio di un ordine per tipo di piatto
        System.out.println("Elementi di tipo BEVANDA nell'ordine 1:");
        for (ElementoMenu elemento : ordine1.filtraPerTipo(TipoPiatto.BEVANDA)) {
            System.out.println(elemento);   //ricorda ToString in EElemento Menu
        }
    }
}