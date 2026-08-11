// Last updated: 8/11/2026, 8:32:59 PM
class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n = nums.length;
        return 1 << (32 - Integer.numberOfLeadingZeros(n) - 3 / (n + 1));
    }
}