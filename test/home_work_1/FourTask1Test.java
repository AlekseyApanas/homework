package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourTask1Test {
    private final int[] resultArray = FourTask1.getOddNumber(1, 10);

    @Test
    void oddNumber() {
        for (int i = 0; i < resultArray.length; i++) {
            boolean result = resultArray[i] % 2 != 0;
            assertTrue(result);
        }
    }
}