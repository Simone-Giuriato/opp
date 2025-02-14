package org.example.services;

import java.util.LinkedList;
import java.util.List;


import org.example.model.Animale;

public class RegistroZoo {

    public List<Object> animali = new LinkedList<>();
    private static RegistroZoo instance;

    public RegistroZoo() {

    }

    public static RegistroZoo getInstance() {
        if (instance == null) {
            instance = new RegistroZoo();
        }
        return instance;
    }

    public <T extends Animale> void add(T animale) {

        animali.add(animale);

    }

    public String toString() {

        if (animali.isEmpty()) {
            return "Nessun animale";
        }
        StringBuilder risultato = new StringBuilder();

        for (Object a : animali) {

            risultato.append(a.toString() + '\n');
        }
        return risultato.toString();
    }

}
/*
 * In Java, la classe StringBuilder serve per creare e modificare stringhe in
 * modo efficiente,
 * evitando la creazione di più oggetti immutabili come accade con String.
 */

/*
 * qui io creo un unico string builder e (di tipo STRINGBUILDER) che mi da la
 * possibilità di modificare la stringa con append metto tutto di seguito
 * ecco che dentro a questo oggetto butto tutti gli animali, con un a capo
 * Come misura alternativa dovrei stampare ogni animale, ma la consegna
 * richiedeva questo
 * infine risultato.toString() porto tutti in stringa perche mi serve sia
 * stringa
 */
