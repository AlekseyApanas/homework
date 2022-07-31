package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithOperator implements ICalculator {
    /**
     * Задание 2.2.1
     * Метод сложения
     *
     * @return возвращает результат метода
     */
    public double addition(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    /**
     * Задание 2.2.1
     * Метод вычитания
     *
     * @return возвращает результат метода
     */
    public double subtraction(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    /**
     * Задание 2.2.1
     * Метод умножения
     *
     * @return возвращает результат метода
     */
    public double multiplication(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    /**
     * Задание 2.2.1
     * Метод деления
     *
     * @return возвращает результат метода
     */
    public double division(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    /**
     * Задание 2.2.2
     * Метод возведения в степень
     *
     * @return возвращает результат метода
     */
    public double exponentiation(double firstNumber, int secondNumber) {
        double result = 0;
        double x = 1;
        for (double i = 0; i < secondNumber; i++) {
            result = x * firstNumber;
            x = result;
        }
        return result;
    }

    /**
     * Задание 2.2.2
     * Метод модуль числа
     *
     * @return возвращает результат метода
     */
    public double module(double firstNumber) {
        double result;
        if (firstNumber < 0) {
            result = firstNumber * (-1);
        }else{
            result=firstNumber;
        }
        return result;
    }

    /**
     * Задание 2.2.2
     * Метод квадратный числа
     *
     * @return возвращает результат метода
     */
    public double squareRoot(double firstNumber) {
        return Math.sqrt(firstNumber);
    }
}
