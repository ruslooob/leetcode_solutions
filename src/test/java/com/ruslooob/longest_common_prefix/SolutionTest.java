package com.ruslooob.longest_common_prefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void longestCommonPrefix() {
        String[] given = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(given));
    }

    @Test
    void longestCommonPrefix2() {
        String[] given = {"dog","racecar","car"};
        assertEquals("", solution.longestCommonPrefix(given));
    }


}