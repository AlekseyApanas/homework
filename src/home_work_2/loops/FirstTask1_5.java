package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class FirstTask1_5 {
    public static void main(String[] args) {
        System.out.println("Самое большое число " + taskOne(getScanner()));
        System.out.println("Чётное число сгенерировано " + taskTwo() + " раз");
        taskThird(getScanner());
        taskFour(getScanner());
        taskFive();
        taskSix(getScanner());
    }

    /**
     * Возвращет самое большое число
     * Пример : пользователь ввёл 5678 ,вернёт число 8
     *
     * @param number - число которое ввёл пользователь
     * @return- самое большое число
     */
    public static int taskOne(int number) {
        int maxNumber = 0;
        String stringsNumber = Integer.toString(number);
        for (int i = 0; i < stringsNumber.length(); i++) {
            if (maxNumber < stringsNumber.charAt(i)) ;
            {
                maxNumber = Integer.parseInt(String.valueOf(stringsNumber.charAt(i)));
            }
        }
        return maxNumber;
    }

    /**
     * Генерация четного числа
     *
     * @return количество выадения чётного числа
     */
    public static int taskTwo() {
        int resul = 0;
        for (int i = 0; i < 1000; i++) {
            if (getRandom(0, 100) % 2 == 0) {
                resul++;
            }
        }
        return resul;
    }

    /**
     * Пользователь вводит число ,в числе считаем количество чётных и нечётных цифр
     *
     * @param number-число ,котороеввёл пользователь
     * @return
     */
    public static int taskThird(int number) {
        int evenNumber = 0;
        int notEvenNumber = 0;
        String stringsNumber = Integer.toString(number);
        for (int i = 0; i < stringsNumber.length(); i++) {
            if (stringsNumber.charAt(i) % 2 == 0) {
                evenNumber++;
            } else {
                notEvenNumber++;
            }
        }
        System.out.println("Чётных чисел " + evenNumber);
        System.out.println("Нечётных чисел " + notEvenNumber);
        return 0;
    }

    /**
     * Ряд Фибоначчи
     *
     * @param number - указывает пользователь, столько элементов ряда Фибоначчи
     */
    public static int taskFour(int number) {
        int numberOneForFibonachi = 1;
        int numberTwoForFibonachi = 1;
        int result = 1;
        System.out.print(numberOneForFibonachi);
        for (int i = 1; i < number; i++) {
            result = numberOneForFibonachi + numberTwoForFibonachi;
            System.out.print(" " + result);
            numberOneForFibonachi = numberTwoForFibonachi;
            numberTwoForFibonachi = result;
        }
        System.out.println();
        return 0;
    }

    /**
     * Метод выводит ряд натуральных чисел с шагом.
     * minNumber-минимальное число,с которого начинает работу
     * maxNumber-максимальное число,при котором заканчивает работу
     * numberStep-шаг числа
     *
     * @return
     */
    public static int taskFive() {
        System.out.println("Enter min number");
        int minNumber = getScanner();
        System.out.println("Enter max number");
        int maxNumber = getScanner();
        System.out.println("Enter number step");
        int numberStep = getScanner();
        int result = numberStep;
        System.out.print("");
        for (int i = numberStep; i < maxNumber; i++) {
            System.out.print(result + " ");
            result = result + numberStep;
            if (result > maxNumber) {
                break;
            }
        }
        return 0;
    }

    /**
     * Метод принемает число  и переварачивает его
     * @param number число ,которое ввёл пользователь
     * @return
     */
    public static int taskSix(int number) {
        String stringsNumber = Integer.toString(number);
        int lengthStringNumber=stringsNumber.length();
        char [] charsArray=new char[lengthStringNumber];
        for (int i = 0; i <stringsNumber.length(); i++) {
           charsArray[stringsNumber.length()-i-1]=stringsNumber.charAt(i);
        }
        System.out.println(String.valueOf(charsArray));
        return 0;
    }

    /**
     * Пользователь вводит число
     *
     * @return число которое ввёл пользователь
     */
    public static int getScanner() {
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            if (number < 0) {
                System.out.println("Entered a positive number");
            }
            while (!scanner.hasNextInt()) {
                if (scanner.hasNextDouble()) {
                    System.out.println("Entered not an integer");
                } else {
                    System.out.println("Entered not a number");
                }
                scanner.nextLine();
            }
            number = scanner.nextInt();
        } while (number <= 0);
        return number;
    }

    /**
     * Генерирует число
     * @param min Диапазон чисел от
     * @param max Диапазон чисел до
     * @return
     */
    public static int getRandom(int min, int max) {
        final Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}