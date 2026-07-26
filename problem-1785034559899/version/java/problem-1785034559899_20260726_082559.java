// Last updated: 7/26/2026, 8:25:59 AM
1class Solution {
2    public int largestInteger(int n, int s) {
3        if(s==0) 
4            return 0;
5        if(s>9*n)
6            return -1;
7        StringBuilder ans=new StringBuilder();
8        while(n>0){
9            int digit=Math.min(9,s);
10            ans.append(digit);
11            s-=digit;
12            n--;
13        }
14        return Integer.parseInt(ans.toString());
15    }
16}