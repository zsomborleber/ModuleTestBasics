package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_03_IsShipAbleToFight {

    @Test
    void test_isShipAbleToFight() {
        assertFalse(Practice.isShipAbleToFight(0, 0));
        assertFalse(Practice.isShipAbleToFight(20, 20));
        assertFalse(Practice.isShipAbleToFight(21, 21));
        assertFalse(Practice.isShipAbleToFight(50, 50));

        assertTrue(Practice.isShipAbleToFight(21, 80));
        assertTrue(Practice.isShipAbleToFight(80, 21));
        assertTrue(Practice.isShipAbleToFight(50, 51));
        assertTrue(Practice.isShipAbleToFight(51, 50));
    }

}