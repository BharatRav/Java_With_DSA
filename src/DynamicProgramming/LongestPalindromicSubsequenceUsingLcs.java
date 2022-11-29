package DynamicProgramming;

import com.sun.source.util.SimpleTreeVisitor;

public class LongestPalindromicSubsequenceUsingLcs {

    private  static  int lpsUsinglcs(String s, String rev) {
        int firstSize = s.length();
        int secondSize = rev.length();

        int[][] dp = new int[firstSize+1][secondSize+1];

        for (int i=1; i<=firstSize;i++) {
            for (int j=1; j<=secondSize;j++) {
                if (s.charAt(i-1) == rev.charAt(j-1)) {
                    dp[i][j] = 1+ dp[i-1][j-1];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return  dp[firstSize][secondSize];
    }
    public  static  int lps(String s) {
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();

        return lpsUsinglcs(s,rev);
    }
    public static void main(String[] args) {
        String str = "Bharat";
        int result = lps(str);
        System.out.println(result);
    }
}
