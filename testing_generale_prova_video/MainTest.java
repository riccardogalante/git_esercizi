package testing_generale_prova_video;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main testing = new Main();

    @org.junit.jupiter.api.Test
    void somma_di_due_integer() {
        Integer result = testing.sum(1,2);
        assertEquals(3, result, "Somma di 1 + 2 dovrebbe essere 3");
    }
    @Test
    void somma_di_integer_negativo() {
        Integer result = testing.sum(-1,2);
        assertEquals(1, result, "Somma di -1 + 2 dovrebbe essere 1");
    }
    @Test
    void somma_di_null_e_integer() {
        Integer result = testing.sum(null,2);
//        assertEquals(1, result, "Somma di -1 + 2 dovrebbe essere 1");
        assertNull(result, "Se uno dei parametri è null risultato è null");
    }
    @Test
    void moltiplicazione_di_due_integer() {
        Integer result = testing.multiply(1,2);
        assertEquals(2, result, "moltiplicazione di 1 * 2 dovrebbe essere 2");
    }
    @Test
    void moltiplicazione_di_due_integer_non_uno() {
        Integer result = testing.multiply(5,2);
        assertEquals(10, result, "moltiplicazione di 5 * 2 dovrebbe essere 10");
    }

    @Test
    void moltiplicazione_con_null() {
        Integer result = testing.multiply(null,2);
        assertNull(result, "Moltiplicazione con null odvrebbe restituire null");
    }

}