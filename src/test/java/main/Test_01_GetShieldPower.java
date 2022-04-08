package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_01_GetShieldPower {

    @Test
    void test_getShieldPower() {
        int intrepid = Practice.getShieldPower("Intrepid");
        assertEquals(100, intrepid);

        int nova = Practice.getShieldPower("Nova");
        assertEquals(200, nova);

        int raven = Practice.getShieldPower("Raven");
        assertEquals(300, raven);

        int galaxy = Practice.getShieldPower("Galaxy");
        assertEquals(500, galaxy);

        int dreadnought = Practice.getShieldPower("Dreadnought");
        assertEquals(800, dreadnought);

        int other = Practice.getShieldPower("Other");
        assertEquals(0, other);
    }

}