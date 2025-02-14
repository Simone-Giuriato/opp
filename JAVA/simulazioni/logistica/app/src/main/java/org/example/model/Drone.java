package org.example.model;

public class Drone extends MezzoDiTrasporto implements EcoFriendly {
    private int raggioDiAzione;
    protected static final double COSTO_PER_KM=0.8;
    protected static final double LIVELLO_EMISSIONI=10;
    
    public Drone(String id, double portataMassima, int raggioDiAzione) {
        super(id,portataMassima,"Elettrico");
        this.raggioDiAzione=raggioDiAzione;
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