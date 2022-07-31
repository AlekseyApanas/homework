package home_work_3.runners;

import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithOperatorMain {
    /**
     * Выводит результат используя методы из класса calculatorWithOperator
     */
    public static void main(String[] args) {
        CalculatorWithOperator calculatorWithOperator=new CalculatorWithOperator();
        double resultMultiplication=calculatorWithOperator.multiplication(15,7);
        double resultDivision=calculatorWithOperator.division(28,5);
        double resultExponentiation=calculatorWithOperator.exponentiation(resultDivision,2);
        double resultAdd=calculatorWithOperator.addition(4.1,resultMultiplication);
        double result=calculatorWithOperator.addition(resultAdd,resultExponentiation);
        System.out.println(result);
    }
}
