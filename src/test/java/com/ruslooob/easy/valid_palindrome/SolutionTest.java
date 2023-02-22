package com.ruslooob.easy.valid_palindrome;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void isPalindrome() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void isPalindrome2() {
        assertFalse(solution.isPalindrome("0P"));
    }
}