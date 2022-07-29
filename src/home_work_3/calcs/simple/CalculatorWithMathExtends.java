package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {
    /**
     * переопределяем методы из класса CalculatorWithOperator
     * @param firstNumber
     * @param secondNumber
     * @return
     */
    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        double result = Math.pow(firstNumber, secondNumber);
        return result;
    }

    @Override
    public double module(double firstNumber) {
        double result = Math.abs(firstNumber);
        return result;
    }

    @Override
    public double squareRoot(double firstNumber) {
        double result = Math.sqrt(firstNumber);
        return result;
    }
}
