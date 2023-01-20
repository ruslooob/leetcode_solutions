package com.ruslooob.medium.non_decreasing_subsequences;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void firstTest() {
        int[] given = new int[]{4, 6, 7, 7};
        var output = List.of(
                List.of(4, 6),
                List.of(4, 6, 7),
                List.of(4, 6, 7, 7),
                List.of(4, 7),
                List.of(4, 7, 7),
                List.of(6, 7),
                List.of(6, 7, 7),
                List.of(7, 7)
                );
        List<List<Integer>> subsequences = solution.findSubsequences(given);
        assertEquals(output, subsequences);
    }
}