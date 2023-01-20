package com.ruslooob.longest_common_prefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder commonPrefix = new StringBuilder(strs[0]);

        first_loop:
        for (int i = 1; i < strs.length - 1; i++) {
            StringBuilder prefix = new StringBuilder();
            for (int j = 0; j < strs[i].length(); j++) {
                if (j < strs[i + 1].length() && strs[i].charAt(j) == strs[i + 1].charAt(j)) {
                    prefix.append(strs[i].charAt(j));
                } else {
                    if (commonPrefix.length() > prefix.length()) {
                        commonPrefix = prefix;
                    }
                    continue first_loop;
                }
            }
        }
        return commonPrefix.toString();
    }

}
