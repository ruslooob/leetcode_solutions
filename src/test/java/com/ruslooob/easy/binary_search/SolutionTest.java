package com.ruslooob.easy.binary_search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void search1() {
        int[] given = new int[]{-1, 0, 3, 5, 9, 12};
        assertEquals(4, solution.search(given, 9));
    }

    @Test
    void search2() {
        int[] given = new int[]{2, 5};
        assertEquals(1, solution.search(given, 5));
    }
}