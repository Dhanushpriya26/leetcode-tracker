// Last updated: 8/11/2026, 8:44:31 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n <= 0) {
            return false;
        }
        return Math.log(n) / Math.log(4) %1==0;       
    }
}