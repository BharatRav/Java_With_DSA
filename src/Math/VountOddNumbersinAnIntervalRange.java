package Math;

public class VountOddNumbersinAnIntervalRange {
    public int countOdds(int low, int high) {
        //direct straighforward method 1
        int first =low/2;
        int second =high%2==0?high/2:(high/2)+1;
        return second-first;

        ///or
        //make difference then count half method 2
//        int result=high-low+1;  //counting total numbers in range
//
//        if(low%2!=0 && high%2!=0)
//            return (result/2)+ 1;
//        else
//            return result/2;

        //its your choice guys what is easier to understand
    }
}
