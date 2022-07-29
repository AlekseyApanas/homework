package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoSuper;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuperMain {
    public static void main(String[] args) {
        /**
         * Выводит результат используя объект класса CalculatorWithCounterAutoSuper и добавили автоматический счётчик
         */
        CalculatorWithCounterAutoSuper calculatorWithCounterAutoSuper=new CalculatorWithCounterAutoSuper();
        double resultMultiplication = calculatorWithCounterAutoSuper.multiplication(15, 7);
        calculatorWithCounterAutoSuper.getCountOperation();
        double resultDivision = calculatorWithCounterAutoSuper.division(28, 5);
        calculatorWithCounterAutoSuper.getCountOperation();
        double resultExponentiation = calculatorWithCounterAutoSuper.exponentiation(resultDivision, 2);
        calculatorWithCounterAutoSuper.getCountOperation();
        double resultAdd = calculatorWithCounterAutoSuper.addition(4.1, resultMultiplication);
        calculatorWithCounterAutoSuper.getCountOperation();
        double result = calculatorWithCounterAutoSuper.addition(resultAdd, resultExponentiation);
        System.out.println(result);
        System.out.println(calculatorWithCounterAutoSuper.getCountOperation()-1);
    }
}
