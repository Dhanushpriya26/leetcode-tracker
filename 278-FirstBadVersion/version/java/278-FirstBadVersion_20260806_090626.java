// Last updated: 8/6/2026, 9:06:26 AM
1/* The isBadVersion API is defined in the parent class VersionControl.
2      boolean isBadVersion(int version); */
3public class Solution extends VersionControl {
4    public int firstBadVersion(int n) {
5        int low = 0;
6        int high = n;
7        while(low<=high){
8            int mid = low + (high-low)/2;
9            if(isBadVersion(mid)==true && isBadVersion(mid-1)==false)   return mid;
10            else if(isBadVersion(mid)==false ) low = mid+1;
11            else high= mid;
12        }     
13        return -1;
14    }
15}