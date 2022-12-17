package Stack.Leetcode;

import java.util.Stack;

//Leetcode Link:- https://leetcode.com/problems/evaluate-reverse-polish-notation/
public class EvaluateReversePolishNotation {

    public  static int evalRPN(String[] tokens) {
        if (tokens.length==1) return Integer.parseInt(tokens[0]);
        int size= tokens.length;

        Stack<Integer> st = new Stack<>();

        for (int i=0;i<size;i++) {
            if ("+".equals(tokens[i])) {
                int b =st.pop();
                int a = st.pop();
                st.push(a+b);
            } else if ("-".equals(tokens[i])) {
                int b =st.pop();
                int a = st.pop();
                st.push(a-b);
            } else if ("/".equals(tokens[i])) {
                int b =st.pop();
                int a = st.pop();
                st.push(a/b);
            } else if ("*".equals(tokens[i])) {
                int b =st.pop();
                int a = st.pop();
                st.push(a*b);
            } else  {
                st.push(Integer.valueOf(tokens[i]));
            }
        }
        return st.peek();
    }

    public static void main(String[] args) {
        String[] str = {"2","1","+","5","*"};
        System.out.print(evalRPN(str));
    }
}
