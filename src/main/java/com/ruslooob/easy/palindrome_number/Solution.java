package com.ruslooob.easy.palindrome_number;

class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        if (str.length() == 1) {
            return true;
        }
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

}