import model.Contatto;
import model.Sesso.TipoSesso;

public class App {

    public static void main(String[] args) {
        Contatto[] contatti; // dichiaro array tipo Contatto
        contatti = new Contatto[3]; // inizalizzo array formato da 3 elementi

        contatti[0] = new Contatto("Simone", "Giuriato", TipoSesso.MASCHIO);
        contatti[1] = new Contatto("Alberta", "Rossi", TipoSesso.FEMMINA);
        contatti[2] = new Contatto("Gianna", "Bianco", TipoSesso.NON_DEFINITO);

        for (int i = 0; i < 3; i++) {
            System.out.println(contatti[i]);
            // quando faccio queso, java richiama il toString, se non lo metto fa lui, ma l
            // ho messo e decido io come stampare

        }
    }

}
