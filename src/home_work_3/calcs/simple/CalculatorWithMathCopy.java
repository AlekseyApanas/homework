package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    /**
     * Задание 3.2.1.4
     * Метод сложения
     *
     * @return
     */
    public double addition(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    /**
     * Задание 3.2.1.4
     * Метод вычитания
     *
     * @return
     */
    public double subtraction(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }

    /**
     * Задание 3.2.1.4
     * Метод умножения
     *
     * @return
     */
    public double multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }

    /**
     * Задание 3.2.1.4
     * Метод деления
     *
     * @return
     */
    public double division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    /**
     * Задание 3.2.2.3
     * Метод возведения в степень
     *
     * @return
     */
    public double exponentiation(double firstNumber, int secondNumber) {
        double result=Math.pow(firstNumber,secondNumber);
        return result;
    }

    /**
     * Задание 3.2.2.3
     * Метод модуль числа
     *
     * @return
     */
    public double module(double firstNumber) {
        double result=Math.abs(firstNumber);
        return result;
    }

    /**
     * Задание 3.2.2.3
     * Метод квадратный корень числа
     *
     * @return
     */
    public double squareRoot(double firstNumber) {
        double result = Math.sqrt(firstNumber);
        return result;
    }
}
