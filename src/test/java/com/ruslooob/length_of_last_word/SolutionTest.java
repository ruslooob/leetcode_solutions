package com.ruslooob.length_of_last_word;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void lengthOfLastWord() {
        assertEquals(5, solution.lengthOfLastWord("Hello World"));
    }

    @Test
    void lengthOfLastWord1() {
        assertEquals(4, solution.lengthOfLastWord("   fly me   to   the moon  "));
    }

}