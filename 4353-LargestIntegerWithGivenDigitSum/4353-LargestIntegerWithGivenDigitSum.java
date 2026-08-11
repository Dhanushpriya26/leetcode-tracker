// Last updated: 8/11/2026, 8:31:56 PM
class Solution {
    public int largestInteger(int n, int s) {
        if(s==0) 
            return 0;
        if(s>9*n)
            return -1;
        StringBuilder ans=new StringBuilder();
        while(n>0){
            int digit=Math.min(9,s);
            ans.append(digit);
            s-=digit;
            n--;
        }
        return Integer.parseInt(ans.toString());
    }
}