package com.ruslooob.easy.remove_duplicates_from_sorted_array;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for  (int i = nums.length - 1;  i > 0; i--){
            if (nums[i] == nums[i - 1]) {
                // mark as invalid
                nums[i] = Integer.MAX_VALUE;
                count++;
            }
        }
        Arrays.sort(nums);
        return nums.length - count;
    }
}