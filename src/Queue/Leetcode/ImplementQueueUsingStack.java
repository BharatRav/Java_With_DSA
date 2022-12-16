package Queue.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.Stack;

public class ImplementQueueUsingStack {
    Stack<Integer> st1;
    Stack<Integer> st2;
    public ImplementQueueUsingStack() {     //MyQueue class name on leetcode
        st1 =new Stack<>();
        st2 = new Stack<>();
    }

    public void push(int x) {
        st1.push(x);
    }

    public int pop() {
        if (st1.isEmpty()) return 0;
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        int answer = st2.pop();
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return answer;
    }

    public int peek() {
        if (st1.isEmpty()) return 0;
        while (!st1.isEmpty()) {
            st2.push(st1.pop());
        }
        int answer = st2.peek();
        while (!st2.isEmpty()){
            st1.push(st2.pop());
        }
        return answer;
    }

    public boolean empty() {
        return st1.isEmpty()?true:false;
    }
}
