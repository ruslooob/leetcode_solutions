package com.ruslooob.easy.greatest_common_divisor_of_strings;

class Solution {
    public static boolean isStringDividedBy(String str, String div) {
        if (str.length() % div.length() != 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != div.charAt(i % div.length())) {
                return false;
            }
        }
        return true;
    }

    public String gcdOfStrings(String str1, String str2) {
        if (str1.length() < str2.length()) {
            String tmp = str1;
            str1 = str2;
            str2 = tmp;
        }

        for (int j = 0; j < str2.length(); j++) {
            String div = str2.substring(0, str2.length() - j);
            if (isStringDividedBy(str1, div) && isStringDividedBy(str2, div)) {
                return div;
            }
        }
        return "";

    }
}