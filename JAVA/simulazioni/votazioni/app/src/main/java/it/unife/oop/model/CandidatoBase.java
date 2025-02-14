package it.unife.oop.model;

public  abstract class CandidatoBase implements Candidato {

    protected String nome;
    protected String ruolo;
    protected int Id;
    protected int voti=0;

    public CandidatoBase(int Id, String nome, String ruolo){
        this.Id=Id;
        this.nome=nome;
        this.ruolo=ruolo;
   

    }

    @Override
    public String getRuolo() {
        return this.ruolo;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public void aggiungiVoto() {
       voti++;
    }

    @Override
    public int getVoti() {
        return voti;
    }

    public String toString(){
        return "Id: " + getId() + " " + getNome() + " " + getRuolo() + " Voti: "+ getVoti();
    }
    

  
    

}
