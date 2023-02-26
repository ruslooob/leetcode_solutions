package com.ruslooob.easy.reverse_bits;

public class Solution {
    public int reverseBits(int n) {
        String binaryString = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            sb.append(binaryString.charAt(i));
        }
        return Integer.parseUnsignedInt(sb.toString(), 2);
    }
}