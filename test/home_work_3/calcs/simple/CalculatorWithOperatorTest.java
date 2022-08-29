package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithOperatorTest {
    ICalculator calculatorWithOperator = new CalculatorWithOperator();

    @Test
    void addition() {
        assertEquals(109.1, calculatorWithOperator.addition(4.1, 105));
    }

    @Test
    void subtraction() {
        assertEquals(0, calculatorWithOperator.subtraction(1, 1));
    }

    @Test
    void multiplication() {
        assertEquals(105, calculatorWithOperator.multiplication(15, 7));
    }

    @Test
    void division() {
        assertEquals(5.6, calculatorWithOperator.division(28, 5));
    }

    @Test
    void exponentiation() {
        assertEquals(31.359999999999996, calculatorWithOperator.exponentiation(5.6, 2));
    }

    @Test
    void module() {
        assertEquals(1, calculatorWithOperator.module(-1));
    }

    @Test
    void squareRoot() {
        assertEquals(3, calculatorWithOperator.squareRoot(9));
    }
}