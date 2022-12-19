package String.Leetcode;

import java.util.HashSet;
import java.util.Set;

//Letcode Link:-https://leetcode.com/problems/determine-if-string-halves-are-alike/description/
public class DetermineIfStringHaalvesAreAlike {
    public boolean halvesAreAlike(String s) {
        Set<Character> set  = new HashSet<>();

        set.add('a'); set.add('e');set.add('i');set.add('o');set.add('u');

        int count =0;

        for (int i=0;i<s.length();i++) {
            if (set.contains(s.charAt(i)) || set.contains(Character.toLowerCase(s.charAt(i)))) {
                count = (i<s.length()/2)?count+1:count-1;
            }
        }
        return count ==0;
    }
}
