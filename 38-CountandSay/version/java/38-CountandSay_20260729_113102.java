// Last updated: 7/29/2026, 11:31:02 AM
1class Solution {
2   public  String countAndSay(int n) {
3        String[] weKnow = {"1","11","21","1211","111221","312211","13112221","1113213211","31131211131221"};
4        return findRle(n,weKnow);
5    }
6    public  String findRle(int n,String[] arr ){
7        if (n <= 9){
8            return arr[n-1];
9        }
10        String str =  findRle(n-1,arr);
11        StringBuilder ans = new StringBuilder();
12        int count = 1;
13        for (int i = 1; i <= str.length(); i++) {
14            if (i < str.length() &&str.charAt(i-1) == str.charAt(i)){
15                count++;
16            }else{
17                ans.append(count);
18                ans.append(str.charAt(i-1));
19                count = 1;
20            }
21        }
22        return ans.toString();
23
24    }
25}