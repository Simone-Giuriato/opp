package org.example.model;

public class MiaLibreria implements GestioneLibreria{

    protected Libro[] libri=new Libro[5];

    @Override
    public void aggiungiLibro(Libro libro) {
        for (int i=0;i<libri.length; i++){
            if (libri[i]==null){
                libri[i]=libro;
                return;
            }else {
                if (i==(libri.length-1)){
                    System.out.println("Non ho più spazio");
                }
            }
        }
    }

    @Override
    public void rimuoviLibro(String titolo) {
        for (int i=0;i<libri.length; i++){
            if (libri[i]!=null && libri[i].getTitolo().equalsIgnoreCase(titolo)){
                libri[i]=null;
            }
        }
    }

    @Override
    public Libro cercaLibro(String titolo) {
        for (int i=0;i<libri.length; i++){
            if (libri[i]!=null && libri[i].getTitolo().equalsIgnoreCase(titolo)){
                return libri[i];
            }
        }
        return null;
    }

    @Override
    public int nroLibri() {
        int nroLibri=0;
        for (int i=0;i<libri.length;i++){
            if (libri[i]!=null){
                nroLibri++;
            }
        }
        return nroLibri;
    }

    @Override
    public Libro getLibroByIdx(int idx) {
        return libri[idx-1];
    }

}
