package com.ruslooob.easy.add_binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution()  ;

    @Test
    void test2() {
        assertEquals("111", solution.addBinary("100", "11"));
    }

    @Test
    void test1() {
        assertEquals("100", solution.addBinary("11", "1"));
    }

}