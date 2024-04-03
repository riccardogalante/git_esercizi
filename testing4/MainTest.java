package testing4;

import org.junit.jupiter.api.Test;
import java.time.OffsetDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void test_main_anno() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer anno = data.getYear();
        assertEquals(2023,anno);
    }
    @Test
    void test_main_mese() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String mese = data.getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        assertEquals("marzo",mese);
    }
    @Test
    void test_main_giorno() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        Integer giorno = data.getDayOfMonth();
        assertEquals(1,giorno);
    }
    @Test
    void test_main_giorno_della_settimana() {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String giornoDellaSettimana = data.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
        assertEquals("mercoledì",giornoDellaSettimana);
    }
}