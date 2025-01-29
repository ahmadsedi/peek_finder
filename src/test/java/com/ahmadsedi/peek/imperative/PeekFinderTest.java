package com.ahmadsedi.peek.imperative;

import com.ahmadsedi.peek.stream.EnhancedPeekFinder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Ahmad R. Seddighi (ahmadseddighi@yahoo.com)
 * Date: 29/01/2025
 * Time: 17:51
 */

class PeekFinderTest {

    @Test
    void findPeek_givenNoneEmptyArray_returnValidValue(){
        int[] series = {1, 2, 5, 6};
        int result = PeekFinder.findPeek(series);
        Assertions.assertEquals(2, result);
    }

    @Test
    void findPeek_givenSingleElementArray_returnZero(){
        int[] series = {1};
        int result = PeekFinder.findPeek(series);
        Assertions.assertEquals(0, result);
    }

    @Test
    void findPeek_givenEmptyArray_returnNegativeValue(){
        int[] series = {};
        int result = PeekFinder.findPeek(series);
        Assertions.assertEquals(-1, result);
    }
}
