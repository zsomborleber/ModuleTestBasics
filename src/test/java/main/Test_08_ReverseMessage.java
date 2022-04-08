package main;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Test_08_ReverseMessage {

    @Test
    void test_reverseMessage() {
        char[] message = {'a'};
        char[] result = Practice.reverseMessage(message);
        assertEquals("[a]", Arrays.toString(result));

        message = new char[]{'a', 'b'};
        result = Practice.reverseMessage(message);
        assertEquals("[b, a]", Arrays.toString(result));

        message = new char[]{'a', 'b', 'c', '*', '3', 'd'};
        result = Practice.reverseMessage(message);
        assertEquals("[d, 3, *, c, b, a]", Arrays.toString(result));
    }

}