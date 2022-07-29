package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithOperator;


public class CalculatorWithCounterAutoComposite {

    private CalculatorWithOperator calculator;

    /**
     * Конструктор в котором инициальзируется поле обьектом калькулятора с помощью new
     */
    public CalculatorWithCounterAutoComposite() {
        calculator = new CalculatorWithOperator();
        this.calculator = calculator;
    }

    /**
     * Методы для калькулятора
     */
    public double calculatorAddition(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.addition(firstNumber, secondNumber);
    }

    public double calculatorSubtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.subtraction(firstNumber, secondNumber);
    }

    public double calculatorMultiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.multiplication(firstNumber, secondNumber);
    }

    public double calculatorDivision(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.division(firstNumber, secondNumber);
    }

    public double calculatorExponentiation(double firstNumber, int secondNumber) {
        incrementCountOperation();
        return calculator.exponentiation(firstNumber, secondNumber);
    }

    public double calculatorModule(double firstNumber) {
        incrementCountOperation();
        return calculator.module(firstNumber);
    }

    public double calculatorSquareRoot(double firstNumber) {
        incrementCountOperation();
        return calculator.squareRoot(firstNumber);
    }

    private long counter;

    /**
     * Счётчик ,который считает кол-во выполнений
     */
    void incrementCountOperation() {
        counter++;
    }

    /**
     * метод который возвращает кол-во выполнений
     *
     * @return
     */
   public long getCountOperation() {
        incrementCountOperation();
        return counter;
    }
}

