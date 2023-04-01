package String.Leetcode;
//Link:-https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/
public class MinimumAddToMakeParenthesisValid {
    public int minAddToMakeValid(String s) {
        // enter your code here.
        int  unmatchedOpen =0,unmatchedClose=0;

        int len = s.length();
        for (int i=0;i<len;i++) {
            if (s.charAt(i)=='(') {
                unmatchedOpen++;
            }
            else if (unmatchedOpen>0) {
                unmatchedOpen--;
            }
            else {
                unmatchedClose++;
            }
        }

        return unmatchedOpen+unmatchedClose;
    }
}
