// Last updated: 7/23/2026, 8:53:26 AM
1class Solution {
2    public int uniqueXorTriplets(int[] nums) {
3        int n = nums.length;
4        return 1 << (32 - Integer.numberOfLeadingZeros(n) - 3 / (n + 1));
5    }
6}