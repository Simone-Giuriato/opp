package it.unife.oop.services;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import it.unife.oop.model.Libro;
import it.unife.oop.model.Scaffale;

public class GestoreInventario {

    private static GestoreInventario instance;
    private GestoreInventario(){}
    public static GestoreInventario getInstance(){
        if (instance==null){
            instance=new GestoreInventario();
        }
        return instance;
    } 

    protected Map<String, List<Libro>> collocazione=new HashMap();

    public void posizionaLibri(){
        Inventario inventario=Inventario.getInstance();
        System.out.println(inventario.getLibri().size());

        inventario.getLibri().forEach(libro -> {

            double rand = Math.floor(Math.random()*inventario.getScaffali().size());

            Scaffale scaffaleSelezionato=inventario.getScaffali().get((int)rand);
            
            if (!collocazione.keySet().contains(scaffaleSelezionato.getCodice())){
               collocazione.put(scaffaleSelezionato.getCodice(), new LinkedList<>());
            }
            collocazione.get(scaffaleSelezionato.getCodice()).add(libro);

        });

        Iterator<String> it=collocazione.keySet().iterator();
        while (it.hasNext()){
            String scaffaleCodice=it.next();
            System.out.println("Scaffale: "+scaffaleCodice);
            collocazione.get(scaffaleCodice).forEach(libro -> {
                System.out.println(libro);
            });
        }

    }



}
