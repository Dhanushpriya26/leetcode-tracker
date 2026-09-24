// Last updated: 9/24/2026, 9:09:33 PM
1class Solution {
2    public int maxProfit(int[] prices) {
3        int profit = 0;
4        for (int i = 1; i < prices.length; i++) {
5            if (prices[i] > prices[i - 1]) {
6                profit += prices[i] - prices[i - 1];
7            }
8        }
9
10        return profit;
11    }
12}