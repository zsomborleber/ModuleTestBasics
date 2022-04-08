package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_02_CountRequirement {

    @Test
    void test_countRequirement() {
        int[] scores = new int[]{1, 1};
        assertEquals(1d, Practice.countRequirement(scores), 0.01);

        scores = new int[]{1, 2};
        assertEquals(1.5d, Practice.countRequirement(scores), 0.01);

        scores = new int[]{1, 2, 1};
        assertEquals(1d, Practice.countRequirement(scores), 0.01);

        scores = new int[]{10, 12, 10, 23, 40};
        assertEquals(25d, Practice.countRequirement(scores), 0.01);
    }

}