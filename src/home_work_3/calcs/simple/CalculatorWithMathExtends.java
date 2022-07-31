package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * переопределяем методы из класса CalculatorWithOperator
     * @param firstNumber аргумент первого числа
     * @param secondNumber аргумент второго числа
     * @return возвращает результат метода
     */
    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }

    @Override
    public double module(double firstNumber) {
        return Math.abs(firstNumber);
    }

    @Override
    public double squareRoot(double firstNumber) {
        return Math.sqrt(firstNumber);
    }
}
