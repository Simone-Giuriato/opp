import java.util.ArrayList;
import java.util.List;

public class ListMetodi {

    public static void main(String[] args) {
        // Creazione di una lista vuota
        List<String> lista = new ArrayList<>(); //puo avere duplicati

        // Aggiungere elementi alla lista
        lista.add("Mela");
        lista.add("Banana");
        lista.add("Arancia");
        lista.add("Pera");

        // Stampa della lista originale
        System.out.println("Lista iniziale: " + lista);

        // Accesso a un elemento con l'indice
        System.out.println("Elemento all'indice 2: " + lista.get(2));

        // Modifica di un elemento
        lista.set(1, "Fragola");
        System.out.println("Lista dopo modifica: " + lista);

        // Rimuovere un elemento
        lista.remove("Arancia"); // Rimuove per valore
        System.out.println("Lista dopo rimozione (per valore): " + lista);

        lista.remove(1); // Rimuove per indice
        System.out.println("Lista dopo rimozione (per indice): " + lista);

        // Verifica se un elemento esiste nella lista
        boolean contieneMela = lista.contains("Mela");
        System.out.println("Contiene 'Mela'? " + contieneMela);

        // Ottenere la dimensione della lista
        System.out.println("Dimensione della lista: " + lista.size());

        // Verifica se la lista è vuota
        boolean vuota = lista.isEmpty();
        System.out.println("La lista è vuota? " + vuota);

        // Iterare su tutti gli elementi della lista con un ciclo for
        System.out.println("Iterazione della lista con ciclo for:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        /*
         * for(int k=0;k<lista.size();k++){
         * System.out.println(lista);
         * }
         */

        // Iterare sulla lista con un ciclo foreach
        System.out.println("Iterazione della lista con ciclo foreach:");
        for (String frutto : lista) {
            System.out.println(frutto);
        }

        // Aggiungere un elemento in una posizione specifica
        lista.add(1, "Ananas");
        System.out.println("Lista dopo aggiunta in posizione 1: " + lista);

        // Controllo se la lista contiene un altro elenco
        List<String> lista2 = new ArrayList<>();
        lista2.add("Mela");
        lista2.add("Banana");
        boolean contieneTutti = lista.containsAll(lista2);
        System.out.println("La lista contiene tutti gli elementi di lista2? " + contieneTutti);

        // Rimuovere tutti gli elementi di una lista
        lista.removeAll(lista2);
        System.out.println("Lista dopo rimozione di tutti gli elementi di lista2: " + lista);

        // Usare il metodo clear() per svuotare la lista
        lista.clear();
        System.out.println("Lista dopo clear(): " + lista);

        // Verifica se la lista è vuota dopo clear()
        boolean vuotaDopoClear = lista.isEmpty();
        System.out.println("La lista è vuota dopo clear()? " + vuotaDopoClear);
    }
}
