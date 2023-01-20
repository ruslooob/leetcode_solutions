package com.ruslooob.easy.sqrt_x;

import com.ruslooob.easy.sqrt_x.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void mySqrt() {
        assertEquals(0, solution.mySqrt(0));
    }

    @Test
    void mySqrt1() {
        assertEquals(1, solution.mySqrt(1));
    }

    @Test
    void mySqrt2() {
        assertEquals(1, solution.mySqrt(2));
    }

    @Test
    void mySqrt3() {
        assertEquals(2, solution.mySqrt(8));
    }

    @Test
    void mySqrt4() {
        assertEquals(2, solution.mySqrt(4));
    }


}