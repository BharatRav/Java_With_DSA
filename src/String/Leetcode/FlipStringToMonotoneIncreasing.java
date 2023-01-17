package String.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/flip-string-to-monotone-increasing/
public class FlipStringToMonotoneIncreasing {
    public int minFlipsMonoIncr(String s) {
//        if (s==null || s.length()==0) return 0;

        int flipCount=0;        //how many zeroes we have to convert to 1
        int oneCount =0;

        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '0') {
                if (oneCount==0) {
                    continue;
                }
                flipCount++;
            } else {
                oneCount++;
            }

            if (flipCount>oneCount) {
                flipCount=oneCount;
            }
        }
        return flipCount;
    }
}
/*
public int minFlipsMonoIncr(String s) {
      if(s==null ||s.length()<=0) {
          return 0;
      }
    char[] charArr = s.toCharArray();
	int flipCount = 0;
	int onesCount = 0;
    for(int i=0;i<charArr.length;i++){
        if(charArr[i]=='0'){
            if(onesCount==0)continue;
            else flipCount++;
        }
        else{
            onesCount++;
        }
        if(flipCount>onesCount){
          flipCount=onesCount;
        }
    }
 */
