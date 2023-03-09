package de.phl.programmierprojekt.arrayutils;

import org.junit.Test;
import static org.junit.Assert.*;

public class ArrayUtilitiesTest {
    
    @Test
    public void testSum() {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = ArrayUtilities.sum(arr);
        assertEquals(15, sum);
    }
}
