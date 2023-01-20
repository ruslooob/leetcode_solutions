package com.ruslooob.climbing_stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void climbStairs() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    void climbStairs1() {
        assertEquals(3, solution.climbStairs(3));
    }

    @Test
    void climbStairs2() {
        assertEquals(4, solution.climbStairs(5));
    }

}