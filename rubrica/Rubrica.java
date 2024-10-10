import model.Contatto;
import model.Sesso;

public class Rubrica {
    private Contatto[] contatti; // Array di contatti
    private int indice; // indice array

    public Rubrica() {
        contatti = new Contatto[5]; // array di 5
        indice = 0;// se faccio una variabile locale nel metodo aggiungi contatto--> ogni volta si
                   // resetta, invece devo tener traccia
    }

    public void aggiungiContatto(Contatto nuovoContatto) {

        if (indice < contatti.length) {
            contatti[indice] = nuovoContatto;
            System.out.println("Contatto aggiunto: " + nuovoContatto);
            indice++; // Incrementa l'indice dopo aver aggiunto un contatto
        } else {
            System.out.println("Rubrica piena, impossibile aggiungere il contatto.");
        }
    }

    public void stampaContatti() {
        System.out.println("Contatti nella rubrica:");
        for (int i = 0; i < contatti.length; i++) {

            System.out.println(contatti[i]);

        }
    }

    public Contatto cerca(String nomeDaCercare) {
        for (int i = 0; i < contatti.length; i++) { 
            if (contatti[i] != null && contatti[i].getNome().equalsIgnoreCase(nomeDaCercare)) { //equalsIgnoreCase--> guarda se uguali ed ignora se scritto maisucolo, minuscolo...
                return contatti[i]; // Restituisce il primo contatto trovato
            }
        }
        return null; // Restituisce null se non trovato
    }

    public static void main(String[] args) {

        Rubrica rubrica = new Rubrica();

        Contatto contatto1 = new Contatto("Simone", "Bianchi", Sesso.MASCHIO);
        Contatto contatto2 = new Contatto("Giulia", "Rossi", Sesso.FEMMINA);
        Contatto contatto3 = new Contatto("Marco", "Becci", Sesso.MASCHIO);
        Contatto contatto4 = new Contatto("Matteo", "Cerri", Sesso.MASCHIO);
        Contatto contatto5 = new Contatto("Andrea", "Bibbo", Sesso.NON_DEFINITO);
       // Contatto contatto6 = new Contatto("Andrea", "Bibbo", Sesso.NON_DEFINITO);   //sesto contatto per verificare che rubrica fosse piena

        rubrica.aggiungiContatto(contatto1);
        rubrica.aggiungiContatto(contatto2);
        rubrica.aggiungiContatto(contatto3);
        rubrica.aggiungiContatto(contatto4);
        rubrica.aggiungiContatto(contatto5);
        //rubrica.aggiungiContatto(contatto6);    //se aggiungo altro contatto, rubrica piena

        // Stampa di tutti i contatti presenti nella rubrica
        rubrica.stampaContatti();

        String nomeCercato = "ANDREA";

        Contatto trovato;   //creo variabile per contenere info se trovato
        trovato = rubrica.cerca(nomeCercato);

        if (trovato != null) {
            System.out.println("Contatto trovato: " + trovato);
        } else {
            System.out.println("Contatto non trovato.");
        }

    }

}
