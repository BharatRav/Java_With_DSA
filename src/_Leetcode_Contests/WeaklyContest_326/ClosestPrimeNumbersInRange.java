package _Leetcode_Contests.WeaklyContest_326;

public class ClosestPrimeNumbersInRange {
    static boolean[] prime;
    public int[] closestPrimes(int left, int right) {
        primeNumberInitialization(right);
        int[] res = {-1,-1};

        int i=left;
        while (i<=right &&!prime[i]) {
            i++;
        }
        int result = right;
        for (int idx =i+1;idx<=right;idx++) {
            if (prime[idx]) {
                if ((idx-i)<result) {
                    res[0] =i;
                    res[1] = idx;
                    result =idx-i;
                }
                i=idx;
            }
        }
        return res;
    }
    private  void primeNumberInitialization(int limit) {
        // all entries it as true. A value in prime[i] will
        // finally be false if i is Not a prime, else true.
        prime = new boolean[limit+1];
        for (int i=0;i<=limit;i++) {
            prime[i] =true;
        }
        prime[1] =false;

        for (int p =2; p*p<=limit;p++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[p]==true) {
                // Update all multiples of p
                for (int i=p*p;i<=limit;i+=p) {
                    prime[i] =false;
                }
            }
        }
    }

    public static void main(String[] args) {
       ClosestPrimeNumbersInRange main = new ClosestPrimeNumbersInRange();
        int[]data =main.closestPrimes(19,31);
        for (int a: data) {
            System.out.print(a+" ");
        }
    }
}

