public class Counter {
    private int val;
    

    Counter(int x){   //costruttore
        val=x;
        

    }

    /*Counter(int val){   //costruttore
        this.val=val;
        

    }*/     //se ho nomi dei parametri costruttore e attributi uguali, uso il this. this.variabile=parametro

    public void reset() {
        val = 0;

    }

    public void increase() {
        val++;
    }

    public int getVal() {
        return val;
    }

    /*
     * public Es1 (int valoreIniziale){ //COSTRUTTORE con un argomento che se lo
     * metto va amesso anche nel main Es1 e= new Es1(); nelle 2 parentesi tonde l
     * argomento
     * val=valoreIniziale;
     * 
     * }
     */

    public static void main(String[] argv) { // main

        // int valoreIniziale=0;
        Counter e = new Counter(2); // gli passo 2 come valore
        
       // e.reset();
        e.increase();
        System.out.println(e.getVal());
        e.increase();
        e.increase();
        System.out.println(e.getVal());

    }
    
}



//i metodi interni NO static, solo il main va static
// public e reset vanno messi per ogni attributo o metodo, non posso fare elenco come in c++
//costruttore sempre pubblico, stesso nome della classe e serie di parametri, se non lo metto ci mette un costruttore senza argomenti
//posso avere più costruttori con vari argomenti, se aggiungo un costruttore il java non mi mette più il costruttore di default

