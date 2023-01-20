package com.ruslooob.easy.plus_one;

import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();
        for (int digit : digits) {
            sb.append(digit);
        }
        BigInteger bigInteger = new BigInteger(sb.toString());
        BigInteger plusOne = bigInteger.add(new BigInteger("1"));
        return Arrays.stream(plusOne.toString().split("")).mapToInt(Integer::parseInt).toArray();
    }
}