package GreedyAgorithms.Leetcode;

import java.util.Stack;

public class ValidParenthesisString {
    public boolean checkValidString(String s) {
        int length = s.length();
        Stack<Integer> brackets =  new Stack<>();
        Stack<Integer> asterisks = new Stack<>();
        for (int i=0;i<length;i++) {
            char ch = s.charAt(i);

            if(ch =='(') {
                brackets.push(i);
            }
            else if (ch == '*') {
                asterisks.push(i);
            }
            else if (!brackets.isEmpty()) {
                brackets.pop();
            }
            else if (!asterisks.isEmpty()) {
                asterisks.pop();
            }
            else {
                return false;
            }
        }

        while (!brackets.isEmpty() && !asterisks.isEmpty() && brackets.peek() < asterisks.peek()) {
            brackets.pop();
            asterisks.pop();
        }
        return brackets.isEmpty();
    }
}
