package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithMemoryTest {
    ICalculator calculatorWithMemory = new CalculatorWithMemory(new CalculatorWithOperator());

    @Test
    void addition() {
        assertEquals(109.1, calculatorWithMemory.addition(4.1, 105));
    }

    @Test
    void subtraction() {
        assertEquals(0, calculatorWithMemory.subtraction(1, 1));
    }

    @Test
    void multiplication() {
        assertEquals(105, calculatorWithMemory.multiplication(15, 7));
    }

    @Test
    void division() {
        assertEquals(5.6, calculatorWithMemory.division(28, 5));
    }

    @Test
    void exponentiation() {
        assertEquals(31.359999999999996, calculatorWithMemory.exponentiation(5.6, 2));
    }

    @Test
    void module() {
        assertEquals(1, calculatorWithMemory.module(-1));
    }

    @Test
    void squareRoot() {
        assertEquals(3, calculatorWithMemory.squareRoot(9));
    }
}