package String.Leetcode;

import java.util.Scanner;

//Leetcode Link:-https://leetcode.com/problems/integer-to-roman/
public class IntegerToRoman {
    public static final  int[] INTEGERS = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public static  final  String[] ROMANS = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num) {
        for (int i=0;i<INTEGERS.length;i++) {
            if (num>=INTEGERS[i]) {
                return ROMANS[i]+intToRoman(num -INTEGERS[i]);
            }
        }
        return "";
    }

}
