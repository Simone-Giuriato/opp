package org.example.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.example.exceptions.ImbarcoNonTrovatoException;
import org.example.model.Imbarco;
import org.example.model.Passeggero;

public class GestioneImbarchi {
    //TODO: Impostare la Classe come Singletone

    private Map<String, Imbarco> imbarchi;
    private static GestioneImbarchi instance;

    public GestioneImbarchi(){
        imbarchi=new HashMap<>();

    }

    public static GestioneImbarchi getInstance(){
        if(instance==null){
            instance=new GestioneImbarchi();

        }
        return instance;
    }

    
    public void aggiungiImbarco(Imbarco imbarco) {
        //salvare l'imbarco nella map, usando il codiceVolo come chiave.

        imbarchi.put(imbarco.getCodiceVolo(), imbarco);
    }

    public Imbarco cercaImbarco(String codiceVolo) throws ImbarcoNonTrovatoException {
            //implementare ricerca imbarchi e gestire l'eccezione ImbarcoNonTrovatoException

            for(Map.Entry<String, Imbarco> entry : imbarchi.entrySet()){
                if(entry.getKey()==codiceVolo){
                    return entry.getValue();
                }
            }
            throw new ImbarcoNonTrovatoException("Imbarco non esistente");  //se non trovo... errore
    }

    public List<Passeggero> listaPasseggeriPerVolo(String codiceVolo) throws ImbarcoNonTrovatoException {
        //restituire la lista dei passeggeri gestendo l'eccezione ImbarcoNonTrovatoException

        for(Map.Entry<String, Imbarco> entry : imbarchi.entrySet()){
            if(entry.getKey()==codiceVolo){
                return entry.getValue().getListPassegegri();    //ottengo lista passeggeri
            }
        }
        throw new ImbarcoNonTrovatoException("Imbarco non esistente");
      

    }
}
