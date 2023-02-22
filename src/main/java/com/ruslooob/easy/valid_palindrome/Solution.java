package com.ruslooob.easy.valid_palindrome;

public class Solution {
    public boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i <= j; ) {
            if (!(Character.isLetterOrDigit(s.charAt(i)))) {
                i++;
                continue;
            }
            if (!(Character.isLetterOrDigit(s.charAt(j)))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
