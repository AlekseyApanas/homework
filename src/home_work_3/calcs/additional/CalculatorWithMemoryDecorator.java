package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMemoryDecorator implements ICalculator {
    private double lastOperationOne;
    ICalculator calculatorOne;

    /**
     * Конструктор принимающий объект типа ICalculator
     */
    public CalculatorWithMemoryDecorator(ICalculator calculatorOne) {
        this.calculatorOne = calculatorOne;
    }

    /**
     * Имплементировали методы из Интерфейса
     */
    @Override
    public double addition(double firstNumber, double secondNumber) {
        lastOperationOne = calculatorOne.addition(firstNumber, secondNumber);
        return lastOperationOne;
    }

    @Override
    public double subtraction(double firstNumber, double secondNumber) {
        lastOperationOne = calculatorOne.subtraction(firstNumber, secondNumber);
        return lastOperationOne;
    }

    @Override
    public double multiplication(double firstNumber, double secondNumber) {
        lastOperationOne = calculatorOne.multiplication(firstNumber, secondNumber);
        return lastOperationOne;
    }

    @Override
    public double division(double firstNumber, double secondNumber) {
        lastOperationOne = calculatorOne.division(firstNumber, secondNumber);
        return lastOperationOne;
    }

    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        lastOperationOne = calculatorOne.exponentiation(firstNumber, secondNumber);
        return lastOperationOne;
    }

    @Override
    public double module(double firstNumber) {
        lastOperationOne = calculatorOne.module(firstNumber);
        return lastOperationOne;
    }

    @Override
    public double squareRoot(double firstNumber) {
        calculatorOne.squareRoot(firstNumber);
        return lastOperationOne;
    }

    ICalculator getCalculator(ICalculator calculatorMemoryOne) {

        return calculatorMemoryOne;
    }
}
