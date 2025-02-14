//INCREMENTO SINGOLO

package unife;


//La riga import unife.utils.ICounter; serve per importare un'interfaccia (ICounter) presente nel pacchetto unife.utils
import unife.utils.ICounter;    //quando faccio implements ICounter lo genera da solo

/*
 * implements--> quando una classe deve IMPLEMENTARE un interfaccia (oppure interfaccia estende/eredita altra interfaccia)
 * extends--> quando una classe eredita da un'altra classe
 */
/*
 * Una classe può ereditare da solo 1 classe
 * Una classe può IMPLEMNETARE più interfacce
 */
public class SingleIncrement implements ICounter {

    int val = 0;

    public void reset() {
        val = 0;
    }

    public void increment() {
        val += 1;
    }

    public int get() {
        return val;
    }
    
}

//Quando implemento un'interfaccia i metodi devono essere con la stessa firma di quando li ho dichiarati in interfaccia, e devo implemnetrali tutti
