package BinarySearch;
class KthMissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int low = 0, high = arr.length, mid;
        while (low < high) {
            mid = low + (high-low) / 2;
            if (arr[mid] - 1 - mid < k)
                low = mid + 1;
            else
                high = mid;
        }
        return low + k;
    }
}

/*
For this return l + k;, it can be explained in this way:
l is the first index that gives at least k missing numbers. It may have more missing numbers than we need, so we are actually interested in index l - 1.
At index l - 1, we have A[l-1] - (l-1) - 1 missing numbers
so after index l - 1 , we need to find k - (A[l-1] - (l-1) - 1) missing numbers, i.e. k - A[l-1] + l missing numbers
At index l - 1, our number is A[l-1]. Add them up, the target number will be A[l-1] + k - A[l-1] + l, i.e. k + l;
*/

