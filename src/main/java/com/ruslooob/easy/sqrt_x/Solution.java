package com.ruslooob.easy.sqrt_x;

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        for (int i = 1; i <= x; i++) {
            long mul = (long) i * i;
            if (mul > x) {
                return i - 1;
            } else if (mul == x) {
                return i;
            }
        }
        throw new IllegalStateException("impossible state");
    }
}