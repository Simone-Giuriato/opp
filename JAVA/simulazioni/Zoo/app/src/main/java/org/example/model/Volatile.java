package org.example.model;

public class Volatile extends Animale{

    public Volatile(String nome, Razza razza) {
        super(nome, razza);
        
    }

   
    public String verso() {
        return TipoVerso.CINGUETTIO.toString();
       
    }

    public String toString(){
        return "Volatile: " + getRazza() + " " + getNome()+ " " + verso();
}
    
  

}
