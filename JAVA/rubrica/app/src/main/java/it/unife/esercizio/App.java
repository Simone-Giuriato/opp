/*
 * This source file was generated by the Gradle 'init' task
 */
package it.unife.esercizio;

import it.unife.esercizio.model.Contatto;
import it.unife.esercizio.model.Rubrica;
import it.unife.esercizio.model.Sesso;

public class App {

    public static void main(String[] args) {

        Contatto[] contatti = new Contatto[6];
        contatti[0] = new Contatto("Simo", "Giuriato", Sesso.MASCHIO);
        contatti[1] = new Contatto("Alberto", "Pavarin", Sesso.NON_DEFINITO);
        contatti[2] = new Contatto("Itala", "Balbo", Sesso.FEMMINA);
        contatti[3] = new Contatto("Carlo", "Rosso", Sesso.MASCHIO);
        contatti[4] = new Contatto("Viola", "Marchetto", Sesso.NON_DEFINITO);
        contatti[5] = new Contatto("Marco", "Verde", Sesso.FEMMINA);

        /*
         * for(int i=0; i<contatti.length; i++){
         * System.out.println(contatti[i]);
         * }
         */

        // Crea un'istanza della rubrica
        Rubrica rubrica = new Rubrica();

        for (int j = 0; j < contatti.length; j++) {
            rubrica.aggiungiContatto(contatti[j]);
            // mi dirà che rubrica piena perche provo ad aggiungere 6 contatti e su RUBRICA
            // ho messo un array di 5
        }
        //Potevo fare anche cosi:
        //rubrica.aggiungiContatto(new Contatto("Mario", "Rossi", sesso.FEMMINA));

        System.out.println("\nConatti presenti in Rubruca:");
        rubrica.stampaContatti();

        System.out.println("\nContatto cercato: " + rubrica.cerca("Carlo"));

    }
}
