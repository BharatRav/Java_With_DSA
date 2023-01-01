package _Leetcode_Contests.WeaklyContest_326;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DistinctPrimeFactorsOfProductOfArray {
    public int distinctPrimeFactors(int[] nums) {
        Set<Integer> primeFactors = new HashSet<>();
        for (int num : nums) {
            // Factorize num into its prime factors
            int i = 2;
            while (num > 1) {
                if (num % i == 0) {
                    primeFactors.add(i);
                    num /= i;
                } else {
                    i++;
                }
            }
        }
        return primeFactors.size();

    }

    public static void main(String[] args) {
        DistinctPrimeFactorsOfProductOfArray main = new DistinctPrimeFactorsOfProductOfArray();
        int[] nums ={2,4,8,16};
        System.out.print(main.distinctPrimeFactors(nums));
    }
}
