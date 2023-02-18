package com.ruslooob.medium.group_anagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void test1() {
        String[] given = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = solution.groupAnagrams(given);
        boolean contains1 = lists.contains(List.of("bat"));
        boolean contains2 = lists.contains(List.of("nat", "tan"));
        boolean contains3 = lists.contains(List.of("ate", "eat", "tea"));
        assertTrue(contains1 && contains2 && contains3);
    }

}