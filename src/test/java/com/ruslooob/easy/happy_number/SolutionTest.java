package com.ruslooob.easy.happy_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void getSumOfQuadDigits() {
        assertEquals(82, solution.getSumOfQuadDigits(19));
        assertEquals(37, solution.getSumOfQuadDigits(16));
        assertEquals(54, solution.getSumOfQuadDigits(255));
        assertEquals(164, solution.getSumOfQuadDigits(868));
    }

    @Test
    void getSumOfQuadDigits19() {
        assertTrue(solution.isHappy(19));
    }

    @Test
    void getSumOfQuadDigits7() {
        assertTrue(solution.isHappy(7));
    }



}