package Arrays.HashSet;

import java.util.HashSet;
import java.util.Set;
//Leetcode Link:-https://leetcode.com/problems/longest-palindrome/description/?envType=study-plan&id=level-1
public class LongestPlindrome {
    public int longestPalindrome(String s) {
        if (s ==null || s.length()==0) return 0;

        int count=0;
        Set<Character> hs = new HashSet<>();

        for (int i=0;i<s.length();i++) {
            if (hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(i));
                count++;
            } else{
                hs.add(s.charAt(i));
            }
        }

        count=count*2;

        return count =hs.isEmpty()? count:count+1;


    }
}
