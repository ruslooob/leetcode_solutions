package com.ruslooob.easy.best_time_to_buy_and_sell_stock;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().maxProfit(new int[]{1,2}));
    }

    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int minPrice = prices[0];
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxPrice = Math.max(prices[i] - minPrice, maxPrice);
        }
        return maxPrice;
    }
}
