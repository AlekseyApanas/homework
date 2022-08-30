package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenTaskTest {

    @Test
    void createPhoneNumber() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9};
        assertEquals("(123) 456-7899", SevenTask.createPhoneNumber(array));
    }
}