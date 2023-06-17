package com.ruslooob.medium.maximum_subarray;


class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }

    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = 0;

        for (int num : nums) {
            if (curSum < 0) {
                curSum = 0;
            }
            curSum += num;
            maxSum = Math.max(curSum, maxSum);
        }

        return maxSum;
    }
}