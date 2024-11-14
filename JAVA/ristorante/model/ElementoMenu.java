package model;

public class ElementoMenu implements InfoElementoMenu {
    private String nome;
    private double prezzo;
    private TipoPiatto tipo;

    public ElementoMenu(String nome, double prezzo, TipoPiatto tipo) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.tipo = tipo;
    }

    @Override
    public String getNome() {
        return nome;
        
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public TipoPiatto getTipo() {
        return tipo;
    }

    public String toString(){
        return "Nome: " + nome+ " Prezzo: "+prezzo+" Tipo: "+tipo;
    }

}
