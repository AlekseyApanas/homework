package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calculatorFirst;
    private CalculatorWithMathCopy calculatorSecond;
    private CalculatorWithMathExtends calculatorThree;
    private long counter;

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calculatorFirst) {
        this.calculatorFirst = calculatorFirst;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calculatorSecond) {
        this.calculatorSecond = calculatorSecond;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calculatorThree) {
        this.calculatorThree = calculatorThree;
    }

    /**
     * Методы для калькулятора
     */
    public double calculatorAddition(double firstNumber, double secondNumber) {
        if (calculatorFirst != null) {
            incrementCountOperation();
            return calculatorFirst.addition(firstNumber, secondNumber);
        } else if (calculatorSecond != null) {
            incrementCountOperation();
            return calculatorSecond.addition(firstNumber, secondNumber);
        } else if (calculatorThree != null) {
            incrementCountOperation();
            return calculatorThree.addition(firstNumber, secondNumber);
        }
        return 0;
    }

    public double calculatorSubtraction(double firstNumber, double secondNumber) {
        if (calculatorFirst != null) {
            incrementCountOperation();
            return calculatorFirst.subtraction(firstNumber, secondNumber);
        } else if (calculatorSecond != null) {
            incrementCountOperation();
            return calculatorSecond.subtraction(firstNumber, secondNumber);
        } else if (calculatorThree != null) {
            incrementCountOperation();
            return calculatorThree.subtraction(firstNumber, secondNumber);
        }
        return 0;
    }

    public double calculatorMultiplication(double firstNumber, double secondNumber) {
        if (calculatorFirst != null) {
            incrementCountOperation();
            return calculatorFirst.multiplication(firstNumber, secondNumber);
        } else if (calculatorSecond != null) {
            incrementCountOperation();
            return calculatorSecond.multiplication(firstNumber, secondNumber);
        } else if (calculatorThree != null) {
            incrementCountOperation();
            return calculatorThree.multiplication(firstNumber, secondNumber);
        }
        return 0;
    }


    public double calculatorDivision(double firstNumber, double secondNumber) {
        if (calculatorFirst != null) {
            incrementCountOperation();
            return calculatorFirst.division(firstNumber, secondNumber);
        } else if (calculatorSecond != null) {
            incrementCountOperation();
            return calculatorSecond.division(firstNumber, secondNumber);
        } else if (calculatorThree != null) {
            incrementCountOperation();
            return calculatorThree.division(firstNumber, secondNumber);
        }
        return 0;
    }

    public double calculatorExponentiation(double firstNumber, int secondNumber) {
        if (calculatorFirst != null) {
            incrementCountOperation();
            return calculatorFirst.exponentiation(firstNumber, secondNumber);
        } else if (calculatorSecond != null) {
            incrementCountOperation();
            return calculatorSecond.exponentiation(firstNumber, secondNumber);
        } else if (calculatorThree != null) {
            incrementCountOperation();
            return calculatorThree.exponentiation(firstNumber, secondNumber);
        }
        return 0;
    }


    public double calculatorModule(double firstNumber) {
        if (calculatorFirst != null) {
            incrementCountOperation();
            return calculatorFirst.module(firstNumber);
        } else if (calculatorSecond != null) {
            incrementCountOperation();
            return calculatorSecond.module(firstNumber);
        } else if (calculatorThree != null) {
            incrementCountOperation();
            return calculatorThree.module(firstNumber);
        }
        return 0;
    }


    public double calculatorSquareRoot(double firstNumber) {

        if (calculatorFirst != null) {
            incrementCountOperation();
            return calculatorFirst.squareRoot(firstNumber);
        } else if (calculatorSecond != null) {
            incrementCountOperation();
            return calculatorSecond.squareRoot(firstNumber);
        } else if (calculatorThree != null) {
            incrementCountOperation();
            return calculatorThree.squareRoot(firstNumber);
        }
        return 0;
    }


    /**
     * Счётчик ,который считает кол-во выполнений калькулятора
     */
    void incrementCountOperation() {
        counter++;
    }

    /**
     * метод который возвращает кол-во выполнений  калькулятора
     *
     * @return
     */
   public long getCountOperation() {
        incrementCountOperation();
        return counter;
    }
}
