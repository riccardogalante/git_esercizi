package testing1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {


    @Test
    void somma_di_due_integer() {
        Integer result = Main.somma(1,2);
        assertEquals(3, result);
    }
    @Test
    void somma_di_integer_negativo() {
        Integer result = Main.somma(-1,2);
        assertEquals(1, result);
    }

    @Test
    void somma_di_integer_null() {
        Integer result = Main.somma(null,null);
        assertEquals(null, result);
    }

    @Test
    public void doStuff_shouldThrowException_1() {
        try {
            Main.somma(null, 2);
        } catch (ArithmeticException e) {
            System.out.println("Abbiamo un eccezione");
        }
    }
}