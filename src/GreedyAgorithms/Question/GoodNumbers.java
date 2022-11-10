package GreedyAgorithms.Question;
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework
public class GoodNumbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result=0;
        if(str.length()<2) {
            result =Integer.parseInt(str);
        } else {
            result=(str.length()-1)*9;
            int i=1;
            result+=(Character.getNumericValue(str.charAt(0))-1);
            while (i<str.length()) {
                if(str.charAt(i-1)<str.charAt(i)) {
                    result++;
                    break;
                } else if(str.charAt(i-1) >str.charAt(i)) {
                    break;
                } else {
                    if(i==str.length()-1) {
                        result++;
                    }
                    i++;
                }
            }
        }

        System.out.println(result);
    }
}




/*
Good Numbers
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a positive integer N. You have to the find the count of good numbers from 1 to N.
A good number is a number which consists of only 1 unique digit. More formally, it consists of only one digit repeating one or more times. Some examples of good numbers are- 3, 77, 8888, 444444, while 48, 99913, 777770 are not good numbers.
Input
First and the only line of input contains N.

Constraints:
1 <= N <= 1018
Output
Print the count of good numbers from 1 to N.
Example
Sample Input:
13

Sample Output:
10

Explaination:
The 10 good numbers from 1 to 13 are:
1, 2, 3, 4, 5, 6, 7, 8, 9, 11
 */
//1000000000000000000000000000000000000000000000000
//(10* 6times karod)