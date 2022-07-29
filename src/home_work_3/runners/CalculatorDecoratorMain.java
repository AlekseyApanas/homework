package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) {
        ICalculator iCalculator = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));
        double resultMultiplication = iCalculator.multiplication(15, 7);
        double resultDivision = iCalculator.division(28, 5);
        double resultExponentiation = iCalculator.exponentiation(resultDivision, 2);
        double resultAdd = iCalculator.addition(4.1, resultMultiplication);
        double result = iCalculator.addition(resultAdd, resultExponentiation);

        CalculatorWithCounterAutoDecorator calculatorWithCounterAutoDecorator = null;
        if (iCalculator instanceof CalculatorWithCounterAutoDecorator) {
            calculatorWithCounterAutoDecorator =(CalculatorWithCounterAutoDecorator) iCalculator;
        } else {
            return;
        }
        CalculatorWithMemoryDecorator calculatorWithMemoryDecorator = null;
        if (calculatorWithCounterAutoDecorator.getCalculator() instanceof CalculatorWithMemoryDecorator) {
            calculatorWithMemoryDecorator = (CalculatorWithMemoryDecorator)calculatorWithCounterAutoDecorator.getCalculator();
        } else {
            return;
        }
        System.out.println(result);
        System.out.println(((CalculatorWithCounterAutoDecorator) iCalculator).getCountOperation() - 1);
        /*calculatorWithMemoryDecorator.setMemory(result);*/
        System.out.println(calculatorWithMemoryDecorator.getMemory());

    }
}
