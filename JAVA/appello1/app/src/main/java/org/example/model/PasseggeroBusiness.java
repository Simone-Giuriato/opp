package org.example.model;

public class PasseggeroBusiness  extends PasseggeroBase {

    // implementare costruttore

    public PasseggeroBusiness(String nome, String cognome, String numeroPassaporto) {
            super(nome, cognome, numeroPassaporto);
            
        }
    
        @Override
    public String toString() {
        return super.toString() + " [Business Class]";
    }
}