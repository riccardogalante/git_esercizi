package testing2;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void test_data_full() {
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

        String dataFull = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));

        assertEquals("venerdì 1 marzo 2002 13:00:00 Z", dataFull);
    }
    @Test
    public void test_data_medium() {
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dataMedium = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        assertEquals("1 mar 2002, 13:00:00", dataMedium);
    }@Test
    public void test_data_short() {
        ZonedDateTime data = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();
        String dataShort = data.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        assertEquals("01/03/02, 13:00", dataShort);
    }

}