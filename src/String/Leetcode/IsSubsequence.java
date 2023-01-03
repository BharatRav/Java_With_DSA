package String.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/is-subsequence/description/?envType=study-plan&id=level-1
public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        if (s ==null || s.length()==0){
            return true;
        }
        int indexS=0,indexT =0;

        while (indexT<t.length()) {
            if (s.charAt(indexS)==t.charAt(indexT)) {
                indexS++;
                if (indexS==s.length()) {
                    return true;
                }
            }
            indexT++;
        }
        return false;
    }
    //it has other method 2 which is DP approach
    //if you want to solve it then go to the question link
}
