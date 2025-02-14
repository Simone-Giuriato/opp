import java.util.List;
import java.util.ArrayList;
/*
    l'obbiettivo dei generics è permettermi di scrivere una sola volta il codice in modo tale da poterlo riusare per svariate tipologie di dato.
    Questo grazie alla scittura di una singola istanza che definisce al momento della dichiarazione il tipo di dato che verrà trattato dalla
    mia classe crata con il generics. (praticamente si basa sul fato che il numero di volte che scrivi istanze specializzate per tipo sarà sempre 
    minore rispetto al numero di volte che scriveresti metodi specifici per tipologia di dato)
*/
//creazione della classe generica
class Container<T>{

    private T value;

    public void setValue(T value){
        this.value=value;
    }

    public T getValue(){
        return this.value;
    }
}

//generics con un estensione dei tipi di valori che la mia variabile generica "T" può contenere
//Number può avere=>[byte, float, double, int, long, short]
class Calculator<T extends Number>{
    //il metodo "doubleValue()" permette di avere una variabile double rispetto a quella di partenza
    public double Add(T x, T y){
        return (x.doubleValue()+y.doubleValue());
    }
}


public class generics {

    //metodo che permettere ad una lista, di tipologia ristretta dal campo numbers, di essere stampata
    public static void StampaLista(List<? extends Number> ListaPartenza){
        for(Number tempList: ListaPartenza)
            System.out.print(tempList+" ");
        System.out.println();
    }

    //in questo metodo di scambio ho dichiartato la presenza di un tipo di variabile generica "T"
    //e, presa una lista di un tipo generico T, assumo che due variabili di tipo generico T abbiano rispettivamente il primo e l'ultimo valore della lista.
    //poi faccio avvenire lo scambio, senza dover mettere nessun valore di ritorno (essendo le liste passate per parametro non ne necessito per lo scambio) 
    /*
        N.B.: ->non avendo intaccato la tipologia originaria della lista qualunque fosse il valore del metodo "StampaLista()", creato ed usato precedentemente,
                non ho problemi ad riutilizzarla dopo l'uso dello Swap;
              ->lo "sSwapFirstWithLast()" method va usato esclussivamente con una Array dinamico (ArrayList) perchè, in caso di struttura non dinamica, viene
                rilevata un eccezzione e il programma va in crash
    */
    public static <T> void SwapFirstWithLast(List<T> ListaDiPartenza){    
        T temp= ListaDiPartenza.getLast();
        T temp2= ListaDiPartenza.getFirst();
        ListaDiPartenza.set(ListaDiPartenza.size()-1, temp2);
        ListaDiPartenza.set(0, temp);
    }

    public static void main(String[]args){
        //dichiarazione di un oggetto di una tipologia specifica inserendo all'interno di "<>" il tipo dell'oggetto
        Container<String> ContainerDiStringhe = new Container<>();
        ContainerDiStringhe.setValue("hello world");
        System.out.println("valore all'interno del container String: "+ContainerDiStringhe.getValue());

        //non è possibile usare tipi primitivi di dati (int, double, float...)
        //si possono usare solo wrapper class (Integer, Doubl, ...) come tipi di dato per una classe/interfaccia generica
        Container<Integer> ContainerDiInteger = new Container<>();
        ContainerDiInteger.setValue(42);
        System.out.println("valore all'interno del container Integer: "+ContainerDiInteger.getValue());

        Container<Double> ContainerDiDouble = new Container<>();
        ContainerDiDouble.setValue(87.32);
        System.out.println("valore all'interno del container Double: "+ContainerDiDouble.getValue());

        System.out.println("\n\ntest dei metodi generics specifici\n");
        //test dei metodi generics specifici
        Calculator<Integer> calolatriceInteger= new Calculator<>();
        Calculator<Double> calolatriceDouble= new Calculator<>();

        Container<Integer> ContainerDiIntegerN2= new Container<>();
        ContainerDiIntegerN2.setValue(12);
        System.out.println("la somma tra i due container di integer: "+ContainerDiInteger.getValue()+" e "+ContainerDiIntegerN2.getValue()+" e' "+calolatriceInteger.Add(ContainerDiInteger.getValue(), ContainerDiIntegerN2.getValue()));

        Container<Double> ContainerDiDoubleN2= new Container<>();
        ContainerDiDoubleN2.setValue(12.68);
        System.out.println("la somma tra i due container di integer: "+ContainerDiDouble.getValue()+" e "+ContainerDiDoubleN2.getValue()+" e' "+calolatriceDouble.Add(ContainerDiDouble.getValue(), ContainerDiDoubleN2.getValue()));

        System.out.println("\n\ntest con generics in una lista\n");
        //prova con generics in una lista
        List<Integer> ListaInteger = List.of(1,2,3,4,5);
        List<Double> ListaDouble = List.of(1.1,2.2,3.3,4.4,5.5);

        System.out.print("Stampa della lista di Integer: ");
        StampaLista(ListaInteger);

        System.out.print("Stampa della lista di Double: ");
        StampaLista(ListaDouble);


        System.out.println("\n\ntest dell'uso del metodo Swap creato manualmente per scambiare il primo valore con l'ultimo della lista\n");
        List<Integer> ListaIntegerIntercambiabile = new ArrayList<Integer>();
        ListaIntegerIntercambiabile.add(1);
        ListaIntegerIntercambiabile.add(2);
        ListaIntegerIntercambiabile.add(3);
        List<Double> ListaDoubleIntercambiabile = new ArrayList<Double>();
        ListaDoubleIntercambiabile.add(1.1);
        ListaDoubleIntercambiabile.add(2.2);
        ListaDoubleIntercambiabile.add(3.3);

        System.out.println("lista Integer con i valori originali:");
        StampaLista(ListaIntegerIntercambiabile);
        SwapFirstWithLast(ListaIntegerIntercambiabile);
        System.out.println("lista Integer con i valori scambiati:");
        StampaLista(ListaIntegerIntercambiabile);

        System.out.println("lista Double con i valori originali:");
        StampaLista(ListaDoubleIntercambiabile);
        SwapFirstWithLast(ListaDoubleIntercambiabile);
        System.out.println("lista Double con i valori scambiati:");
        StampaLista(ListaDoubleIntercambiabile);
    }
}

/*
    Inconscaimente anche facendo una Lista/Mappa/Array, con un oggetto come tipologia di variabile,
    Stiamo usando dei generics specifici per preservare la tipologia di quella struttura da altre
    tipologia non gradite
*/