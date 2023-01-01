package _Leetcode_Contests.WeaklyContest_326;

import java.util.HashMap;

public class CountTheDigitsThatDivideANumber {
    /*
    Constraints:
                1 <= num <= 109
                num does not contain 0 as one of its digits.
     */
    public int countDigits(int num) {
        int count =0;
        int realNumber=num;
        int rem ;
        while (num>0) {
            rem = num%10;
            if (realNumber%rem ==0) {
                count++;
            }
            num/= 10;
        }
        return count;
    }
}
