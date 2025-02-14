import java.util.Scanner;;

//questa servirà per chiamare una eccezzione personalizzata
//d'obbligo estendere la classe Exception per renderla una checked exception
class MiaEccezione extends Exception {
    public MiaEccezione(String messaggio) {
        super(messaggio);
    }
}

public class eccezioni {

    public static void eccezioneAritmetica(){
        int x=2;
        int z=0;
        try{
            x=x/z;
            System.out.println("risultato della divisione: "+x);
        }catch(ArithmeticException e){
            System.out.println("non si fanno le divisioni per 0, ignorante");
        }
    }

    public static void eccezioniMultiple(){
        try{
            int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[10]);
            int risultato=array[4]/0;
            System.out.println("la divisione risulta: "+risultato);
        }catch( ArithmeticException| ArrayIndexOutOfBoundsException e){
            System.out.println("errore :"+e.getMessage());
        }
    }

    public static void eccezioniConBloccoFinally(){
        int[] array = {1, 2, 3, 4, 82};
        try{
            
            System.out.println("lultimo valore dell'array è: "+array[10]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("errore: "+e.getMessage());
        }finally{
            for(int i=0; i<array.length; i++){
                if (i+1==array.length) {
                    System.out.println("l'ultimo valore dell'array è: "+array[i]);
                }
            }
        }
    }

    public static void eccezionePersonalizzata(){
        try{
            //chiama indipendentemente il metodo
            //crea una eccezzione verificata sempre
            lanciaEccezione();
        }catch (MiaEccezione eccezione){
            System.out.println("errore: "+eccezione.getMessage());
        }
    }

    //l'utilizzo di throws (non throw) serve a far capire al compilatore che deve gestire il metodo come una eccezzione
    public static void lanciaEccezione() throws MiaEccezione{
        //l'utilizzo di throw serve per creare un'istanza della eccezzione
        throw new MiaEccezione("questa è un'eccezione personalizzata");
    }

    public static void eccezioneAnnidata(){
        try{
            try{
                int risultato=10/0;
                System.out.println("il risultato è: "+risultato);
            }catch(Exception e){
                System.out.println("errore nel try annidato: "+e.getMessage());
                //il throw posto dopo l'output del try più interno serve a andare avanti con il programma nonostante leccezzione catturata
                throw e;
            }
        }catch(Exception e){
            System.out.println("errore nel try più esterno: "+e.getMessage());
        }
    }

    public static void eccezioneParziale(){
        try{
            metodoCheRilancia();
        }catch(ArithmeticException e){
            System.out.println("errore catturato nel metodo: "+e.getMessage());
        }
    }

    public static void metodoCheRilancia(){
        try{
            int risultato=10/0;
            System.out.println("la divisione per 0 fa: "+risultato);
        }catch(Exception e){
            System.out.println("non si fanno le divisioni per 0 ignorante: "+e.getMessage());
            throw e;//continua con l'esecuzione del programma
        }
    }

    public static void eccezioneConThrow(){
        try{
            metodoCheLanciaEccezione();
        }catch(Exception e){
            System.out.println("errore nel metodo con throw: "+e.getMessage());
        }
    }

    public static void metodoCheLanciaEccezione() throws Exception{
        throw new Exception("eccezione lanciata dal metodo");
    }

    public static void eccezioneNonVerificata(){
        //non verificata
        try{
            @SuppressWarnings("unused")
            int errore=10/0;
        }catch(ArithmeticException e){
            System.out.println("errore con eccezione non verificata: "+e.getMessage());
        }

        //nell'aoutput verranno fuori entrambe le eccezzioni perche non c'è niente che impedisca il normale flusso del codice
        try{
            throw new Exception("eccezione verificata");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void eccezionePerValidazione(){
        
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("inserisci un numero positivo");
        int numero = scan.nextInt();
        try {
            numeroPositivo(numero);
        } catch (Exception e) {
            System.out.println("errore: "+e.getMessage());
        }

    }

    public static void numeroPositivo(int numero){
        if (numero<=0) {
            throw new IllegalArgumentException("il numero non è positivo"); 
        }
    }

    public static void main(String[]args){

        //eccezzioneAritmetica();


        //le eccezioni multiple quando rilvano il primo errore itnerrompono l'esecuzione delle eccezzioni e mandano immediatamente segale di errore
        //eccezioniMultiple();

        //il blocco finally viene eseguito indipendente dalla cattura di una eccezione o meno
        //eccezioniConBloccoFinally();

        //eccezionePersonalizzata();

        //semplicemente un try all'interno di un altro try
        //eccezioneAnnidata();

        //eccezioneParziale();

        //eccezioneConThrow();

        //eccezioneNonVerificata();

        eccezionePerValidazione();

    }
}
