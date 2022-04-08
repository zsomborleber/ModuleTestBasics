package main;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Test_10_SortShipsByPower {

    @Test
    void test_sortShipsByPower() {
        String[] shipNames = {"Wave Rider"};
        int[] shipPowers = {1};
        assertSorted("[Wave Rider]", "[1]",
                shipNames, shipPowers);

        shipNames = new String[]{"Wave Rider", "Odyssey"};
        shipPowers = new int[]{4000, 4000};
        assertSorted("[Wave Rider, Odyssey]", "[4000, 4000]",
                shipNames, shipPowers);

        shipNames = new String[]{"Rio Grande", "Odyssey", "Wave Rider"};
        shipPowers = new int[]{5432, 6817, 8888};
        assertSorted("[Wave Rider, Odyssey, Rio Grande]", "[8888, 6817, 5432]",
                shipNames, shipPowers);

        shipNames = new String[]{"Enterprise", "The Cube", "Titanic", "Doomsday Machine", "Black Pearl", "Wave Rider", "Rio Grande", "Andromeda", "Falcon", "Odyssey"};
        shipPowers = new int[]{15525, 15775, 1, 33666, 3592, 3985, 8894, 13801, 4520, 9116};
        assertSorted("[Doomsday Machine, The Cube, Enterprise, Andromeda, Odyssey, Rio Grande, Falcon, Wave Rider, Black Pearl, Titanic]",
                "[33666, 15775, 15525, 13801, 9116, 8894, 4520, 3985, 3592, 1]",
                shipNames, shipPowers);
    }

    void assertSorted(String expectedNames, String expectedPowers, String[] namesArray, int[] powersArray) {
        Practice.sortShipsByPower(namesArray, powersArray);

        assertEquals(expectedNames, Arrays.toString(namesArray));
        assertEquals(expectedPowers, Arrays.toString(powersArray));
    }

}