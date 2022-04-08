package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_07_IsInAscendingOrder {

    @Test
    void test_isInAscendingOrder() {
        int[] heights = {180};
        assertTrue(Practice.isInAscendingOrder(heights));

        heights = new int[]{180, 190};
        assertTrue(Practice.isInAscendingOrder(heights));

        heights = new int[]{180, 190, 170};
        assertFalse(Practice.isInAscendingOrder(heights));

        heights = new int[]{200, 190, 170};
        assertFalse(Practice.isInAscendingOrder(heights));

        heights = new int[]{170, 180, 190, 200};
        assertTrue(Practice.isInAscendingOrder(heights));
    }

}