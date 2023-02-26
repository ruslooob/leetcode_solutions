package com.ruslooob.easy.find_the_town_judge;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        new Solution().findJudge(
                2,
                new int[][]{
                        new int[]{1, 2},
                }
        );
    }

    public int findJudge(int n, int[][] trust) {
        HashMap<Integer, Integer> trusts = new HashMap<>();
        for (int i = 0; i < trust.length; i++) {
            Integer currTrust = trusts.get(trust[i][1]);
            if (currTrust == null) {
                trusts.put(trust[i][1], 1);
            } else {
                trusts.put(trust[i][1], currTrust + 1);
            }
        }
        Map.Entry<Integer, Integer> judgeCandidate = trusts.entrySet()
                .stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .stream()
                .findAny().orElseThrow();


        return judgeCandidate.getValue() == n - 1 ? judgeCandidate.getKey() : -1;
    }

}
