package com.ruslooob.valid_parentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();

        if (s.length() % 2 == 1) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ')' || ch == ']' || ch == '}') {
                if (!parentheses.isEmpty() && parentheses.peek() == invertParentheses(ch)) {
                    parentheses.pop();
                } else {
                    return false;
                }
            } else {
                parentheses.push(ch);
            }
        }
        return parentheses.isEmpty();
    }

    public static char invertParentheses(char parentheses) {
        switch (parentheses) {
            case ')' : return '(';
            case ']' : return '[';
            case '}' : return '{';
        }
        throw new IllegalArgumentException("impossible");
    }
}
