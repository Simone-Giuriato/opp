package it.unife.oop.services;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.unife.oop.model.Libro;
import it.unife.oop.model.Scaffale;

public class Inventario {
    
    private static Inventario instance;
    private Inventario() {}
    public static Inventario getInstance(){
        if (instance==null){
            instance=new Inventario();
        }
        return instance;
    }

    protected List<Libro> libri=new LinkedList<>();
    protected List<Scaffale> scaffali=new LinkedList<>();


    public List<Libro> getLibri(){
        return this.libri;
    }


    public List<Scaffale> getScaffali(){
        return this.scaffali;
    }

    public void caricaDati(String fileLibri, String fileScaffali) throws IOException{
        ObjectMapper mapper=new ObjectMapper();
        libri=List.of(mapper.readValue(new File(fileLibri), Libro[].class));
        scaffali=List.of(mapper.readValue(new File(fileScaffali), Scaffale[].class));
        System.out.println("N.ro libri: "+libri.size());
        System.out.println("N.ro scaffali: "+scaffali.size());
    }



}
