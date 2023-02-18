package com.ruslooob.easy.search_insert_position;

class Solution {

    public int searchInsert(int[] nums, int target) {
        int leftIdx = 0;
        int rightIdx = nums.length - 1;
        int middleIdx = 0;
        while (leftIdx <= rightIdx) {
            middleIdx = (leftIdx + rightIdx) / 2;
            if (nums[middleIdx] == target) {
                return middleIdx;
            } else if (nums[middleIdx] > target) {
                rightIdx = middleIdx - 1;
            } else if (nums[middleIdx] < target) {
                leftIdx = middleIdx + 1;
            }
        }

        if (nums[middleIdx] > target) {
            return middleIdx;
        } else {
            return middleIdx + 1;
        }
    }

}