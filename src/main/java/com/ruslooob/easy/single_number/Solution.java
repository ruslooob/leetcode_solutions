package com.ruslooob.easy.single_number;

class Solution {
    public int singleNumber(int[] nums) {
        int sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.abs(sum - nums[i]);
        }
        return sum;
    }

}

