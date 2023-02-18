package com.ruslooob.easy.search_insert_position;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void searchInsert1() {
        int[] given = new int[]{1, 3, 5, 6};
        assertEquals(2, solution.searchInsert(given, 5));
    }
    @Test
    void searchInsert2() {
        int[] given = new int[]{1, 3, 5, 6, 8, 9 , 555};
        assertEquals(1, solution.searchInsert(given, 3));
    }
    @Test

    void searchInsert3() {
        int[] given = new int[]{1, 3, 5, 6, 8, 9 , 555};
        assertEquals(2, solution.searchInsert(given, 4));
    }
}