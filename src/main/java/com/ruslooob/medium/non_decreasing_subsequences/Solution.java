package com.ruslooob.medium.non_decreasing_subsequences;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        Set<List<Integer>> subs = new HashSet<>();
        List<Integer> superSub = new ArrayList<>();
        // find superSubsequence
        superSub.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
                superSub.add(nums[i]);
            }
        }
        subs.add(superSub);
        // find permutations
        for (int i = 0; i < superSub.size(); i++) {
            List<Integer> sub = new ArrayList<>();
            sub.add(superSub.get(i));
            for (int j = i + 1; j < superSub.size(); j++) {
                sub.add(superSub.get(j));
                subs.add(new ArrayList<>(sub));
            }
        }
        return subs.stream().toList();
    }
}