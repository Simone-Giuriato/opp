import unife.DoubleIncrement;
import unife.SingleIncrement;
import unife.utils.ICounter; //genera lui, man mano che uso sono import

public class App {

    public static void test(ICounter c, String title) { // ICounter è padre di Single e Double, ma posso usare solo
                                                        // metodi dell'interfaccia

        System.out.println(title);
        System.out.println("Valore iniziale: " + c.get());
        c.increment();
        c.increment();
        System.out.println("Valore dopo 2 incrementi: " + c.get());
        c.reset();
        System.out.println("Valore dopo il reset: " + c.get());
        System.out.println();

    }

    public static void main(String[] args) {

        /*
         * SingleIncrement c1 = new SingleIncrement(); //così posso accedere
         * eventualmente anche a metodi che fan parte della classe Increment ma che
         * magari sono aggiuntivi non facenti parte di interfaccia
         * DoubleIncrement c2 = new DoubleIncrement();
         */

        ICounter c1 = new SingleIncrement(); // così applico il Polimrofismo, ma posso accedere a solo metodi dell
                                             // interfaccia
        ICounter c2 = new DoubleIncrement();

        System.out.println("-----TEST COUNTER----");

        test(c1, "---TEST Incremento Singolo");
        test(c2, "----TEST Incremento Doppio");

    }

}
