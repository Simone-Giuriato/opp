class esercizziIf{

    static void NumeroPositivo(int x){
        if (x>-1) {
            System.out.println("il numero è positivo");
        }else{
            if (x==0) {
                System.out.println("il numero è 0");
            }else
                System.out.println("il numero è negativo");
        }
    }

    static void NumeroPari(int x){
        if (x%2==0) {
            System.out.println("il numero è pari");
        }else{
            System.out.println("il numero è dispari");
        }
    }

    static boolean LetteraMaiuscola(char lettera){
        
        if (lettera>59 || lettera<91) {
            System.out.println("la lettera è maiuscola");
            return true;
        }else{
            if (lettera>96 || lettera<121) {
                System.out.println("la lettera è minuscola");
                return false;
            }else{
                System.out.println("il carattere non è una lettera");
                return false;
            }
        }
    }
    
    static void AnnoBisestile(int x){
        if (x%4==0) {
            System.out.println(x+"è un anno bisestile");
        }else{
            System.out.println(x+"non è bisestile");
        }
    }
    
    static void fraseVuota(String frase){
        String controllo="";
        if ((frase.replace(frase, ""))==controllo) {
            System.out.println("la frase è vuota");
        }else
            System.out.println("la fraase non è vuota");
    }

    static void Vocale(char carattere){
        if (carattere>59 && carattere<91) {
            carattere=(char)(carattere-32);
        }
        if (carattere>96 || carattere<121) {
            if (carattere == 'a' || carattere == 'e' || carattere == 'i' || carattere == 'o' || carattere == 'u') {
                System.out.println("Il carattere è una vocale.");
            } else {
                System.out.println("Il carattere è una consonante.");
            }
        }   
    }



    public static void main(){
        int x=1;
        //numero positivo o negativo o 0
        NumeroPositivo(x);

        //numero pari o dipasri
        NumeroPari(x);

        //carattere maiuscolo minuscolo
        char lettera='A';
        LetteraMaiuscola(lettera);

        //anno bisestile
        AnnoBisestile(2024);

        //se una stringa è vuota
        String frase="   ";
        fraseVuota(frase);

        //controllo vocale consonante
        Vocale(lettera);

    }
}