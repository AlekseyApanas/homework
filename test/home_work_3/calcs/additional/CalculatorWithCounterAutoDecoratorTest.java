package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorWithCounterAutoDecoratorTest {
    ICalculator calculatorWithCounterAutoDecorator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithOperator()));


    @Test
    void addition() {
        assertEquals(109.1, calculatorWithCounterAutoDecorator.addition(4.1, 105));
    }

    @Test
    void subtraction() {
        assertEquals(0, calculatorWithCounterAutoDecorator.subtraction(1, 1));
    }

    @Test
    void multiplication() {
        assertEquals(105, calculatorWithCounterAutoDecorator.multiplication(15, 7));
    }

    @Test
    void division() {
        assertEquals(5.6, calculatorWithCounterAutoDecorator.division(28, 5));
    }

    @Test
    void exponentiation() {
        assertEquals(31.359999999999996, calculatorWithCounterAutoDecorator.exponentiation(5.6, 2));
    }

    @Test
    void module() {
        assertEquals(1, calculatorWithCounterAutoDecorator.module(-1));
    }

    @Test
    void squareRoot() {
        assertEquals(3, calculatorWithCounterAutoDecorator.squareRoot(9));
    }
}