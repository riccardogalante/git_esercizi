package hashset1;

import java.util.HashSet;

//Scrivere una funzione che restituisca un hashset riempito
//Leggere l'hashSet e stampre grandezza ed elementi
public class Main {
    public static void main(String[] args) {
        HashSet<String> hashSet = hashSetRiempito();
        grandezzaElementi(hashSet);

    }
    public static HashSet<String> hashSetRiempito() {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("Elemento1");
        hashSet.add("Elemento2");
        hashSet.add("Elemento3");
        return hashSet;
    }
    public static void grandezzaElementi(HashSet<String> hashSet){
        System.out.println(hashSet);
        System.out.println(hashSetRiempito().size());
        for (String i : hashSet) {
            System.out.println(i);
        }
    }

}
