package com.codegym;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("1 1 2018  --> 2 1 2018")
    public void testDay1() {
        int[] day = new int[]{1, 1, 2018};
        int[] expected = new int[] {2,1,2018};
        int[] actual  = NextDayCalculator.nextDay(day);
        assertArrayEquals(expected, actual );
    }
}