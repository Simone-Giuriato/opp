package libreria;

public class MiaLibreria implements GestioneLibreria {  //classe che implementa la mia interfaccia IMPLEMENTS
// devo andare sul biscio rosso e fare quick fix, add implement elimino contenuto dei emtodi e faccio il mio

    protected Libro[] libri =new Libro[5];  //array di 5 libri 
    @Override
    public void aggiungiLibro(Libro libro) {

        for(int i=0;i<libri.length;i++){
            if(libri[i]==null){
                libri[i]=libro;
                return; //per fare uscire
            }else{
                if(i==libri.length-1){
                    System.out.println("Non ho più spazio");
                }
            }
        }
        
    }

    @Override
    public void rimuoviLibro(String titolo) {
        for(int i=0;i<libri.length;i++){
            if(libri[i]!=null && libri[i].getTitolo().equalsIgnoreCase(titolo)){
                libri[i]=null;
            }
        }
       
    }

    @Override
    public Libro cercaLibro(String titolo) {
        for(int i=0;i<libri.length;i++){
            if(libri[i]!=null && libri[i].getTitolo().equalsIgnoreCase(titolo)){
              return libri[i];
            }
        }
        return  null;   //devo restituire sempre qualcosa, se non h libro restitusco null
    }

}
