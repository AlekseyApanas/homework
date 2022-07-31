package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithMathExtendsMain {
    /**
     * Выводит результат используя объект класса calculatorWithMathExtends и переопределение метода
     */
    public static void main(String[] args) {
        CalculatorWithMathExtends calculatorWithMathExtends = new CalculatorWithMathExtends();
        double resultMultiplication = calculatorWithMathExtends.multiplication(15, 7);
        double resultDivision = calculatorWithMathExtends.division(28, 5);
        double resultExponentiation = calculatorWithMathExtends.exponentiation(resultDivision, 2);
        double resultAdd = calculatorWithMathExtends.addition(4.1, resultMultiplication);
        double result = calculatorWithMathExtends.addition(resultAdd, resultExponentiation);
        System.out.println(result);
    }
}
