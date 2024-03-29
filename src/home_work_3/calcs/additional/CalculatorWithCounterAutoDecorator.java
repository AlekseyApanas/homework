package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {
    private int counter;
    private double lastOperationTwo;
    private final CalculatorWithMemoryDecorator calculatorTwo;

    /**
     * Счётчик ,который считает кол-во выполнений
     */
    private void incrementCountOperation() {
        counter++;
    }

    /**
     * метод который возвращает кол-во выполнений
     *
     * @return - возвращает кол-во выполнений калькулятора
     */
    public long getCountOperation() {
        return counter;
    }

    /**
     * Конструктор принимающий объект типа CalculatorWithMemoryDecorator
     */
    public CalculatorWithCounterAutoDecorator(CalculatorWithMemoryDecorator calculatorTwo) {
        this.calculatorTwo = calculatorTwo;
    }

    /**
     * Имплементировали методы из Интерфейса
     */
    @Override
    public double addition(double firstNumber, double secondNumber) {
        incrementCountOperation();
        lastOperationTwo = calculatorTwo.addition(firstNumber, secondNumber);
        return lastOperationTwo;
    }

    @Override
    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        lastOperationTwo = calculatorTwo.subtraction(firstNumber, secondNumber);
        return lastOperationTwo;
    }

    @Override
    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        lastOperationTwo = calculatorTwo.multiplication(firstNumber, secondNumber);
        return lastOperationTwo;
    }

    @Override
    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        lastOperationTwo = calculatorTwo.division(firstNumber, secondNumber);
        return lastOperationTwo;
    }

    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        incrementCountOperation();
        lastOperationTwo = calculatorTwo.exponentiation(firstNumber, secondNumber);
        return lastOperationTwo;
    }

    @Override
    public double module(double firstNumber) {
        incrementCountOperation();
        lastOperationTwo = calculatorTwo.module(firstNumber);
        return lastOperationTwo;
    }

    @Override
    public double squareRoot(double firstNumber) {
        incrementCountOperation();
        lastOperationTwo = calculatorTwo.squareRoot(firstNumber);
        return lastOperationTwo;
    }

    public ICalculator getCalculator() {
        return calculatorTwo;
    }

}
