package org.example.model;

public class Pesce extends Animale{

        public Pesce(String nome, Razza razza){
                super(nome,razza);
        }

        public String verso(){
                return TipoVerso.MUTO.toString();       //il .toString per far scrivere la stringa, se no sarebbe 1 o 2 o 3... essendo enum
        }

        public String toString(){
                return "Pesce: " + getRazza() + " " + getNome()+ " " + verso();
        }

        

}
