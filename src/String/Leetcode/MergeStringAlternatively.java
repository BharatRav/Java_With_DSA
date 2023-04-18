package String.Leetcode;

public class MergeStringAlternatively {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int len_word1 =word1.length();
        int len_word2 =word2.length();

        int i=0,j=0;

        while(i<len_word1 && j<len_word2) {
            if (i<=j) {
                sb.append(word1.charAt(i++));
            } else {
                sb.append(word2.charAt(j++));
            }
        }

        if(i<len_word1) {
            sb.append(word1.substring(i));
        }

        if (j<len_word2) {
            sb.append(word2.substring(j));
        }


        return sb.toString();
    }
}
