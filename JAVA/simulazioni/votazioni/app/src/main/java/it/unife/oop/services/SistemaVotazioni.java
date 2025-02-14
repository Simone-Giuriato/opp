package it.unife.oop.services;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.*;

import com.fasterxml.jackson.databind.ObjectMapper;

import it.unife.oop.model.Candidato;

public class SistemaVotazioni {
    
    private final Map<Integer, Candidato> candidati = new HashMap<>();
    private static SistemaVotazioni  instance;

    private SistemaVotazioni(){

    }

    public static SistemaVotazioni getInstance(){
        if(instance==null){
            instance=new SistemaVotazioni();
        }
        return instance;
    }


    
    public void aggiungiCandidato(Candidato candidato) {
        candidati.put(candidato.getId(), candidato);
    }

    public void vota(int candidatoId) {
        candidati.get(candidatoId).aggiungiVoto();
    }

    public void stampaRisultati() {
        for(Candidato c : candidati.values()){
            System.out.println(c.toString());
        }
    }

    public void salvaRisultatiSuFile(String filePath) throws IOException  {

        ObjectMapper mapper = new ObjectMapper();
        
        mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), candidati);
        
        //mapper.writeValue(new File(filePath), candidati); andrebbe bene ma pretty printer lo fa piu bello

   
    }

}
