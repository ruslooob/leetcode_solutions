package com.ruslooob.easy.add_binary;

class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        int carry = 0;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.max(aLen, bLen); i++) {
            int digitA = i < aLen ? a.charAt(aLen - i - 1) - '0' : 0;
            int digitB = i < bLen ? b.charAt(bLen - i - 1) - '0' : 0;
            int total = digitA + digitB + carry;
            result.insert(0, total % 2);
            carry = total / 2;
        }

        if (carry != 0) {
            result.insert(0, 1);
        }
        return result.toString();
    }
}