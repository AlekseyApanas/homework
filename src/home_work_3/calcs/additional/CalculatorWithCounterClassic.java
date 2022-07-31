package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

/**
 * Наследуем класс CalculatorWithMathExtends
 */
public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    private int counter;

    /**
     * Счётчик ,который считает кол-во выполнений
     */
   public void incrementCountOperation() {
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
}
