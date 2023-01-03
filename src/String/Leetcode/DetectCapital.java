package String.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/detect-capital/description/
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int count =0;

        for (char ch:word.toCharArray()) {
            if ('Z'-ch >=0)
                count++;
        }

        return count==0 || count == word.length() || (count ==1 && 'Z' -word.charAt(0) >=0);
    }
}
