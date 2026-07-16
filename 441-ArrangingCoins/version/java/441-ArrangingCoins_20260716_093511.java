// Last updated: 7/16/2026, 9:35:11 AM
1class Solution {
2    public int arrangeCoins(int n) {
3        int ans=0,index=1;
4        while(n>=index){
5            ans++;
6            n-=index;
7            index++;
8        }
9        return ans;
10    }
11}