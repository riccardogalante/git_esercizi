package hashset3;

import java.util.HashSet;

//Scrivere una funzione che restituisca un hashset riempito
//Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//Svuotare l'hashset, verificarlo e stampare il risultato
public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = hashSetRiempito();
        stampaElementoInserito(hashSet);
    }
    public static HashSet<String> hashSetRiempito() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");
        return hashSet;
    }
    public static void stampaElementoInserito(HashSet<String> hashSet){
        System.out.println("hashset: " + hashSet);
        String oggettoUguale = "Elemento3";
        hashSet.add(oggettoUguale);
        boolean esiste = hashSet.contains(oggettoUguale);
        System.out.println("l'elemento " + oggettoUguale + " è dentro l'hashset? " + esiste);

        for(String i: hashSet){
            if(i == oggettoUguale){
                hashSet.remove(oggettoUguale);
            }
        }
        System.out.println(hashSet);

        hashSet.clear();

        System.out.println("L'hashset è vuoto? "+ hashSet.isEmpty());
    }
}
