package stringbuilder1;
//Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.
//Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
//Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.

public class Main {
    public static void main(String[] args) {
        String stringa1 = ("ciao sono Giorgio");
        String stringa2 = ("ciao sono Giorgio");
        System.out.println(comparazioneStringhe(stringa1,stringa2));
    }
    public static String comparazioneStringhe(String prima, String seconda){
        StringBuilder risultato = new StringBuilder();
        if (prima.compareTo(seconda) == 0) {
            risultato.append("Le due stringhe sono uguali");
        } else {
            risultato.append("Le due stringhe non sono uguali");
        }
        return risultato.toString();
    }
}
