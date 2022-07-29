package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMathCopyMain {
    /**
     * Выводит результат используя методы из класса calculatorWithMathCopy
     * @param args
     */
    public static void main(String[] args) {
        CalculatorWithMathCopy calculatorWithMathCopy = new CalculatorWithMathCopy();
        double resultMultiplication = calculatorWithMathCopy.multiplication(15, 7);
        double resultDivision = calculatorWithMathCopy.division(28, 5);
        double resultExponentiation = calculatorWithMathCopy.exponentiation(resultDivision, 2);
        double resultAdd = calculatorWithMathCopy.addition(4.1, resultMultiplication);
        double result = calculatorWithMathCopy.addition(resultAdd, resultExponentiation);
        System.out.println(result);
    }
}
