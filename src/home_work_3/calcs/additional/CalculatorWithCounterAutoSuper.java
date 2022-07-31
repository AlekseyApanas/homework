package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Наследуем класс CalculatorWithMathExtends
 */
public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
    private int counter;

    /**
     * Счётчик ,который считает кол-во выполнений
     */
    private void incrementCountOperation() {
        counter++;
    }

    /**
     * метод который возвращает кол-во выполнений
     *
     * @return возвращает кол-во выполнений калькулятора
     */
   public long getCountOperation() {
        return counter;
    }
    /**
     * Переопределили метод и добавили счётчик
     * @param firstNumber аргумент первого числа
     * @param secondNumber аргумент второго числа
     * @return возвращает родительский метод
     */
    @Override
    public double exponentiation(double firstNumber, int secondNumber) {
        return super.exponentiation(firstNumber, secondNumber);
    }

    @Override
    public double module(double firstNumber) {
        return super.module(firstNumber);
    }

    @Override
    public double squareRoot(double firstNumber) {
        return super.squareRoot(firstNumber);
    }
}
