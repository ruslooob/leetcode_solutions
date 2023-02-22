package com.ruslooob.easy.climbing_stairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void climbStairs() {
        assertEquals(2, solution.climbStairs(2));
    }

    @Test
    void climbStairs1() {
        assertEquals(3, solution.climbStairs(3));
    }

    /*
     * 3 ->
     * 1 1 1
     * 1 2
     * 2 1
     * */

    /*
    4 ->
    * 1 1 1 1
    * 2 2
    * 2 1 1
    * 1 1 2
    * 1 2 1
    * */

    /*
     * 5->
     * 1 1 1 1 1
     * 2 2 1
     * 1 2 2
     * 2 2 1
     * 1 1 2 1
     * 2 1 1 1
     * 1 2 1 1
     * 1 1 1 2
     * */
    @Test
    void climbStairs2() {
        assertEquals(5, solution.climbStairs(4));
    }

    /*1 -> 1 2 -> 2 3 -> 3 4 -> 5 5 -> 8 6 -> 13 */
    @Test
    void climbStairs3() {
        assertEquals(13, solution.climbStairs(6));
    }

}