package com.ruslooob.medium.valid_sudoku;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().isValidSudoku(new char[][]{
                new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        }));
    }

    //classic solution
    public boolean isValidSudoku1(char[][] board) {
        record Pair(int first, int second) {
        }

        Map<Integer, HashSet<Character>> rows = new HashMap<>();
        Map<Integer, HashSet<Character>> cols = new HashMap<>();
        Map<Pair, HashSet<Character>> squares = new HashMap<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!rows.computeIfAbsent(i, integer -> new HashSet<>()).add(board[i][j])
                            || !cols.computeIfAbsent(j, integer -> new HashSet<>()).add(board[i][j])
                            || !squares.computeIfAbsent(new Pair(i / 3, j / 3), pair -> new HashSet<>()).add(board[i][j])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    //hacky solution
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>(256);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String curr = "(" + board[i][j] + ")";
                    if (!seen.add(curr + i) || !seen.add(j + curr) || !seen.add(i / 3 + curr + j / 3)) return false;
                }
            }
        }
        return true;
    }
}
