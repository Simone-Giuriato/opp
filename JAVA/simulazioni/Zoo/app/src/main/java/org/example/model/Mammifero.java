package org.example.model;

public class Mammifero extends Animale{

    public Mammifero(String nome, Razza razza) {
            super(nome, razza);
        }
    
        @Override
    public String verso() {

        return TipoVerso.RUGGITO.toString(); 
       
    }

    public String toString(){
        return "Mammifero:" + getRazza() + " " + getNome() +" " + verso();
    }

  

}
