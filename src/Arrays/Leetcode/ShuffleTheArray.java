package Arrays.Leetcode;
//Leetcode Link:-https://leetcode.com/problems/shuffle-the-array/description/
class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        //method 1
        // O(n) and T(n)
        // int[] res = new int[2 * n];
        // for (int i = 0, j = n, idx = 0; idx < res.length; i++, j++) {
        //     res[idx++] = nums[i];
        //     res[idx++] = nums[j];
        // }
        // return res;

        //method 2 O(n) and T(1)
        for(int i = 0; i < n; i++){
            nums[i] += nums[n + i] * 10000;
        }

        for(int i = n - 1; i >= 0; i--){
            nums[2 * i + 1] = nums[i] / 10000;
            nums[2 * i] = nums[i] % 10000;
        }

        return nums;
        // Just use the assumption that the numbers are less than 1000. So we can save the pairs together.

        //written by very brillian person
        //reffrence:- https://leetcode.com/problems/shuffle-the-array/solutions/865924/in-place-o-n-time-o-1-ultimate-simple-java-solution/?orderBy=most_votes
    }
}
