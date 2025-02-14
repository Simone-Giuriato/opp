package it.unife.oop.model;

public class Assessore extends CandidatoBase {  //erdita i metodi da CandidatoBase

    public Assessore(int Id, String nome) { //l utente non mi passa il ruolo, lo so io che il ruolo è assessoe
        super(Id, nome, "ASSESSORE");   
        //Costruttore ce lo metto io (sarà ereditato da quello di CandidatoBase, quest ultimo implementa un interfaccia)
        
    }


}

//SI sottolinea che se in Candidato base ho voti=0; dentro il costruttore solo per inizializzarlo, voti non è ereditato perche non fa parte del costruttore, non c'è tra le () della firma infatti e non lo passo dal main