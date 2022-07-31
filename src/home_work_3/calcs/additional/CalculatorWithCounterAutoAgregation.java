package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregation {
    private final CalculatorWithOperator calculator;

    /**
     * Конструктор используется для инициализации поля
     */
    public CalculatorWithCounterAutoAgregation(CalculatorWithOperator calculator) {
        this.calculator = calculator;
    }
    /**
     *Методы для калькулятора
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
   private void incrementCountOperation() {
        counter++;
    }

    /**
     * метод который возвращает кол-во выполнений
     *
     * @return возвращает кол-во выполнений калькулятора
     */
   public long getCountOperation() {
        return counter;
    }
}
