package _Leetcode_Contests.WeaklyContest_334;
//LeetcodeLink:-https://leetcode.com/contest/weekly-contest-334/problems/find-the-divisibility-array-of-a-string/
public class FindTheDivisibilityArrayOfAString {
    public int[] divisibilityArray(String word, int m) {
        /*
        word = "998244353", m = 3
        Output: [1,1,0,0,0,1,1,0,0]
         */
        int n=word.length();
        int[] answer = new int[n];
        int data=0;
        for (int i=0;i<n;i++) {
            data = data *10 + Character.getNumericValue(word.charAt(i));
            if (data>=m) {
                if (data%m ==0) {
                    answer[i]=1;
                }
                data =data%m;
            } else {
                answer[i] =0;
            }
        }
        return answer;
    }
}
