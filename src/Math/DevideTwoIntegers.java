package Math;
//Leetcode Link:-https://leetcode.com/problems/divide-two-integers/description/
public class DevideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if(divisor == 0||(dividend == Integer.MIN_VALUE && divisor == -1))
            return Integer.MAX_VALUE;
        else
            return (dividend-dividend%divisor)/divisor;
    }
}
