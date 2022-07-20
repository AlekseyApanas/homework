package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondTask2_4 {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        taskSixNumberOne();
        System.out.println("Задание 2");
        taskSixNumberTwo();
        System.out.println("Задание 3");
        taskSixNumberThree();
        System.out.println("Задание 4");
        taskSixNumberFour();
        System.out.println("Задание 5");
        taskSixNumberFive();
        System.out.println("Задание 6");
        taskSixNumberSix();

    }

    /**
     * Находим сумму чётных положительных эллементов
     */
    public static void taskSixNumberOne() {
        float result = 0F;
        int[] array = ArrayUtils.arrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                result = result + array[i];
            }
        }
        System.out.println(result);
    }

    /**
     * Находим максимальный из элементов массива с чётным индексов
     */
    public static void taskSixNumberTwo() {
        float result = 0F;
        int[] array = ArrayUtils.arrayFromConsole();
        for (int i = array.length - 1; i > 0; i--) {
            if (i % 2 == 0) {
                if (array[i] > result)
                    result = array[i];
            }
        }
        System.out.println(result);
    }

    /**
     * Находим элементы массива, который меньше среднего арифметического
     */
    public static void taskSixNumberThree() {
        float result = 0F;
        int[] array = ArrayUtils.arrayFromConsole();
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        float average = result / array.length;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < average) {
                System.out.println(array[i]);
            }
        }
    }

    /**
     * Находим два наименьших элемента массива
     */
    public static void taskSixNumberFour() {
        int[] array = ArrayUtils.arrayFromConsole();
        float numberOne = array[0];
        float numberTwo = array[0];
        int numberIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (numberOne > array[i]) {
                numberOne = array[i];
                numberIndex = i;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (numberTwo > array[j] && j != numberIndex) {
                numberTwo = array[j];
            }
        }
        System.out.println("Первый минимальный элемент " + numberOne);
        System.out.println("Второй минимальный элемент " + numberTwo);
    }

    /**
     * Удаляем числа из массива в интервале и заменяем на 0
     */
    public static void taskSixNumberFive() {
        int[] array = ArrayUtils.arrayFromConsole();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начало интервала");
        int startInterval = scanner.nextInt();
        System.out.println("Введите конец интервала");
        int finishInterval = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] > startInterval && array[i] < finishInterval) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    /**
     * Находим сумму всех цифр целочисленного массива
     */

    public static void taskSixNumberSix() {
        int[] array = ArrayUtils.arrayFromConsole();
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                String str = String.valueOf(array[i]);
                char[] number = str.toCharArray();
                for (int j = 0; j < number.length; j++) {
                    result += Integer.parseInt(String.valueOf(number[j]));
                }
            }
        }
        System.out.println(result);
    }
}
