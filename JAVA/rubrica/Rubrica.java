import model.Contatto;
import model.Sesso.TipoSesso;

public class Rubrica {

    private Contatto contatti[]; // DIchiaro array di contatti
    private int indice;

    public Rubrica() {

        contatti = new Contatto[5]; // inizializzo 5 elementi dell array
        indice = 0;

    }

    public void aggiungiContatto(Contatto c) { // aggiunge contatto alla prima posizione libera
        if (indice < contatti.length) { // se indice è piu piccolo della lunghezza array quindi c'è spazio in rubrica
                                        // (la rubrica parte da vuota, indice =0)
            contatti[indice] = c;
            System.out.println("Conatto aggiunto in rubrica, come: " + c);
            indice++;
        } else {
            System.out.println("Rubrica piena, impossibile inserire il contatto");
        }

    }

    public void stampaContatti() {

        System.out.println("Contatti presenti in rubrica:");
        for (int i = 0; i < contatti.length; i++) { // i sarà massimo 4 (5 elementi)

            System.out.println(contatti[i]); // andrà a chimare il to string in Contatto

        }

    }

    public Contatto cercaContatto(String nome) {

        for (int i = 0; i < contatti.length; i++) {
            if (contatti[i] != null && contatti[i].getNome().equalsIgnoreCase(nome)) {
                return contatti[i];
            }

        }
        return null;

    }

    public static void main(String[] args) {

        Rubrica r = new Rubrica();
        Contatto c1 = new Contatto("Bibbo", "Beggins", TipoSesso.NON_DEFINITO);
        Contatto c2 = new Contatto("Simone", "Lepre", TipoSesso.MASCHIO);
        Contatto c3 = new Contatto("Angela", "Woot", TipoSesso.FEMMINA);
        Contatto c4 = new Contatto("Matteo", "Dapero", TipoSesso.MASCHIO);
        Contatto c5 = new Contatto("Michele", "Rosso", TipoSesso.NON_DEFINITO);
        Contatto c6 = new Contatto("Pooh", "GGGG", TipoSesso.NON_DEFINITO);

        // POTEVO FARE CON ARRAY ma non bello
        /*
         * Contatto[] contatti; // dichiaro array tipo Contatto
         * contatti = new Contatto[5]; // inizalizzo array formato da 3 elementi
         * 
         * contatti[0] = new Contatto("Simone", "Giuriato", TipoSesso.MASCHIO);
         * contatti[1] = new Contatto("Alberta", "Rossi", TipoSesso.FEMMINA);
         * contatti[2] = new Contatto("Gianna", "Bianco", TipoSesso.NON_DEFINITO);
         * contatti[3] = new Contatto("FRanco", "Giuriato", TipoSesso.MASCHIO);
         * contatti[4] = new Contatto("Nanno", "Rossi", TipoSesso.FEMMINA);
         * // contatti[5] = new Contatto("YYYY", "Bianco", TipoSesso.NON_DEFINITO);
         * 
         * for(int i=0;i<5;i++){
         * r.aggiungiContatto(contatti[i]);
         * }
         */

        r.aggiungiContatto(c1);
        r.aggiungiContatto(c2);
        r.aggiungiContatto(c3);
        r.aggiungiContatto(c4);
        r.aggiungiContatto(c5);
        r.aggiungiContatto(c6); // al sesto contatto mi dirà rubrica piena

        r.stampaContatti();

        Contatto trovato;
        trovato = r.cercaContatto("Simone"); // se lo trova contiene il contatto intero

        if (trovato != null) {

            System.out.println("Contatto trovato: " + trovato);

        } else {
            System.out.println("Contatto non trovato");
        }

    }

}
