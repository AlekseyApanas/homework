package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemory implements ICalculator {
    private double lastOperation;
    private double memory;
    private long counter;
    public ICalculator iCalculator;
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
     * Конструктор,который возвращает ссылку на объект интерфейса
     *
     * @param iCalculator
     */
    public CalculatorWithMemory(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    /**
     * Имплементировали методы из Интерфейса
     */
    @Override
    public double addition(double firstNumber, double secondNumber) {
        incrementCountOperation();
        lastOperation = iCalculator.addition(firstNumber, secondNumber);
        return lastOperation;
    }

    @Override
    public double subtraction(double firstNumber, double secondNumber) {
        incrementCountOperation();
        lastOperation = iCalculator.subtraction(firstNumber, secondNumber);
        return lastOperation;
    }

    @Override
    public double multiplication(double firstNumber, double secondNumber) {
        incrementCountOperation();
        lastOperation = iCalculator.multiplication(firstNumber, secondNumber);
        return lastOperation;
    }

    @Override
    public double division(double firstNumber, double secondNumber) {
        incrementCountOperation();
        lastOperation = iCalculator.division(firstNumber, secondNumber);
        return lastOperation;
    }

    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        incrementCountOperation();
        lastOperation=iCalculator.exponentiation(firstNumber, secondNumber);
        return lastOperation;
    }

    @Override
    public double module(double firstNumber) {
        incrementCountOperation();
        lastOperation = iCalculator.module(firstNumber);
        return lastOperation;
    }

    @Override
    public double squareRoot(double firstNumber) {
        incrementCountOperation();
        lastOperation = iCalculator.squareRoot(firstNumber);
        return lastOperation;
    }

    /**
     * Перезаписываем число
     */
    public void clearMemory() {
        memory = 0;
    }

    /**
     * Устанавливаем значение последней операции
     * @param lastOperation
     */
    public void setMemory(double lastOperation) {
        memory = lastOperation;
    }

    /**
     * Вовращаем реультат последней операции
     * @return
     */
    public double getMemory() {
        return memory;
    }

}
