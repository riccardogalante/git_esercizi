package testing5;

import java.time.OffsetDateTime;

//Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//aggiungi un anno
//sottrai un mese
//aggiungi 7 giorni
//Stampa il risultato localizzata per l'Italia
//Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {

    }
    public static OffsetDateTime aggiungiNumeriAllaData(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        OffsetDateTime dataModificata = data.plusYears(1).minusMonths(1).plusDays(7);
        return dataModificata;
    }
}
