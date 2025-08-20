import entities.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    void TestSum() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.sum(2, 3));
        assertEquals(0, calculator.sum(-2, 2));
        assertEquals(-10, calculator.sum(-7, -3));
    }

    @Test
    void TestValidAnswer() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.isValidAnswer('Y'));
        assertTrue(calculator.isValidAnswer('N'));
        assertFalse((calculator.isValidAnswer('A')));
        assertFalse((calculator.isValidAnswer(' ')));
    }
}
