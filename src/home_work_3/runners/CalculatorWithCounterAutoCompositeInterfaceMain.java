package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {
        /*
         * Выводит результат используя объект класса calculatorWithCounterAutoAgregationInterface и добавили автоматический счётчик
         */
        CalculatorWithCounterAutoAgregationInterface calculatorWithCounterAutoAgregationInterface=new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        double resultMultiplication = calculatorWithCounterAutoAgregationInterface.multiplication(15, 7);
        double resultDivision = calculatorWithCounterAutoAgregationInterface.division(28, 5);
        double resultExponentiation = calculatorWithCounterAutoAgregationInterface.exponentiation(resultDivision, 2);
        double resultAdd = calculatorWithCounterAutoAgregationInterface.addition(4.1, resultMultiplication);
        double result= calculatorWithCounterAutoAgregationInterface.addition(resultAdd, resultExponentiation);
        System.out.println(result);
        System.out.println(calculatorWithCounterAutoAgregationInterface.getCountOperation());
    }
}
