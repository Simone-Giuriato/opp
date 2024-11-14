package model;

import java.util.ArrayList;
import java.util.List;


public class Ordine {

    private List<ElementoMenu> elementi;

    public Ordine() {
        elementi = new ArrayList<>();
    }

    public void aggiungiElemento(ElementoMenu elemento) {
        elementi.add(elemento);
    }

    public double calcolaTotale() {
        double totale=0;
       for(ElementoMenu elemento : elementi){       //dichiarare il tipo della varibiale sempre dentro for each
        totale=totale + elemento.getPrezzo();

       }
       return totale;
    }

    public List<ElementoMenu> filtraPerTipo(TipoPiatto tipo) {
        
        List<ElementoMenu> elementiFiltrati = new ArrayList<>();
        
        for (ElementoMenu elemento : elementi) {
            if (elemento.getTipo().equals(tipo)) {
                // Aggiungiamo l'elemento alla lista se il tipo corrisponde
                elementiFiltrati.add(elemento);
            }
        }
        
        return elementiFiltrati;
    }

    public void visualizzaOrdine() {
        if (elementi.isEmpty()) {
            System.out.println("L'ordine è vuoto.");
        } else {
            for (ElementoMenu elemento : elementi) {
                // Stampiamo i dettagli dell'elemento (nome e prezzo)
                System.out.println("Nome: " + elemento.getNome() + " - Prezzo: " + elemento.getPrezzo() + " euro");
            }
        }
    }

}
