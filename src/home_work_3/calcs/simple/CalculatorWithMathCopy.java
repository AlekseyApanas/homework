package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    /**
     * Задание 3.2.1.4
     * Метод сложения
     *
     * @return возвращает резулятат метода
     */
    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Задание 3.2.1.4
     * Метод вычитания
     *
     * @return возвращает резулятат метода
     */
    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Задание 3.2.1.4
     * Метод умножения
     *
     * @return возвращает резулятат метода
     */
    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber*secondNumber;
    }

    /**
     * Задание 3.2.1.4
     * Метод деления
     *
     * @return возвращает резулятат метода
     */
    public double division(double firstNumber, double secondNumber) {
        return firstNumber/secondNumber;
    }

    /**
     * Задание 3.2.2.3
     * Метод возведения в степень
     *
     * @return возвращает резулятат метода
     */
    public double exponentiation(double firstNumber, int secondNumber) {
        return Math.pow(firstNumber,secondNumber);
    }

    /**
     * Задание 3.2.2.3
     * Метод модуль числа
     *
     * @return возвращает резулятат метода
     */
    public double module(double firstNumber) {
        return Math.abs(firstNumber);
    }

    /**
     * Задание 3.2.2.3
     * Метод квадратный корень числа
     *
     * @return возвращает резулятат метода
     */
    public double squareRoot(double firstNumber) {
        return Math.sqrt(firstNumber);
    }
}
