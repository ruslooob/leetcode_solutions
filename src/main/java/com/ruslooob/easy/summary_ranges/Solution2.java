package com.ruslooob.easy.summary_ranges;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public List<String> summaryRanges(int[] nums) {
        int len = nums.length;
        List<String> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int start = nums[i];
            while (i + 1 < len && nums[i] + 1 == nums[i + 1]) i++;
            if (start != nums[i]) res.add("" + start + "->" + nums[i]);
            else res.add("" + start);
        }
        return res;
    }
}
