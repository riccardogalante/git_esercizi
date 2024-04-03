package testing3;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void test_data_main(){
        ZonedDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z").toZonedDateTime();
        String dataFormattata = data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
        assertEquals("01 marzo 2023",dataFormattata);
    }
}