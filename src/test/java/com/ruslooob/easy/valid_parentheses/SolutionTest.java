package com.ruslooob.easy.valid_parentheses;

import com.ruslooob.easy.valid_parentheses.Solution;
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