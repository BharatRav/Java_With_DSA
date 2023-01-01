package String.Leetcode;

import java.util.HashMap;

//Leetcode Link:-https://leetcode.com/problems/word-pattern/description/
public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] letter = s.split(" ");

        if (pattern.length()!= letter.length) {
            return false;
        }

        HashMap<Object,Integer> map = new HashMap<>();

        for (Integer i=0;i< letter.length;i++) {
            if (map.put(pattern.charAt(i),i)!= map.put(letter[i],i)) {
                return false;
            }
        }
        //make sure for loop has Integer  object i
        return true;
    }
}
