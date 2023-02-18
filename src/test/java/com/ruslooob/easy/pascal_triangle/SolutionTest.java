package com.ruslooob.easy.pascal_triangle;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void getRow() {
        assertEquals(List.of(1, 3, 3, 1), solution.getRow(3));
    }
}