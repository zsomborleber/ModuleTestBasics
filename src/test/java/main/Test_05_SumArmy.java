package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Test_05_SumArmy {

    @Test
    void test_sumArmy() {
        int[] armyOfPlanets = {1};
        assertEquals(1, Practice.sumArmy(armyOfPlanets));

        armyOfPlanets = new int[]{1, 2};
        assertEquals(3, Practice.sumArmy(armyOfPlanets));

        armyOfPlanets = new int[]{12, 6, 15};
        assertEquals(33, Practice.sumArmy(armyOfPlanets));

        armyOfPlanets = new int[]{10, 20, 10, 33, 42, 66, 1};
        assertEquals(182, Practice.sumArmy(armyOfPlanets));
    }

}