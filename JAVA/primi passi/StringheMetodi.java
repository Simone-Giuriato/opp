public class StringheMetodi {

    public static void main(String[] args) {
        // Creazione di una stringa immutabile
        String frase = "Ciao, come stai?";

        // Stampa della stringa iniziale
        System.out.println("Frase iniziale: " + frase);

        // Concatena una stringa alla fine di un'altra
        String fraseAggiornata = frase + " Spero tu stia bene!";
        System.out.println("Frase aggiornata: " + fraseAggiornata);

        // Verifica se una stringa contiene una parola specifica
        boolean contieneCiao = frase.contains("Ciao");
        System.out.println("La frase contiene 'Ciao'? " + contieneCiao);

        // Converte una stringa in maiuscolo
        String fraseMaiuscolo = frase.toUpperCase();
        System.out.println("Frase in maiuscolo: " + fraseMaiuscolo);

        // Converte una stringa in minuscolo
        String fraseMinuscolo = frase.toLowerCase();
        System.out.println("Frase in minuscolo: " + fraseMinuscolo);

        // Sostituire una parola in una stringa
        String fraseModificata = frase.replace("come", "dove");
        System.out.println("Frase modificata: " + fraseModificata);

        // Estrazione di una sottostringa
        String sottostringa = frase.substring(6, 10);  // Estrae "come"
        System.out.println("Sottostringa: " + sottostringa);

        // Lunghezza della stringa
        System.out.println("Lunghezza della frase: " + frase.length());

        // Verifica se una stringa è vuota
        boolean vuota = frase.isEmpty();
        System.out.println("La frase è vuota? " + vuota);

        // Creazione di un StringBuilder per manipolare la stringa
        StringBuilder sb = new StringBuilder("Ciao!");
        System.out.println("StringBuilder iniziale: " + sb);

        // Aggiungere una parte alla stringa
        sb.append(" Come va?");
        System.out.println("Dopo append: " + sb);

        // Rimuovere una parte della stringa
        sb.delete(5, 10); // Rimuove "Come "
        System.out.println("Dopo delete: " + sb);

        // Inserire una parte in una posizione specifica
        sb.insert(5, "ci sei? ");
        System.out.println("Dopo insert: " + sb);

        // Cambiare una parte della stringa
        sb.replace(5, 12, "tutto ok?");
        System.out.println("Dopo replace: " + sb);

        // Usare il metodo clear() per svuotare il StringBuilder
        sb.setLength(0);  // Il metodo equivalente a clear()
        System.out.println("Dopo clear (con setLength(0)): " + sb);

        // Verifica se la stringa è vuota dopo clear()
        boolean vuotaDopoClear = sb.length() == 0;
        System.out.println("StringBuilder è vuoto dopo clear? " + vuotaDopoClear);
    }
}
