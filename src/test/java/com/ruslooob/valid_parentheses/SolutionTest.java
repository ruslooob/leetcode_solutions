package com.ruslooob.valid_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void isValidSimple() {
        assertFalse(solution.isValid("("));
    }

    @Test
    void isValidSimplePair() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void isValidNestedParen() {
        assertTrue(solution.isValid("([])"));
    }

    @Test
    void isValidTwoDifPair() {
        assertFalse(solution.isValid("(]"));
    }

    @Test
    void isValidThreePairs() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void isValidThreePairs2() {
        assertFalse(solution.isValid("([)]"));
    }

}