package it.unife.oop.model;

public class Consigliere extends CandidatoBase {

    public Consigliere(int Id, String nome) {
        super(Id, nome, "CONSIGLIERE");//DEVO SEGUIRE ORDINE CHE HO NELLE () DEL COSTRUTTORE PADRE

    }

   

   

}

////SI sottolinea che se in Candidato base ho voti=0; dentro il costruttore solo per inizializzarlo, voti non è ereditato perche non fa parte del costruttore, non c'è tra le () della firma infatti e non lo passo dal main