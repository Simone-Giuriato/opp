package it.unife.appello2.model;

public abstract class BaseEntity {
    private String nome;

    //implementare costruttore, getter e setter
    public BaseEntity(String nome){
        this.nome=nome;

    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }
    public abstract String descrivi();
}
