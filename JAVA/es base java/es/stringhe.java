class stringhe{

    public static void main(){
        //frase.length ritorna come valore un numero intero, il che permette di inserirlo anche come variabile intera
        String frase = "questa è una frase";
        System.out.println("la frase originale è: "+frase);
        System.out.println("la frase è lunga: "+frase.length());

        //per convertire la stringa completamente in maiuscolo:
        String fraseMaiuscola=frase;
        fraseMaiuscola=fraseMaiuscola.toUpperCase();
        System.out.println("la frase in maiuscola è: "+fraseMaiuscola);

        //controllo suffisso e controllo prefisso
        String parola="controllore";
        String prefisso="controllo";
        String suffisso="ore";
        if (parola.startsWith(prefisso)) {
            System.out.println("l'inizio delle parole sono uguali");
        }else
            System.out.println("l'inizio delle parole non sono uguali");
        
        if (parola.endsWith(suffisso)) {
            System.out.println("le due parole terminano in modo uguale");
        }else
            System.out.println("le due parole non terminano in modo uguale");

        //estrazione di una stringa da un'altra stringa
        String estratta;
        estratta=frase.substring(0, 12);
        System.out.println("la sottostringa è: ''"+estratta+"'' ed è lunga: "+estratta.length());

        //verifica che una frase contenga un sequenza di caratteri
        String sequenza="cammin di nostra vita";
        String testoString="nel mezzo del cammin di nostra vita mi ritrovai in una selva oscura";
        if (testoString.contains(sequenza)) {
            System.out.println("nel testo è presente quella frase");
        }else
            System.out.println("nel testo non è presente quella frase");

        //interpolazione di una variabile all'interno di una stringa (non l'ho capito)
        /*int lunghezza_frase=testoString.length();
        System.out.println("\n");
        String completaString=String.format(testoString, " la frase è lunga: ",lunghezza_frase);
        System.out.println(completaString);
        */
        
        //rimozione spazzi bianchi
        //ci sono due varianti:
        //[trim()] rimuove solatanto gli spazzi del primo posto e dell'ultimo
        //[replace()] sostituisce intermante il carattere prestabilito in funzione con uno meso a nostra richiesta
        System.out.print("\n");
        String frase_senza_spazi="n o n   _    c r e d o _ n e        l     _ m o n d o";
        frase_senza_spazi=frase_senza_spazi.replace(" ", "");
        System.out.println(frase_senza_spazi);
    }



}