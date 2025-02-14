package org.example.model;

public class PasseggeroConInvalidita  extends PasseggeroBase {

    
    //definire proprietà aggiuntive e implementare costruttore, getter e setter
    private TipoInvalidita tipoInvalidita;

    public PasseggeroConInvalidita(String nome, String cognome, String numeroPassaporto, TipoInvalidita tipoInvalidita) {
            super(nome, cognome, numeroPassaporto);
            this.tipoInvalidita=tipoInvalidita;
        
        }
    
        @Override
    public String toString() {
        return super.toString() + " [Invalidità: " + tipoInvalidita + "]";
    }
}
