package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoComposite;

public class CalculatorWithCounterDelegateCompositeMain {
    public static void main(String[] args) {
        /*
         * Выводит результат используя объект класса calculatorWithCounterAutoComposite и добавили автоматический счётчик,который вернули через метод get
         */
        CalculatorWithCounterAutoComposite calculatorWithCounterAutoComposite = new CalculatorWithCounterAutoComposite();
        double resultMultiplication = calculatorWithCounterAutoComposite.calculatorMultiplication(15,7);
        double resultDivision = calculatorWithCounterAutoComposite.calculatorDivision(28, 5);
        double resultExponentiation = calculatorWithCounterAutoComposite.calculatorExponentiation(resultDivision, 2);
        double resultAdd = calculatorWithCounterAutoComposite.calculatorAddition(4.1, resultMultiplication);
        double result = calculatorWithCounterAutoComposite.calculatorAddition(resultAdd, resultExponentiation);
        System.out.println(result);
        System.out.println(calculatorWithCounterAutoComposite.getCountOperation());
    }
}
