package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithMathCopyTest {
    ICalculator calculatorWithMathCopy = new CalculatorWithOperator();

    @Test
    void addition() {
        assertEquals(109.1, calculatorWithMathCopy.addition(4.1, 105));
    }

    @Test
    void subtraction() {
        assertEquals(0, calculatorWithMathCopy.subtraction(1, 1));
    }

    @Test
    void multiplication() {
        assertEquals(105, calculatorWithMathCopy.multiplication(15, 7));
    }

    @Test
    void division() {
        assertEquals(5.6, calculatorWithMathCopy.division(28, 5));
    }

    @Test
    void exponentiation() {
        assertEquals(31.359999999999996, calculatorWithMathCopy.exponentiation(5.6, 2));
    }

    @Test
    void module() {
        assertEquals(1, calculatorWithMathCopy.module(-1));
    }

    @Test
    void squareRoot() {
        assertEquals(3, calculatorWithMathCopy.squareRoot(9));
    }
}