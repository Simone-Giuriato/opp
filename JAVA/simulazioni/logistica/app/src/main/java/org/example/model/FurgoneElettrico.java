package org.example.model;

public class FurgoneElettrico extends MezzoDiTrasporto implements EcoFriendly {
    private int autonomiaBatteria;
    protected static final double COSTO_PER_KM=0.5;
    protected static final double LIVELLO_EMISSIONI=10;


    public FurgoneElettrico(String id, double portataMassima, int autonomiaBatteria) {
        super(id, portataMassima, "Eettrico");
        this.autonomiaBatteria = autonomiaBatteria;
    }


    @Override
    public int livelloEmissioniCO2() {
       return (int) LIVELLO_EMISSIONI;
    }


    @Override
    public double calcolaCostoPerChilometro() {
      return COSTO_PER_KM;
    }

}

//quando eridito da classe padre vedere quali attributi erediti, ad esempio qua nei parametri del costruttore non ho tipoCarbuarante
//ma tipoCarburante è un attributo della classe padre... ma nel super() lo devo mettere
//RICORDO che super() richiama il costruttore della classe padre
//GUARDA ANCHE IN APP.JAVA cosa gli passo cosi ho una visione più chiara, qui non passo un tipoCarburante ma glielo metto io che è Elettrico 