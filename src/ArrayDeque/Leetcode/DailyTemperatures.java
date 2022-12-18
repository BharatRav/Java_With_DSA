package ArrayDeque.Leetcode;

import java.util.ArrayDeque;

//Leetcode Link:-https://leetcode.com/problems/daily-temperatures/description/
public class DailyTemperatures {

    //main solution is using stack
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i=len-1;i>=0;i--) {
            if (deque.isEmpty()) {
                res[i] =0;
                deque.offerFirst(i);
            } else {
                while (deque.size()!=0 && temperatures[i]>=temperatures[deque.peekFirst()])
                    deque.pollFirst();

                if (deque.size()==0) {
                    res[i]=0;
                } else {
                    res[i] = deque.peekFirst()-i;

                }
                deque.offerFirst(i);
            }
        }
        return res;
    }
}
