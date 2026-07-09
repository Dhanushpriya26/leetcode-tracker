// Last updated: 7/9/2026, 9:13:42 AM
class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        for (int num : nums) {
            mn = Math.min(mn, num);
            mx = Math.max(mx, num);
        }

        return 1L * k * (mx - mn);
    }
}