package com.ruslooob.easy.greatest_common_divisor_of_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void isStringDividedBy() {
        String str1 = "ABCABCABC";
        String str2 = "ABC";
        assertTrue(Solution.isStringDividedBy(str1, str2));
    }


    @Test
    void isStringDividedBy2() {
        String str1 = "ABCABCABCA";
        String str2 = "ABC";
        assertFalse(Solution.isStringDividedBy(str1, str2));
    }

    @Test
    void isStringDividedBy3() {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        assertFalse(Solution.isStringDividedBy(str1, str2));
    }

    @Test
    void isStringDividedBy4() {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        assertFalse(Solution.isStringDividedBy(str1, str2));
    }

    @Test
    void gcdOfStringsTest1() {
        String str1 = "TAUXXTAUXXTAUXXTAUXXTAUXX";
        String str2 = "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX";
        assertEquals("TAUXX", solution.gcdOfStrings(str1, str2));
    }
}