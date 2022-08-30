package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SixTask3Test {
    @Test
    void name() {
        assertNotNull(SixTask3.getResult("Петя"));
    }
}