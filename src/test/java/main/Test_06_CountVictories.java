package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_06_CountVictories {

    @Test
    void test_countVictories() {
        int[] battles = {0};
        assertEquals(0, Practice.countVictories(battles));

        battles = new int[]{1};
        assertEquals(1, Practice.countVictories(battles));

        battles = new int[]{1, -1, 0};
        assertEquals(1, Practice.countVictories(battles));

        battles = new int[]{1, -1, 0, 1};
        assertEquals(2, Practice.countVictories(battles));

        battles = new int[]{10, -10, 0, 123, -51, 42, 33, -66, 0, 89, -13};
        assertEquals(5, Practice.countVictories(battles));

        battles = new int[]{15, 110, 60, 123, 51, 42, 33, 66, 89, 13};
        assertEquals(10, Practice.countVictories(battles));
    }

}