package com.ruslooob.medium.group_anagrams;

import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> resultMap = new HashMap<>();
        for (String str : strs) {
            String key = getSortedStr(str);
            List<String> values = resultMap.getOrDefault(key, new ArrayList<>());
            values.add(str);
            resultMap.put(key, values);
        }
        return new ArrayList<>(resultMap.values());
    }

    public static String getSortedStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (char ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }
}