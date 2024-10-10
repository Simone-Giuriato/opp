import model.Contatto;
import model.Sesso;

public class App {

     public static void main(String[] args) {
        Contatto[] contatti=new Contatto[3];
        contatti[0]=new Contatto("Steve", "Rogers", Sesso.MASCHIO);
        contatti[1]=new Contatto("Wanda", "Maximoff", Sesso.FEMMINA);
        contatti[2]=new Contatto("Groot", "Groot", Sesso.NON_DEFINITO);

        for (int i=0;i<contatti.length;i++){
            System.out.println(contatti[i]);
        }
    }
    
}
