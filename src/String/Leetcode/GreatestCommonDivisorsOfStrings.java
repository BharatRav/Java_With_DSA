package String.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/greatest-common-divisor-of-strings/description/
public class GreatestCommonDivisorsOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1+str2).equals(str2+str1)) {
            return "";
        }

        int gcdOfStrings=gcd(str1.length(),str2.length());
        return str1.substring(0,gcdOfStrings);
    }
    private static int gcd(int n1, int n2) {
        if(n2==0){
            return n1;
        }
        return gcd(n2,n1%n2);
    }
}
