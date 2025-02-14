public class Enummerazione {

    public enum Giorni{
        Lunedì, Martedì, Mercoledì, Giovedì, Venerdì, Sabato, Domenica;
    }

    class GiorniDellaSettimana{
        @SuppressWarnings("unused")
        private String GiornoDIPartenza;
        private String oggi;

        public GiorniDellaSettimana(String GiornoDIPartenza, String oggi){
            this.GiornoDIPartenza=GiornoDIPartenza;
            this.oggi=oggi;
        }

        public void stampaGiorni(){
            System.out.println("oggi è "+this.oggi);
        }


    }

    
    public static void main(String[]args){
        Giorni Lunedi = Giorni.Lunedì;
        //GiorniDellaSettimana Today = new GiorniDellaSettimana("Lunedì", "Giovedì");


        System.out.println("il giorno selezionato è: "+Lunedi);

        switch (Lunedi) {
            case Lunedì:
                System.out.println("oggi è Lunedì");
            break;
        
            case Martedì:
                System.out.println("oggi è Martedì");
            break;

            case Mercoledì:
                System.out.println("oggi è Mercoledì");
            break;
            
            case Giovedì:
                System.out.println("oggi è Giovedì");
            break;
            
            case Venerdì:
                System.out.println("oggi è Venerdì");
            break;
            
            case Sabato:
                System.out.println("oggi è Sabato");
            break;
            
            case Domenica:
                System.out.println("oggi è Domenica");
            break;
            
            default:
                break;
        }


    }
}