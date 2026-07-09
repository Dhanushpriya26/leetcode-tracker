// Last updated: 7/9/2026, 9:18:51 AM
public class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if (((n >> i) & 1) == 1) {
                res += 1;
            }
        }
        return res;        
    }
}