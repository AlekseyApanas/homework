package home_work_2.utils;

public class SortsUtils {
    /**
     * Сортировка массива  при помощи алгоритма пузырьковая сортировка
     * @param arr принемает массив
     */
    public static void bubble(int[] arr) {
        System.out.println("Массив до сортировки :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int x = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = x;
                }
            }
        }
        System.out.println("Массив после сортировки :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    /**
     * Сортировка массива при помощи алгоритма шейкерная сортировка
     * @param arr принемает массив
     */
    public static void shake(int[] arr) {
        System.out.println("Массив до сортировки :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        int left = 0;
        int right = arr.length;
        while (left <= right) {
            for (int i = right-1; i > left; --i) {
                if (arr[i - 1] > arr[i]) {
                    int x = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = x;
                }
            }
            ++left;
            for (int i = left; i < right-1; ++i) {
                if (arr[i] > arr[i + 1]) {
                    int x = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = x;
                }
            }
        }
        System.out.println("Массив после сортировки :");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
