package com.ruslooob.easy.length_of_last_word;

class Solution {
    public int lengthOfLastWord(String s) {
        String trimmed = s.trim();
        String[] splitted = trimmed.split(" ");
        return splitted[splitted.length - 1].length();
    }
}