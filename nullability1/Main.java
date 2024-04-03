package nullability1;
//Scrivere una funzione che accetti in input un numeratore e un denominatore
//Controlli che il numeratore e il denominatore non siano null
//Usare la funzione appena scritta in due blocchi di codice dove si cattura l'eventuale eccezione.
public class Main {
    public static void main(String[] args) {
        int numeratore = 10;
        Integer denominatore = null;
        stampaControlloNumeratoreDenominatore(numeratore, denominatore);
    }

    public static void stampaControlloNumeratoreDenominatore(Integer numeratore, Integer denominatore) {
        try {
            if (numeratore != null) {
                System.out.println(numeratore);
            }
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
        try {
            Integer nuova = denominatore = null;
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }

}
//    public static void main(String[] args) {
//        // Esempio di utilizzo con eccezioni gestite
//        try {
//            int numeratore = 10;
//            Integer denominatore = null; // Modifica il valore per generare un'eccezione
//
//            gestisciDivisione(numeratore, denominatore);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Errore: " + e.getMessage());
//        }
//
//        // Esempio di utilizzo senza eccezioni
//        int numeratore2 = 20;
//        int denominatore2 = 5;
//
//        gestisciDivisione(numeratore2, denominatore2);
//    }
//
//    public static void gestisciDivisione(int numeratore, Integer denominatore) {
//        try {
//            verificaInput(numeratore, denominatore);
//
//            // Esegui la divisione se i controlli passano
//            double risultato = numeratore / denominatore;
//            System.out.println("Il risultato della divisione è: " + risultato);
//        } catch (IllegalArgumentException e) {
//            // Cattura l'eccezione e gestisci l'errore
//            throw new IllegalArgumentException("Errore durante la divisione: " + e.getMessage());
//        }
//    }
//
//    public static void verificaInput(int numeratore, Integer denominatore) {
//        // Controlla se il numeratore o il denominatore sono nulli
//        if (numeratore == 0 || denominatore == null) {
//            throw new IllegalArgumentException("Numeratore o denominatore nulli.");
//        }
//    }
//}