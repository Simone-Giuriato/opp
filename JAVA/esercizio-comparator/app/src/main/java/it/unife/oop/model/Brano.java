package it.unife.oop.model;

public class Brano implements Comparable<Brano>{

    protected String nome;
    protected Genere genere;
    protected String gruppo;

    public Brano(String nome, Genere genere, String gruppo){

        this.nome=nome;
        this.genere=genere;
        this.gruppo=gruppo;

    }

   public String getnome(){
    return nome;
   }

   public String getGruppo(){
    return gruppo;
   }

   public Genere getGenere(){
    return genere;
   }

   public void setGenere(Genere genere){
    this.genere=genere;
   }

   public void setNome(String nome){
    this.nome=nome;
   }

   public void setGruppo(String gruppo){
    this.gruppo=gruppo;
   }

   public String toString(){
    return "Brano: " + getnome() + "  "  + getGruppo() + "  " + getGenere();
   }

@Override
public int compareTo(Brano other) { //Dichiariamo il metodo compareTo, che confronta this con un altro oggetto Brano (other).
    int genereCompare=this.genere.compareTo(other.getGenere()); //guardo in quale ordine sono se son diversi, o se sono uguali vedi schema sotto di cosa fa il compareTo

    if(genereCompare!=0){   //se il confronto tra 2 brani dice che sono diversi
        return genereCompare;  // o <0 o >0 e di conseguenza ordine dato dall enum  
    }
    //se arrivo qua vuol dire che i generi sono uguali, perchè non sono entrato nell if di prima (e non ho retornato)
    int gruppoCompare=this.gruppo.compareToIgnoreCase(other.getGruppo());   //ignore maiuscole e minuscole, salvo il risulatato del confronto

    if(gruppoCompare!=0){ //se gruppi sono diversi
        return gruppoCompare;  // o <0 o >0 e di conseguenza ordine dato alfabetico
    }
    //se sia generi e gruppi sono uguali, andiamo per ordinamento brano
    return this.nome.compareToIgnoreCase(other.getnome());

    
}

   
    //implementare ordinamento, prima genere POP a seguire RAP e poi TRAP, a parità di genere prdinare per nome gruppo, a parità di gruppo ordinare per nome della canzone.
    /*
     * Ecco l'implementazione del metodo compareTo, che ordina i brani nel seguente ordine:
    Genere: POP ------RAP ----TRAP
    Gruppo (in ordine alfabetico), se sono a parità di genere
    Nome del brano (in ordine alfabetico) a partià di gruppo
     */

     /*
      * Il metodo compareTo(T other) restituisce un valore intero che indica la relazione d'ordine tra l'oggetto attuale (this) e l'oggetto passato come parametro (other):

     Valore negativo (< 0) → Se this è minore di other
     Valore positivo (> 0) → Se this è maggiore di other
     Zero (0) → Se this e other sono uguali
      */

      /*
       * this.genere.compareTo(other.getGenere()) ritorna:

    Negativo → Se this.genere deve venire prima di other.genere.
    Positivo → Se this.genere deve venire dopo other.genere.
    Zero → Se i generi sono uguali (passiamo al prossimo confronto).
       */

       /*per gli enum:
        * gli elementi dell'enum hanno un ordine naturale basato sulla loro dichiarazione.

    POP ha indice 0
    RAP ha indice 1
    TRAP ha indice 2
        */

        //mentre per gruppo e nome uso l ordine alafabetico

}
