package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        /**
         * Выводит результат используя объект класса calculatorWithCounterClassic и добавили счётчик
         */
        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();
        double resultMultiplication = calculatorWithCounterClassic.multiplication(15, 7);
        calculatorWithCounterClassic.getCountOperation();
        double resultDivision = calculatorWithCounterClassic.division(28, 5);
        calculatorWithCounterClassic.getCountOperation();
        double resultExponentiation = calculatorWithCounterClassic.exponentiation(resultDivision, 2);
        calculatorWithCounterClassic.getCountOperation();
        double resultAdd = calculatorWithCounterClassic.addition(4.1, resultMultiplication);
        calculatorWithCounterClassic.getCountOperation();
        double result = calculatorWithCounterClassic.addition(resultAdd, resultExponentiation);
        calculatorWithCounterClassic.getCountOperation();
        System.out.println(result);
        System.out.println(calculatorWithCounterClassic.getCountOperation()-1);
    }
}
