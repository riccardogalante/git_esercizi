package testing2;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni -Crea dei test per questo esercizio
public class Main {
    public static void main(String[] args) {
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String dataFull = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
        String dataMedium = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        String dataShort = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("data intera: "+dataFull);
        System.out.println("data media: "+dataMedium);
        System.out.println("data corta: "+dataShort);
    }
}
