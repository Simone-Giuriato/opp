/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.example.model.Camion;
import org.example.model.Drone;
import org.example.model.FurgoneElettrico;
import org.example.services.GestioneLogistica;

public class App {
    
    public static void main(String[] args) {
     GestioneLogistica gestione = new GestioneLogistica();

        Camion camion = new Camion("C1", 10000, "Diesel", 4);
        FurgoneElettrico furgone = new FurgoneElettrico("F1", 2000, 300);
        Drone drone = new Drone("D1", 500, 50);

        gestione.aggiungiMezzo(camion);
        gestione.aggiungiMezzo(furgone);
        gestione.aggiungiMezzo(drone);

        gestione.visualizzaMezzi();

        double distanza = 100; // Distanza in km
        gestione.stampaCostoPerDistanza(distanza);
        
    }
}
