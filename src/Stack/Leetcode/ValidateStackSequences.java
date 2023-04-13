package Stack.Leetcode;

import java.util.Stack;

public class ValidateStackSequences {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> st = new Stack<>();

        int i = 0;

        int j = 0;
        st.push(pushed[i++]);
        while (i < pushed.length) {
            if (!st.isEmpty() && st.peek() == popped[j]) {
                j++;
                st.pop();
            } else {
                st.push(pushed[i++]);
            }
        }

        while (!st.isEmpty()) {
            if (st.peek() != popped[j]) {
                return false;
            }

            st.pop();
            j++;
        }

        return true;
    }
}
