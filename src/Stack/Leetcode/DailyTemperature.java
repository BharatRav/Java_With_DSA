package Stack.Leetcode;

import java.util.Stack;

////Leetcode Link:-https://leetcode.com/problems/daily-temperatures/description/
public class DailyTemperature {
     // i have solved it using arraydeque
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();

        int len = temperatures.length;
        int[] res = new int[len];

        for (int i=0;i<len;i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i-idx;
            }
            stack.push(i);
        }
        return res;
    }
}
