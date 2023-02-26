package com.ruslooob.easy.find_the_town_judge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void findJudge() {
        int[][] trust = new int[][]{
                new int[]{1, 2},
        };
        assertEquals(2, solution.findJudge(2, trust));
    }

    @Test
    void findJudge2() {
        int[][] trust = new int[][]{
                new int[]{1, 3},
                new int[]{2, 3},
        };
        assertEquals(3, solution.findJudge(3, trust));
    }

    @Test
    void findJudge3() {
        int[][] trust = new int[][]{
                new int[]{1, 3}, new int[]{2, 3}, new int[]{3, 1},
        };
        assertEquals(-1, solution.findJudge(3, trust));
    }

}