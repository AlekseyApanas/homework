package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class ArraysIteration {
    public static void main(String[] args) {
        taskOne(ArrayUtils.arrayFromConsole());
        taskSecond(ArrayUtils.arrayFromConsole());
        taskThird(ArrayUtils.arrayFromConsole());
    }

    /**
     * taskOne-выводит все элементы массива при помощи цикла do....while, while, for, foreach
     *
     * @param arrayFromConsole-принимает массив введенный пользователем
     * @return
     */
    public static int taskOne(int[] arrayFromConsole) {
        int indexDoWhile = 0;
        int indexWhile = 0;
        System.out.println("Do while");
        do {
            System.out.println(arrayFromConsole[indexDoWhile++] + " ");
        } while (indexDoWhile < arrayFromConsole.length);
        System.out.println("While");
        while (indexWhile < arrayFromConsole.length) {
            System.out.println(arrayFromConsole[indexWhile++] + " ");
        }
        System.out.println("For");
        for (int i = 0; i < arrayFromConsole.length; i++) {
            System.out.println(arrayFromConsole[i]);
        }
        System.out.println("Foreach");
        for (int numbersArrays : arrayFromConsole) {
            System.out.println(numbersArrays);
        }
        return 0;
    }

    /**
     * taskSecond -выводит каждый второй элемент массива при помощи цикла do....while, while, for, foreach
     *
     * @param arrayFromConsole-принимает массив введенный пользователем
     * @return
     */
    public static int taskSecond(int[] arrayFromConsole) {
        int indexDoWhile = 0;
        int indexWhile = 0;
        System.out.println("Do while");
        int[] arrayDoWhile = arrayFromConsole;
        do {
            if (indexDoWhile % 2 != 0 && indexDoWhile != 0) {
                System.out.println(arrayDoWhile[indexDoWhile]);
            }
            indexDoWhile++;
        } while (indexDoWhile < arrayFromConsole.length);

        System.out.println("While");
        int[] arrayWhile = arrayFromConsole;
        while (indexWhile < arrayFromConsole.length) {
            if (indexWhile % 2 != 0 && indexWhile != 0) {
                System.out.println(arrayWhile[indexWhile]);
            }
            indexWhile++;
        }
        System.out.println("For");
        for (int i = 1; i <= arrayFromConsole.length; ) {
            if (i + 1 == arrayFromConsole.length || i + 2 == arrayFromConsole.length) {
                System.out.println(arrayFromConsole[i]);
                break;
            } else {
                System.out.println(arrayFromConsole[i]);
                i = i + 2;
            }
        }
        System.out.println("Foreach");
        int[] arrayForeach = ArrayUtils.arrayFromConsole();
        System.out.println("Foreach");
        int count = 1;
        for (int i : arrayForeach) {
            if (count % 2 != 0) {
                System.out.print(i + " ");
            }
            count++;
        }
        return 0;
    }

    /**
     * taskThird-выводит все элементы массива в обратном порядке
     *
     * @param arrayFromConsole-принимает массив введенный пользователем
     * @return
     */
    public static int taskThird(int[] arrayFromConsole) {
        int indexDoWhile = arrayFromConsole.length - 1;
        int indexWhile = arrayFromConsole.length - 1;
        System.out.println("Do while");
        do {
            System.out.println(arrayFromConsole[indexDoWhile--] + " ");
        } while (indexDoWhile >= 0);
        System.out.println("While");
        while (indexWhile >= 0) {
            System.out.println(arrayFromConsole[indexWhile--] + " ");
        }
        System.out.println("For");
        for (int i = arrayFromConsole.length - 1; i >= 0; i--) {
            System.out.println(arrayFromConsole[i]);
        }
        System.out.println("Foreach");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int numbersArrays : arrayFromConsole) {
            arrayList.add(numbersArrays);
        }
        Collections.reverse(arrayList);
        for (int numberArraysCollections : arrayList) {
            System.out.println(numberArraysCollections);
        }
        return 0;
    }
}