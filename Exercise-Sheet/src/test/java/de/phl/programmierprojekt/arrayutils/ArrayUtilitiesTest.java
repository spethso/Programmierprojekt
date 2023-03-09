package de.phl.programmierprojekt.arrayutils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ArrayUtilitiesTest {

    @Test
    public void testSum() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = ArrayUtilities.sum(arr);
        assertEquals(15, sum);
    }
}
