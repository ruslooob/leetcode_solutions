package com.ruslooob.easy.merge_two_sorted_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void merge1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    void merge2() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        solution.merge(nums1, 1, nums2, 0);
        assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    void merge3() {
        int[] nums1 = new int[]{4,5,6,0,0,0};
        int[] nums2 = new int[]{1,2,3};
        solution.merge(nums1, 3, nums2, 3);
        assertArrayEquals(new int[]{1,2,3,4,5,6}, nums1);
    }
}