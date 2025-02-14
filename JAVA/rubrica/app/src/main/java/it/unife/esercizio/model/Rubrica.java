package it.unife.esercizio.model;

public class Rubrica {

    private Contatto[] contatti;

    public Rubrica() {
        this.contatti = new Contatto[5];
    }

    public boolean aggiungiContatto(Contatto c) {

        for (int j = 0; j < contatti.length; j++) {
            if (contatti[j] == null) {  //alla prima posizione vuota
                contatti[j] = c;
                return true;    //ritorno vero per terminare funzione, ho fatto quello che dovevo

            }

        }
        //se esco dal ciclo vuol dire che non ci sono posizione vuote, quindi rubirica è piena 
        System.out.println("Rubrica piena. Impossibile aggiungere altri contatti");
        return false;
    }

    public void stampaContatti() {
        for (int i = 0; i < contatti.length; i++) {
            System.out.println(contatti[i].toString());
        }
    }

    public Contatto cerca(String nome) {

        for (int i = 0; i < contatti.length; i++) {
            if (contatti[i].getNome().equalsIgnoreCase(nome)) {
                return contatti[i];
            }
        }
        System.out.println("Contatti non trovati");
        return null;
    }

}
