package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        /*
         * Выводит результат используя объект класса calculatorWithCounterClassic и добавили счётчик
         */
        CalculatorWithCounterClassic calculatorWithCounterClassic = new CalculatorWithCounterClassic();
        double resultMultiplication = calculatorWithCounterClassic.multiplication(15, 7);
        calculatorWithCounterClassic.incrementCountOperation();
        double resultDivision = calculatorWithCounterClassic.division(28, 5);
        calculatorWithCounterClassic.incrementCountOperation();
        double resultExponentiation = calculatorWithCounterClassic.exponentiation(resultDivision, 2);
        calculatorWithCounterClassic.incrementCountOperation();
        double resultAdd = calculatorWithCounterClassic.addition(4.1, resultMultiplication);
        calculatorWithCounterClassic.incrementCountOperation();
        double result = calculatorWithCounterClassic.addition(resultAdd, resultExponentiation);
        calculatorWithCounterClassic.incrementCountOperation();
        System.out.println(result);
        System.out.println(calculatorWithCounterClassic.getCountOperation());
    }
}
