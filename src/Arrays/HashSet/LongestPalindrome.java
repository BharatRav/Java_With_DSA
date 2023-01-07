package Arrays.HashSet;

import java.util.HashSet;
import java.util.Set;

//Leetcode Link:-https://leetcode.com/problems/longest-palindrome/description/?envType=study-plan&id=level-1
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if (s==null || s.length() ==0) {
            return 0;
        }
        int count=0;
        Set<Character> hs = new HashSet<>();
        int size = s.length();

        for (int i=0;i<size;i++) {
            if (hs.contains(s.charAt(i))){
                hs.remove(s.charAt(i));
                count++;
            } else {
                hs.add(s.charAt(i));
            }
        }
        count= count*2;
//        return count==size?count:count+1;
//        or
        return (!hs.isEmpty())?count+1:count;
    }
}
