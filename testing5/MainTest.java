package testing5;

import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void aggiungiNumeriAllaData() {

    }
    @Test
    void test_data_modificata_main1(){
        String result = String.valueOf(Main.aggiungiNumeriAllaData());
        assertEquals("2024-02-08T13:00Z",result);
    }

    //per una prova il secondo
    @Test
    void test_data_modificata_main2(){
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String dataModificata = String.valueOf(data.plusYears(1).minusMonths(1).plusDays(7));
        assertEquals("2024-02-08T13:00Z",dataModificata);
    }
}