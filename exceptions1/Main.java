package exceptions1;

import java.util.HashSet;

//Scrivere una funzione che controlli se un numero int è in un determinato range. Se lo, è ritorna true ; se non lo è, lancia un'eccezione.
public class Main {
    public static void main(String[] args) {
        int numero = 5;
        System.out.println(controllaNumeroNelRange(numero,2,6));
        
    }
    public static boolean controllaNumeroNelRange(int numeroDaControllare, int rangeMinore, int rangeMaggiore){
        if (numeroDaControllare > rangeMinore && numeroDaControllare < rangeMaggiore) {
            return true;
        } else {
            throw new ArithmeticException("Il numero non è nel range");
        }

    }
}
