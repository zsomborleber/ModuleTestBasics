package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_09_GetWorstMonthIndex {

    @Test
    void test_getWorstMonthIndex() {
        int[][] lossesPerMonths = {{1}};
        assertEquals(0, Practice.getWorstMonthIndex(lossesPerMonths));

        lossesPerMonths = new int[][]{ {1}, {2} };
        assertEquals(1, Practice.getWorstMonthIndex(lossesPerMonths));

        lossesPerMonths = new int[][]{ {1, 1}, {2, 2}, {3} };
        assertEquals(1, Practice.getWorstMonthIndex(lossesPerMonths));

        lossesPerMonths = new int[][]{ {10}, {1, 2, 1}, {3, 4, 1, 1}, {10, 9}, {2, 2, 1, 3} };
        assertEquals(3, Practice.getWorstMonthIndex(lossesPerMonths));
    }

}