import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creazione di una HashMap che associa nomi di persone a età
        HashMap<String, Integer> persone = new HashMap<>();

        // Aggiunta di elementi alla mappa con put()
        persone.put("Alice", 25);
        persone.put("Bob", 30);
        persone.put("Charlie", 35);

        // Stampiamo la mappa iniziale
        System.out.println("Mappa iniziale: " + persone);

        // Accesso a un valore con get()
        String nome = "Alice";
        if (persone.containsKey(nome)) {
            System.out.println(nome + " ha " + persone.get(nome) + " anni.");
        }

        // Rimuoviamo un elemento con remove()
        persone.remove("Bob");
        System.out.println("Dopo la rimozione di Bob: " + persone);

        // Verifica se una chiave esiste con containsKey()
        System.out.println("La mappa contiene Alice? " + persone.containsKey("Alice"));

        // Verifica se un valore esiste con containsValue()
        System.out.println("Qualcuno ha 30 anni? " + persone.containsValue(30));

        // Iterazione sulla mappa usando entrySet()
        System.out.println("Lista di persone nella mappa:");
        for (Map.Entry<String, Integer> entry : persone.entrySet()) {
            System.out.println(entry.getKey() + " ha " + entry.getValue() + " anni.");
            
        }

        /*Usa un ciclo for-each per scorrere tutti gli elementi (entry) presenti nella HashMap.
🔹 entrySet() restituisce un insieme (Set) di coppie chiave-valore, in cui ogni coppia è rappresentata da un oggetto Map.Entry<String, Integer>. */

        // Otteniamo solo le chiavi con keySet()
        System.out.println("Nomi presenti nella mappa: " + persone.keySet());

        // Otteniamo solo i valori con values()
        System.out.println("Età presenti nella mappa: " + persone.values());

        // Sostituire un valore con replace()
        persone.replace("Alice", 26);
        System.out.println("Dopo la modifica dell'età di Alice: " + persone);

        // Otteniamo la dimensione della mappa con size()
        System.out.println("Numero di elementi nella mappa: " + persone.size());

        // Cancelliamo tutti gli elementi con clear()
        persone.clear();
        System.out.println("Mappa dopo clear(): " + persone);
    }
}
