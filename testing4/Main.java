package testing4;

import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//Ottieni l'anno
//Ottieni il mese
//Ottieni il giorno
//Ottieni il giorno della settimana
//Stampa i risultati sulla console -Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer anno = data.getYear();
        String mese = data.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        Integer giorno = data.getDayOfMonth();
        String giornoDellaSettimana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        System.out.println("anno: "+ anno+ " mese: "+mese+" giorno: "+giorno+ " giorno della settimana: "+giornoDellaSettimana);
    }
}