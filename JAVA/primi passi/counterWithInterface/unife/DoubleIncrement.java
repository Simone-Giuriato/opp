//INCREMENTO DOPPIO
package unife;

import unife.utils.ICounter;

public class DoubleIncrement implements ICounter {

    private int val=0;
    @Override
    public void reset(){
        val=0;
    }
    @Override
    public void increment(){    //doppio incremento
        val=val+2;
    }

    @Override   //non è obbligatorio
    public int get(){
        return val;
    }


    
}
