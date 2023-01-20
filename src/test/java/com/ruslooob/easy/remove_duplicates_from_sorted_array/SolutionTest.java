package com.ruslooob.easy.remove_duplicates_from_sorted_array;

import com.ruslooob.easy.remove_duplicates_from_sorted_array.Solution;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void simpleRemoveDuplicatesTest() {
        int[] given = {1};
        int result = solution.removeDuplicates(given);
        assertEquals(1, result);
    }

    @Test
    void twoLenArrayRemoveDuplicatesTest() {
        int[] given = {1, 2};
        int result = solution.removeDuplicates(given);
        assertEquals(2, result);
    }

    @Test
    void twoDupArrayRemoveDuplicatesTest() {
        int[] given = {1, 1, 2};
        int result = solution.removeDuplicates(given);
        assertEquals(2, result);
        assertTrue(isArrayHasUniqValuesAndAscOrder(given, result));
    }

    @Test
    void bigArrayRemoveDuplicatesTest() {
        int[] given = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int result = solution.removeDuplicates(given);
        assertEquals(5, result);
        assertTrue(isArrayHasUniqValuesAndAscOrder(given, result));
    }

    public boolean isArrayHasUniqValuesAndAscOrder(int[] arr, int len) {
        if (len > arr.length) {
            throw new IllegalArgumentException("len > arr.length");
        }
        for (int i = 0; i < len - 1; i++) {
            if ((arr[i] >= arr[i + 1])) {
                return false;
            }
        }
        return true;
    }


}