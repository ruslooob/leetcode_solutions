package com.ruslooob.easy.happy_number;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    /*
     * 1. Разбить число на цифры, из которых оно состоит
     * 2. Найти сумму квадратов цифр, полученных на 1 шаге
     * 3. Повторить шаги 1 и 2 до тех пор, пока не получится 1
     * */
    public boolean isHappy(int n) {
        List<Integer> prevResults = new ArrayList<>();

        int newSumOfQuadDigits = getSumOfQuadDigits(n);

        while (true) {
            if (newSumOfQuadDigits == 1) {
                return true;
            }
            newSumOfQuadDigits = getSumOfQuadDigits(newSumOfQuadDigits);
            if (prevResults.contains(newSumOfQuadDigits)) {
                return false;
            }
            prevResults.add(newSumOfQuadDigits);
        }
    }

    public int getSumOfQuadDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
}