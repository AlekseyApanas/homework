package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithCounterAutoAgregationInterfaceTest {
    ICalculator calculatorWithCounterAutoAgregationInterface = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());

    @Test
    void addition() {
        assertEquals(109.1, calculatorWithCounterAutoAgregationInterface.addition(4.1, 105));
    }

    @Test
    void subtraction() {
        assertEquals(0, calculatorWithCounterAutoAgregationInterface.subtraction(1, 1));
    }

    @Test
    void multiplication() {
        assertEquals(105, calculatorWithCounterAutoAgregationInterface.multiplication(15, 7));
    }

    @Test
    void division() {
        assertEquals(5.6, calculatorWithCounterAutoAgregationInterface.division(28, 5));
    }

    @Test
    void exponentiation() {
        assertEquals(31.359999999999996, calculatorWithCounterAutoAgregationInterface.exponentiation(5.6, 2));
    }

    @Test
    void module() {
        assertEquals(1, calculatorWithCounterAutoAgregationInterface.module(-1));
    }

    @Test
    void squareRoot() {
        assertEquals(3, calculatorWithCounterAutoAgregationInterface.squareRoot(9));
    }
}