package it.unife.appello2.model;

public class Giocatore extends BaseEntity implements Valutabile, Comparable<Giocatore> {

    private Ruolo ruolo;
    private double costo;

    public Giocatore(String nome, Ruolo ruolo, double costo) {
            super(nome);
            this.ruolo=ruolo;
            this.costo=costo;
            
        }

        public Ruolo getRuolo(){
            return ruolo;
        }


        public void setRuolo(Ruolo ruolo){
            this.ruolo=ruolo;
        }

        public void setCosto(double costo){
            this.costo=costo;
        }
    
        @Override
    public int compareTo(Giocatore arg0) {
       int comparazione= Double.compare(arg0.costo,costo);
       return comparazione;
    }

    @Override
    public double valore() {
       return costo;
    }

    @Override
    public String descrivi() {
       return "Nome: " + getNome() + ", Ruolo: " + getRuolo() + ", Valore: " + valore();
    }
        

    //implementare costrutture (in base a come viene chiamato in App.Main), getter e setter ed eventuali altri metodi


        
}
