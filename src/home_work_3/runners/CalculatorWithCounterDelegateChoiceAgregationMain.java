package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoChoiceAgregation;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterDelegateChoiceAgregationMain {
    public static void main(String[] args) {
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation1 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithOperator());
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation2 = new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoChoiceAgregation calculatorWithCounterAutoChoiceAgregation3= new CalculatorWithCounterAutoChoiceAgregation(new CalculatorWithMathExtends());
        /**
         * Выводит результат используя объект класса calculatorWithCounterAutoComposite и добавили автоматический счётчик
         *CalculatorWithOperator
         */
        double resultMultiplicationFirst = calculatorWithCounterAutoChoiceAgregation1.calculatorMultiplication(15, 7);
        double resultDivisionFirst = calculatorWithCounterAutoChoiceAgregation1.calculatorDivision(28, 5);
        double resultExponentiationFirst = calculatorWithCounterAutoChoiceAgregation1.calculatorExponentiation(resultDivisionFirst, 2);
        double resultAddFirst = calculatorWithCounterAutoChoiceAgregation1.calculatorAddition(4.1, resultMultiplicationFirst);
        double resultFirst = calculatorWithCounterAutoChoiceAgregation1.calculatorAddition(resultAddFirst, resultExponentiationFirst);
        System.out.println(resultFirst);
        System.out.println(calculatorWithCounterAutoChoiceAgregation1.getCountOperation() - 1);
        /**
         * Выводит результат используя объект класса calculatorWithCounterAutoComposite и добавили автоматический счётчик
         * CalculatorWithMathCopy
         */
        double resultMultiplicationSecond = calculatorWithCounterAutoChoiceAgregation2.calculatorMultiplication(15, 7);
        double resultDivisionSecond = calculatorWithCounterAutoChoiceAgregation2.calculatorDivision(28, 5);
        double resultExponentiationSecond = calculatorWithCounterAutoChoiceAgregation2.calculatorExponentiation(resultDivisionSecond, 2);
        double resultAddSecond = calculatorWithCounterAutoChoiceAgregation2.calculatorAddition(4.1, resultMultiplicationSecond);
        double resultSecond = calculatorWithCounterAutoChoiceAgregation2.calculatorAddition(resultAddSecond, resultExponentiationSecond);
        System.out.println(resultSecond);
        System.out.println(calculatorWithCounterAutoChoiceAgregation2.getCountOperation() - 1);
        /**
         * Выводит результат используя объект класса calculatorWithCounterAutoComposite и добавили автоматический счётчик
         *CalculatorWithMathExtends
         */
        double resultMultiplicationThree = calculatorWithCounterAutoChoiceAgregation3.calculatorMultiplication(15, 7);
        double resultDivisionThree = calculatorWithCounterAutoChoiceAgregation3.calculatorDivision(28, 5);
        double resultExponentiationThree = calculatorWithCounterAutoChoiceAgregation3.calculatorExponentiation(resultDivisionThree, 2);
        double resultAddThree = calculatorWithCounterAutoChoiceAgregation3.calculatorAddition(4.1, resultMultiplicationThree);
        double resultThree = calculatorWithCounterAutoChoiceAgregation3.calculatorAddition(resultAddThree, resultExponentiationThree);
        System.out.println(resultThree);
        System.out.println(calculatorWithCounterAutoChoiceAgregation3.getCountOperation() - 1);
    }
}
