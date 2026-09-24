// Last updated: 9/24/2026, 9:32:50 PM
1class Solution {
2    public int singleNumber(int[] nums) {
3    int ans = 0;
4    for(int i = 0; i < 32; i++) {
5        int sum = 0;
6        for(int j = 0; j < nums.length; j++) {
7            if(((nums[j] >> i) & 1) == 1) {
8                sum++;
9                sum %= 3;
10            }
11        }
12        if(sum != 0) {
13            ans |= sum << i;
14        }
15    }
16    return ans;
17}
18}