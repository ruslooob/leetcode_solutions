package com.ruslooob.easy.climbing_stairs;

class Solution {
    /*
     * Дано: кол-во ступенек, которое надо пройти
     * Найти: коле-во способов с помощью которых можно пройти этот путь
     * Величина шага 1 или 2 единицы
     * */
    public int climbStairs(int n) {
        if (n >= 1 && n <= 3) {
            return n;
        }
        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int tmp = first;
            first = second;
            second += tmp;
        }
        return second;
    }
}