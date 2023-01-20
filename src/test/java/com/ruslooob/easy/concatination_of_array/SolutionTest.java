package com.ruslooob.easy.concatination_of_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        int[] given = new int[]{1, 2, 1};
        assertArrayEquals(new int[]{1, 2, 1, 1, 2, 1}, solution.getConcatenation(given));
    }

}