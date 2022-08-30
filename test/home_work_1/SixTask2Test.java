package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixTask2Test {
    @Test
    void name() {
        assertNotNull(SixTask2.getResult("Петя"));
    }
}