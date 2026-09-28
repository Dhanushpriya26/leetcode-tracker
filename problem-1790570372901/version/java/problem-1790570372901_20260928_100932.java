// Last updated: 9/28/2026, 10:09:32 AM
1class Solution {
2    public boolean isUgly(int n) {
3        if(n<=0) return false;
4        while(n>1){
5            if(n%2==0) n /=2;
6            else if(n%3==0) n /= 3;
7            else if(n%5==0) n /= 5;
8            else return false;
9        }
10        return true;
11    }
12}