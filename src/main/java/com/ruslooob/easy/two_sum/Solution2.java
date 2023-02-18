package com.ruslooob.easy.two_sum;

import java.util.HashMap;
import java.util.Map;

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        //Map<Complement, Idx>
        Map<Integer, Integer> complements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (complements.get(nums[i]) != null) {
                return new int[]{i, complements.get(nums[i])};
            } else {
                complements.put(target - nums[i], i);
            }
        }
        throw new IllegalStateException("impossible caes");
    }
}