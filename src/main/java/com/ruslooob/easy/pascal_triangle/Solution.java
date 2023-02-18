package com.ruslooob.easy.pascal_triangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        result.add(1);
        if (rowIndex == 0) {
            return result;
        }
        if (rowIndex == 1) {
            result.add(1);
            return result;
        }
        List<Integer> prevList = new ArrayList<>(result);
        for (int i = 1; i < rowIndex; i++) {
            if (i == rowIndex - 1) {
                result.add(1);
            } else {
                result.add(prevList.get(i - 1) + prevList.get(i));
            }
            prevList = new ArrayList<>(result);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().getRow(3));
    }
}