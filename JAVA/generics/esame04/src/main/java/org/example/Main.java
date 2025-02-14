package org.example;

import org.example.interfaces.Merce;
import org.example.models.Nave;
import org.example.models.Vestito;
public class Main {
    public static Nave<Vestito> nave2;

    public static void main(String[] args) {
        Nave<Vestito> naveVestiti;
        Vestito v1 = new Vestito(100, "pantaloni", "XS");
        Vestito v2 = new Vestito(50, "maglione", "XXL");

        naveVestiti = new Nave<>();

        naveVestiti.aggiungiCarico(v1);
        naveVestiti.aggiungiCarico(v2);

        naveVestiti.distintaDiCarico();
    }
}