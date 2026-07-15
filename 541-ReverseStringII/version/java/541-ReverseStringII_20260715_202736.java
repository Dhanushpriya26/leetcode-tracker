// Last updated: 7/15/2026, 8:27:36 PM
1class Solution {
2    public String reverseStr(String s, int k) {
3        char[] str = s.toCharArray();
4        int n = str.length;
5        for(int i = 0 ; i <= n-1; i += 2*k){
6            if(i+k-1 <= n-1){
7                reverseK(i,i+k-1,str);
8            }else{
9				reverseK(i,n-1,str);
10            }
11        }
12        String ans = new String(str);
13        return ans;
14    }
15    public void reverseK(int i, int j, char[] str){
16        while(i < j){
17            char temp = str[i];
18            str[i] = str[j];
19            str[j] = temp;
20            i++;
21            j--;
22        }
23    }
24}