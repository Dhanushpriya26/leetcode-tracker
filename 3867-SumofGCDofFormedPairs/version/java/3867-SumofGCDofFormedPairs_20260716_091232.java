// Last updated: 7/16/2026, 9:12:32 AM
1class Solution {
2    public long gcdSum(int[] nums) {
3        int[] prefixGcd = new int[nums.length];
4        int max = -1;
5        for (int i = 0; i < nums.length; i++) {
6            max = Math.max(max, nums[i]);
7            prefixGcd[i] = gcd(max, nums[i]);
8        }
9        Arrays.sort(prefixGcd);
10        long sum = 0;
11        int i = 0, j = nums.length - 1;
12        while (i < j) {
13            sum += gcd(prefixGcd[i], prefixGcd[j]);
14            i++;
15            j--;
16        }
17        return sum;
18    }
19    private int gcd(int a, int b) {
20        while (b != 0) {
21            int temp = b;
22            b = a % b;
23            a = temp;
24        }
25        return a;
26    }
27}