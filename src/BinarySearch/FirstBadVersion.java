package BinarySearch;

public class FirstBadVersion {


    /* The isBadVersion API is defined in the parent class VersionControl.
          boolean isBadVersion(int version); */
    abstract class VersionControl {
        boolean isBadVersion(int data) {
            return true;
        }
    }

    public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            int start = 0;
            int end = n;

            while (start < end) {
                int mid = start + (end - start) / 2;

                if (!isBadVersion(mid)) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }
            return start;
        }
    }

}