package home_work_2.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortsUtilsTest {
    @Test
    void bubble() {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        SortsUtils.bubble(array);
        int[] arraySort = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(arraySort, array);
    }

    @Test
    void shake() {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        SortsUtils.shake(array);
        int[] arraySort = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(arraySort, array);
    }
}