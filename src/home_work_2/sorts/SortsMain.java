package home_work_2.sorts;

import home_work_2.utils.ArrayUtils;
import home_work_2.utils.SortsUtils;

public class SortsMain {
    /**
     * Сортировка массива при помощи алгоритма пузырьковая сортировка и алгоритма шейкерная сортировка
     */
    public static void main(String[] args) {
        int[]arrayBubble=new int[]{1,2,3,4,5,6};
        SortsUtils.bubble(arrayBubble);
        int[]arrayShake=new int[]{1,2,3,4,5,6};
        SortsUtils.shake(arrayShake);

        int[]arrayBubble1=new int[]{1,1,1,1};
        SortsUtils.bubble(arrayBubble1);
        int[]arrayShake1=new int[]{1,1,1,1};
        SortsUtils.shake(arrayShake1);

        int[]arrayBubble2=new int[]{9,1,5,99,9,9};
        SortsUtils.bubble(arrayBubble2);
        int[]arrayShake2=new int[]{9,1,5,99,9,9};
        SortsUtils.shake(arrayShake2);

        int[]arrayBubble3=new int[]{};
        SortsUtils.bubble(arrayBubble3);
        int[]arrayShake3=new int[]{};
        SortsUtils.shake(arrayShake3);

        int[]arrayBobble4=new int[]{6,5,4,3,2,1};
        SortsUtils.bubble(arrayBobble4);
        int[]arrayShake4=new int[]{6,5,4,3,2,1};
        SortsUtils.shake(arrayShake4);

        SortsUtils.bubble(ArrayUtils.arrayRandom());
        SortsUtils.shake(ArrayUtils.arrayRandom());

        SortsUtils.bubble(ArrayUtils.arrayFromConsole());
        SortsUtils.bubble(ArrayUtils.arrayFromConsole());

    }
}
