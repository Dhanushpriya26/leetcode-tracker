// Last updated: 8/9/2026, 8:41:33 AM
1class Solution {
2    public double minPrice(int[] prices, int[] discounts) {
3        Arrays.sort(prices);
4        Arrays.sort(discounts);
5        int n=prices.length;
6        int m=discounts.length;
7        double total=0.0;
8        int k=Math.min(n,m);
9        for(int i=0;i<k;i++){
10            int p=prices[n-1-i];
11            int d=discounts[m-1-i];
12            total+=p*(100.0-d)/100.0;
13        }
14        for(int i=0;i<n-k;i++){
15            total+=prices[i];
16        }
17        return total;
18    }
19}