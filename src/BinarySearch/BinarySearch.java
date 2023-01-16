package BinarySearch;
//Leetcode Link:-https://leetcode.com/problems/binary-search/?envType=study-plan&id=level-1
public class BinarySearch {
    public int search(int[] nums, int target) {
        int l=0,r= nums.length-1;
//        int mid= l+(l+r)/2;

        while (l<=r) {
            int mid =l+(r-l)/2;
            if (nums[mid]==target) {
                return mid;
            } else if (nums[mid]<target) {
                l=mid+1;
            } else {
                r =mid-1;
            }
        }

        return -1;
    }
}
