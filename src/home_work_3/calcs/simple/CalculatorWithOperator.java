package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

import java.util.Scanner;

public class CalculatorWithOperator implements ICalculator {
    /**
     * Задание 2.2.1
     * Метод сложения
     *
     * @return
     */
    public double addition(double firstNumber, double secondNumber) {
        double result = firstNumber + secondNumber;
        return result;
    }

    /**
     * Задание 2.2.1
     * Метод вычитания
     *
     * @return
     */
    public double subtraction(double firstNumber, double secondNumber) {
        double result = firstNumber - secondNumber;
        return result;
    }

    /**
     * Задание 2.2.1
     * Метод умножения
     *
     * @return
     */
    public double multiplication(double firstNumber, double secondNumber) {
        double result = firstNumber * secondNumber;
        return result;
    }

    /**
     * Задание 2.2.1
     * Метод деления
     *
     * @return
     */
    public double division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }

    /**
     * Задание 2.2.2
     * Метод возведения в степень
     *
     * @return
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
     * @return
     */
    public double module(double firstNumber) {
        double result = 0;
        if (firstNumber < 0) {
            result = firstNumber * (-1);
        }
        return result;
    }

    /**
     * Задание 2.2.2
     * Метод квадратный числа
     *
     * @return
     */
    public double squareRoot(double firstNumber) {
        double result = Math.sqrt(firstNumber);
        return result;
    }

    /**
     * Пользователь вводит целое,дробное,положительное,отрицательое число
     *
     * @return
     */
    public double getScannerAllNumber() {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        do {
            System.out.println("Введите число");
            while (!scanner.hasNextDouble()) {
                if (scanner.hasNextLine()) {
                    System.out.println("Вы ввели не число");
                }
                scanner.nextLine();
            }
            number = scanner.nextDouble();
        } while (number == 0);
        return number;
    }

    /**
     * Пользователь вводит целое,положительное число
     *
     * @return
     */
    public int getScannerPositiveInteger() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            if (number < 0) {
                System.out.println("Введите целое положительно число");
            }
            while (!scanner.hasNextInt()) {
                if (scanner.hasNextDouble()) {
                    System.out.println("Вы ввели не целое число");
                } else {
                    System.out.println("Вы ввели не число");
                }
                scanner.nextLine();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    /**
     * Пользователь вводит дробное,положительное число
     *
     * @return
     */
    public double getScannerFactorialAndPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        double number = 0;
        do {
            if (number < 0) {
                System.out.println("Введите дробное,положительное число");
            }
            while (!scanner.hasNextDouble()) {
                if (scanner.hasNextLine()) {
                    System.out.println("Вы ввели не число");
                }
                scanner.nextLine();
            }
            number = scanner.nextDouble();
        } while (number <= 0);
        return number;
    }
}
