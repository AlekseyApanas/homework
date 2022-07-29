package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        /**
         * Выводит результат используя объект класса calculatorWithMemory
         */
        CalculatorWithMemory calculatorWithMemory = new CalculatorWithMemory(new CalculatorWithOperator());
        double resultMultiplication =calculatorWithMemory.multiplication(15, 7);
        double resultDivision = calculatorWithMemory.division(28, 5);
        double resultExponentiation = calculatorWithMemory.exponentiation(resultDivision, 2);
        double resultAdd = calculatorWithMemory.addition(4.1, resultMultiplication);
        double result = calculatorWithMemory.addition(resultAdd, resultExponentiation);
        System.out.println(result);
        System.out.println(calculatorWithMemory.getfunctionsMemory(result));
        System.out.println(calculatorWithMemory.getCountOperation()-1);
    }
}