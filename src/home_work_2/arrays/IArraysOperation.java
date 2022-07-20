package home_work_2.arrays;

import home_work_2.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.Collections;

public interface IArraysOperation {
    /**
     * Выводит все элементы массива при помощи цикла DoWhile
     */
    default void allElementsDoWhile() {
        int[] arrayDoWhileScanner = ArrayUtils.arrayFromConsole();
        int indexDoWhile = 0;
        System.out.println("Do while");
        do {
            System.out.println(arrayDoWhileScanner[indexDoWhile++] + " ");
        } while (indexDoWhile < arrayDoWhileScanner.length);
        System.out.println("While");
    }

    /**
     * Выводит все элементы массива при помощи цикла While
     */
    default void allElementsWhile() {
        int indexWhile = 0;
        int[] arrayWhileScanner = ArrayUtils.arrayFromConsole();
        System.out.println("While");
        while (indexWhile < arrayWhileScanner.length) {
            System.out.println(arrayWhileScanner[indexWhile++] + " ");
        }
    }

    /**
     * Выводит все элементы массива при помощи цикла For
     */
    default void allElementsFor() {
        int[] arrayFor = ArrayUtils.arrayFromConsole();
        System.out.println("For");
        for (int i = 0; i < arrayFor.length; i++) {
            System.out.println(arrayFor[i]);
        }
    }

    /**
     * Выводит все элементы массива при помощи цикла Foreach
     */
    default void allElementsForeach() {
        int[] arrayForeach = ArrayUtils.arrayFromConsole();
        System.out.println("Foreach");
        for (int numbersArrays : arrayForeach) {
            System.out.println(numbersArrays);
        }
    }

    /**
     * Выводит каждый второй элемент массива при помощи цикла DoWhile
     */
    default void replaceElementsDoWhile() {
        int[] arrayDoWhile = ArrayUtils.arrayFromConsole();
        int indexDoWhile = arrayDoWhile.length - 1;
        System.out.println("Do while");
        do {
            System.out.println(arrayDoWhile[indexDoWhile--] + " ");
        } while (indexDoWhile >= 0);
    }

    /**
     * Выводит каждый второй элемент массива при помощи цикла While
     */
    default void replaceElementsWhile() {
        int[] arrayWhile = ArrayUtils.arrayFromConsole();
        int indexWhile = arrayWhile.length - 1;
        System.out.println("While");
        while (indexWhile >= 0) {
            System.out.println(arrayWhile[indexWhile--] + " ");
        }
    }

    /**
     * Выводит каждый второй элемент массива при помощи цикла For
     */
    default void replaceElementsFor() {
        int[] arrayFor = ArrayUtils.arrayFromConsole();
        System.out.println("For");
        for (int i = arrayFor.length - 1; i >= 0; i--) {
            System.out.println(arrayFor[i]);
        }
    }

    /**
     * Выводит каждый второй элемент массива при помощи цикла Foreach
     */
    default void replaceElementsForeach() {
        int[] arrayForeach = ArrayUtils.arrayFromConsole();
        System.out.println("Foreach");
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int numbersArrays : arrayForeach) {
            arrayList.add(numbersArrays);
        }
        Collections.reverse(arrayList);
        for (int numberArraysCollections : arrayList) {
            System.out.println(numberArraysCollections);
        }
    }

    /**
     * Выводит все элементы массива в обратном порядке DoWhile
     */
    default void deleteElementsDoWhile() {
        int indexDoWhile = 0;
        System.out.println("Do while");
        int[] arrayDoWhile = ArrayUtils.arrayFromConsole();
        ;
        do {
            if (indexDoWhile % 2 != 0 && indexDoWhile != 0) {
                System.out.println(arrayDoWhile[indexDoWhile]);
            }
            indexDoWhile++;
        } while (indexDoWhile < arrayDoWhile.length);
    }

    /**
     * Выводит все элементы массива в обратном порядке While
     */
    default void deleteElementsWhile() {
        int indexWhile = 0;
        System.out.println("While");
        int[] arrayWhile = ArrayUtils.arrayFromConsole();
        ;
        while (indexWhile < arrayWhile.length) {
            if (indexWhile % 2 != 0 && indexWhile != 0) {
                System.out.println(arrayWhile[indexWhile]);
            }
            indexWhile++;
        }
    }

    /**
     * Выводит все элементы массива в обратном порядке For
     */
    default void deleteElementsFor() {
        int[] arrayFor = ArrayUtils.arrayFromConsole();
        System.out.println("For");
        for (int i = 1; i <= arrayFor.length; ) {
            if (i + 1 == arrayFor.length || i + 2 == arrayFor.length) {
                System.out.println(arrayFor[i]);
                break;
            } else {
                System.out.println(arrayFor
                        [i]);
                i = i + 2;
            }
        }
    }

    /**
     * Выводит все элементы массива в обратном порядке Foreach
     */
    default void deleteElementsForeach() {
        int[] arrayForeach = ArrayUtils.arrayFromConsole();
        System.out.println("Foreach");
        int count = 1;
        for (int i : arrayForeach) {
            if (count % 2 == 0) {
                System.out.print(i + " ");
            }
            count++;
        }
    }
}
