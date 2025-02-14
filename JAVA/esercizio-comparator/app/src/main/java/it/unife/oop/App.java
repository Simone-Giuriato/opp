/*
 * This source file was generated by the Gradle 'init' task
 */
package it.unife.oop;

import it.unife.oop.model.Brano;
import it.unife.oop.model.Genere;
import it.unife.oop.services.CatalogoBrani;

public class App {

    public static void main(String[] args) {
        CatalogoBrani cat=CatalogoBrani.getInstance();
        cat.addBrano(new Brano("Penny Lane", Genere.POP, "Beatles"));
        cat.addBrano(new Brano("Gangsta Paradise", Genere.RAP, "Coolio"));
        cat.addBrano(new Brano("Shiny happy people", Genere.POP, "REM"));
        cat.addBrano(new Brano("Lucy in the sky with diamonds", Genere.POP, "Beatles"));
        cat.addBrano(new Brano("Cara Italia", Genere.TRAP, "Ghali"));
        cat.addBrano(new Brano("Casa mia", Genere.TRAP, "Ghali"));
        System.out.println("Ordine inserimento");
        cat.getBrani().forEach(brano -> {
            System.out.println(brano.toString());
        });

        cat.ordinaBrani();  //ora ordino, entrano in gioco l ordinaBrani(collections.sort che richiama il compareTo)
        System.out.println("Ordinamento default");
        ;

        for(Brano brano: cat.getBrani()){   //stesso for each di prima, solo fatto in modo diverso
            System.out.println(brano.toString());   

        }
    }
}
