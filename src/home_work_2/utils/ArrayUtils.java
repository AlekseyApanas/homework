package home_work_2.utils;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtils {
    public void main(String[] args) {
        arrayFromConsole();
        arrayRandom();
    }

    /**
     * Создали массив с помошью пользователя
     * sizeArray- длинна масива ,которую указал пользователь
     * пользователь сам вводит зачения массива
     *
     * @return
     */
    public static int[] arrayFromConsole() {
        System.out.println("Enter the size of the array");
        int sizeArray = getScanner();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            System.out.println("Enter " + i + " element");
            array[i] = getScannerElement();
        }
        System.out.println("");
        return array;
    }

    /**
     * Создали массив с помошью пользователя
     * size- длинна масива ,которую указал пользователь
     * maxValueExclusion-пользователь вводит максимальное значение в массиве
     * числа в массиве генерируется рандомно
     *
     * @return
     */
    public static int[] arrayRandom() {
        System.out.println("Enter the size of the array");
        int size = getScanner();
        System.out.println("Enter the size of the number");
        int maxValueExclusion = getScanner();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = getRandom(0, maxValueExclusion);
        }
        System.out.println("");
        return array;

    }

    /**
     * Пользователь вводит число(длина массива)
     *
     * @return число которое ввёл пользователь
     */
    public static int getScanner() {
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
     * Пользователь вводит элемент
     *
     * @return
     */
    public static int getScannerElement() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            while (!scanner.hasNextInt()) {
                if (scanner.hasNextDouble()) {
                    System.out.println("Entered not an integer");
                } else {
                    System.out.println("Entered not a number");
                }
                scanner.nextLine();
            }
            if (number < 0) {
                number = scanner.nextInt();
            } else {
                number = scanner.nextInt();
            }
        } while (number == 0);
        return number;
    }

    /**
     * Генерирует число
     *
     * @param min Диапазон чисел от
     * @param max Диапазон чисел до
     * @return
     */
    public static int getRandom(int min, int max) {
        final Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
