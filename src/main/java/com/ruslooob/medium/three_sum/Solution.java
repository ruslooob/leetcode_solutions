package com.ruslooob.medium.three_sum;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length && j != i; j++) {
                for (int k = 0; k < nums.length && k != j; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        int min = Math.min(Math.min(nums[i], nums[j]), nums[k]);
                        int middle;
                        if ((nums[i] >= nums[j] && nums[i] <= nums[k]) || (nums[i] <= nums[j] && nums[i] >= nums[k])) {
                            middle = nums[i];
                        } else if ((nums[j] >= nums[i] && nums[j] <= nums[k]) || (nums[j] <= nums[i] && nums[j] >= nums[k])) {
                            middle = nums[j];
                        } else {
                            middle = nums[k];
                        }
                        int max = Math.max(Math.max(nums[i], nums[j]), nums[k]);
                        res.add(List.of(min, middle, max));
                    }
                }
            }
        }

        return res.stream().toList();
    }

    public static void main(String[] args) {
        System.out.println(new Solution().threeSum(new int[]{-1,0,1,2,-1,-4}));
    }
}