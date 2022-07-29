package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregation;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateAgregationMain {
    /**
     * Выводит результат используя объект класса calculatorWithCounterAutoAgregation и добавили автоматический счётчик,который вернули через метод get
     */
    public static void main(String[] args) {
        CalculatorWithCounterAutoAgregation calculatorWithCounterAutoAgregation=new CalculatorWithCounterAutoAgregation(new CalculatorWithOperator());
        double resultMultiplication = calculatorWithCounterAutoAgregation.calculatorMultiplication(15, 7);
        double resultDivision = calculatorWithCounterAutoAgregation.calculatorDivision(28, 5);
        double resultExponentiation = calculatorWithCounterAutoAgregation.calculatorExponentiation(resultDivision, 2);
        double resultAdd = calculatorWithCounterAutoAgregation.calculatorAddition(4.1, resultMultiplication);
        double result = calculatorWithCounterAutoAgregation.calculatorAddition(resultAdd, resultExponentiation);
        System.out.println(result);
        System.out.println(calculatorWithCounterAutoAgregation.getCountOperation()-1);

    }
}
