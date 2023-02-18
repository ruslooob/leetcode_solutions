package com.ruslooob.easy.two_sum;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Solution2Test {
    Solution solution = new Solution();

    @Test
    void twoSum() {
        int[] given = new int[]{2, 7, 11, 15};
        int[] ints = solution.twoSum(given, 9);
        int i = Arrays.binarySearch(ints, 0);
        int i2 = Arrays.binarySearch(ints, 1);
        assertTrue(i >= 0 && i2 >= 0);

    }
}