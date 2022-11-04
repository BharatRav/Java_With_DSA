package BinarySearch;

public class RotatedArraySearch {
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,0,1,2,3};
        int b = 8; // target
        int start = 0;
        int n = arr.length;
        System.out.println(
                "Index of the element is : "
                        + pivotedBinarySearch(arr, n, b));

    }
    static int pivotedBinarySearch(int arr[], int n,
                                   int key)
    {
        int pivot = findPivot(arr, 0, n - 1);

        // If we didn't find a pivot, then
        // array is not rotated at all
        if (pivot == -1)
            return binarySearch(arr, 0, n - 1, key);

        // If we found a pivot, then first
        // compare with pivot and then
        // search in two subarrays around pivot
        if (arr[pivot] == key)
            return pivot;
        if (arr[0] <= key)
            return binarySearch(arr, 0, pivot - 1, key);
        return binarySearch(arr, pivot + 1, n - 1, key);
    }

    /* Function to get pivot. For array
       3, 4, 5, 6, 1, 2 it returns
       3 (index of 6) */
    static int findPivot(int arr[], int low, int high)
    {
        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (mid < high && arr[mid] > arr[mid + 1])
            return mid;
        if (mid > low && arr[mid] < arr[mid - 1])
            return (mid - 1);
        if (arr[low] >= arr[mid])
            return findPivot(arr, low, mid - 1);
        return findPivot(arr, mid + 1, high);
    }

    /* Standard Binary Search function */
    static int binarySearch(int arr[], int low, int high,
                            int key)
    {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

}

/*
    Given an array of integers A of size N and an integer B.

        array A is rotated at some pivot unknown to you beforehand.

        (i.e., 0 1 2 4 5 6 7  might become 4 5 6 7 0 1  2).

        You are given a target value B to search. If found in the array, return its index, otherwise return -1.

        You may assume no duplicate exists in the array.

        NOTE:- Array A was sorted in non-decreasing order before rotation.


        The first argument given is the integer array A.
        The second argument given is the integer B.
        Output Format

        Return index of B in array A, otherwise return -1
        Constraints

        1 <= N <= 1000000
        1 <= A[i] <= 10^9
        all elements in A are disitinct.
        For Example

        Input 1:
        A = [4, 5, 6, 7, 0, 1, 2, 3]
        B = 2
        Output 1:
        6
        Explanation 1:
        Target 2 is found at index 6 in A.


        Input 2:
        A = [5, 17, 100, 3]
        B = 6
        Output 2:
        -1



public int solve(int[] arr, int k) {



        }
        */