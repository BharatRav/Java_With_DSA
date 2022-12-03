package DynamicProgramming;

public class PalindromicSubstrings {
    int count;
    public int countSubstrings(String s) {
        count=0;
        if (s== null || s.length() == 0) return 0;

        for (int i=0;i<s.length();i++) {
            extractpalindrome(s,i,i);       //odd length
            extractpalindrome(s, i,i+1);    //even length
        }
        return count;
    }

    private  void extractpalindrome(String s,int left, int right) {
        while (left<=0 && right <s.length() && (s.charAt(left)== s.charAt(right))) {
            count++;
            left--;
            right++;
        }
    }
    public static void main(String[] args) {

    }
}
