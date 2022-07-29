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
    void incrementCountOperation() {
        counter++;
    }

    /**
     * метод который возвращает кол-во выполнений
     *
     * @return
     */
    public long getCountOperation() {
        incrementCountOperation();
        return counter;
    }
}
