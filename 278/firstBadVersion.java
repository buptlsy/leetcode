/* The isBadVersion API is defined in the parent class VersionControl.
 *       boolean isBadVersion(int version); */
/*
 * case 1: 1
 * case 2: 1,2
 * case 3: 1,2,3
 */
public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        while (end > start) {
            int mid = start + (end - start)/2;
                if (isBadVersion(mid)) {
                    end = mid;
                } else {
                    start = mid+1;
                }
        }
        return end;
    }
}
