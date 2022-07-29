package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoAgregationInterface implements ICalculator {
    private long counter;
    public ICalculator calculator;

    /**
     * Конструктор принимающий объект типа ICalculator
     *
     * @param calculator
     */
    public CalculatorWithCounterAutoAgregationInterface(ICalculator calculator) {
        this.calculator = calculator;
    }

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

    /**
     * Имплементировали методы из Интерфейса
     * добавили счётчик
     */
    @Override
    public double addition(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.addition(firstNumber, secondNumber);
    }

    @Override
    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.subtraction(firstNumber, secondNumber);
    }

    @Override
    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.multiplication(firstNumber, secondNumber);
    }

    @Override
    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        return calculator.division(firstNumber, secondNumber);
    }

    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        incrementCountOperation();
        return calculator.exponentiation(firstNumber, secondNumber);
    }

    @Override
    public double module(double firstNumber) {
        incrementCountOperation();
        return calculator.module(firstNumber);
    }

    @Override
    public double squareRoot(double firstNumber) {
        incrementCountOperation();
        return calculator.squareRoot(firstNumber);
    }
}
