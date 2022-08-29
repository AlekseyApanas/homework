package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FiveTaskTest {
    @Test
    void sleep() {
        assertTrue(FiveTask.sleepIn(true, true));
    }
}