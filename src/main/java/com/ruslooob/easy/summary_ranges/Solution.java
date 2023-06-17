package com.ruslooob.easy.summary_ranges;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        if (len == 0) {
            return List.of();
        }
        if (len == 1) {
            return List.of(Integer.toString(nums[0]));
        }

        List<String> result = new ArrayList<>();

        int left = 0;
        int right = 1;

        while (left < right && right < len) {
            if (nums[right - 1] + 1 == nums[right] && (right + 1 == len || nums[right + 1] != nums[right] + 1)) {
                result.add("%s->%s".formatted(nums[left], nums[right]));
                left = right + 1;
                if (left == len - 1) {
                    result.add(Integer.toString(nums[left]));
                    break;
                } else {
                    right = left + 1;
                }
            } else if (nums[right - 1] + 1 == nums[right] && nums[right + 1] == nums[right] + 1) {
                right++;
            } else {
                result.add(Integer.toString(nums[left]));
                left = right;
                if (left == len - 1) {
                    result.add(Integer.toString(nums[right]));
                    break;
                } else {
                    right = left + 1;
                }
            }
        }

        return result;
    }
}