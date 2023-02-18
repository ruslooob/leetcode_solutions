package com.ruslooob.easy.single_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void singleNumber() {
        int[] given = {2, 2, 1};
        assertEquals(1, solution.singleNumber(given));
    }

    @Test
    void singleNumber2() {
        int[] given = {1, 0, 1};
        assertEquals(0, solution.singleNumber(given));
    }
}