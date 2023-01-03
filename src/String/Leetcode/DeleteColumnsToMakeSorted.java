package String.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/delete-columns-to-make-sorted/
public class DeleteColumnsToMakeSorted {
    public int minDeletionSize(String[] strs) {
        int strLen=strs[0].length();
        int arrLen = strs.length;

        int count =0;       //count is for counting the columns to delete

        for (int idx=0;idx<strLen;idx++) {
            for (int j=0;j<arrLen-1;j++) {
                //check jth and j+1th
                if (strs[j].charAt(idx)> strs[j+1].charAt(idx)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
//["abc", "bce", "cae"]
/*
abc
bce
cae
 */
