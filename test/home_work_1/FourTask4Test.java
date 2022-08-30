package home_work_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FourTask4Test {
    @Test
    void resultKBytesOrBytes() {
        assertEquals(5120, FourTask4.getResult("b", 5));
    }
}