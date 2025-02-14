package it.unife.oop.model;

public class Sindaco extends CandidatoBase {

    public Sindaco(int Id, String nome) {
        super(Id, nome, "SINDACO");
        
    }

   

   
    //Stesso discorso per assessore e consigliere

    
}
////SI sottolinea che se in Candidato base ho voti=0; dentro il costruttore solo per inizializzarlo, voti non è ereditato perche non fa parte del costruttore, non c'è tra le () della firma infatti e non lo passo dal main
