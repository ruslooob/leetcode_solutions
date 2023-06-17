package com.ruslooob.easy.summary_ranges;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution2 solution = new Solution2();

    @Test
    void summaryRanges3() {
        int[] nums = new int[]{};
        assertEquals(List.of(), solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges4() {
        int[] nums = new int[]{1};
        assertEquals(List.of("1"), solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges5() {
        int[] nums = new int[]{1, 2};
        assertEquals(List.of("1->2"), solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges6() {
        int[] nums = new int[]{1, 3};
        assertEquals(List.of("1", "3"), solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges7() {
        int[] nums = new int[]{1, 2, 3};
        assertEquals(List.of("1->3"), solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges8() {
        int[] nums = new int[]{1, 2, 4};
        assertEquals(List.of("1->2", "4"), solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges1() {
        int[] nums = new int[]{0, 1, 2, 4, 5, 7};
        assertEquals(List.of("0->2", "4->5", "7"), solution.summaryRanges(nums));
    }

    @Test
    void summaryRanges2() {
        int[] nums = new int[]{0, 2, 3, 4, 6, 8, 9};
        assertEquals(List.of("0", "2->4", "6", "8->9"), solution.summaryRanges(nums));
    }
}