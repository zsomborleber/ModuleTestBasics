package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_04_GetSpaceRabbitDays {

    @Test
    void test_canAllianceWin() {
        int days = Practice.getSpaceRabbitDays(1, 1);
        assertEquals(1, days);

        days = Practice.getSpaceRabbitDays(2, 1);
        assertEquals(1, days);

        days = Practice.getSpaceRabbitDays(2, 8);
        assertEquals(3, days);

        days = Practice.getSpaceRabbitDays(2, 9);
        assertEquals(4, days);

        days = Practice.getSpaceRabbitDays(12, 100);
        assertEquals(5, days);

        days = Practice.getSpaceRabbitDays(3, 5000);
        assertEquals(12, days);
    }

}