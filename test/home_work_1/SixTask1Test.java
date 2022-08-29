package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixTask1Test {
    @Test
    void name() {
        assertNotNull(SixTask1.getResult("Петя"));
    }

}