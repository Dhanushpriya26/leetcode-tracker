// Last updated: 7/24/2026, 9:40:47 AM
1public class Solution {
2    public boolean isMatch(String s, String p) {
3        boolean[][] match=new boolean[s.length()+1][p.length()+1];
4        match[s.length()][p.length()]=true;
5        for(int i=p.length()-1;i>=0;i--){
6            if(p.charAt(i)!='*')
7                break;
8            else
9                match[s.length()][i]=true;
10        }
11        for(int i=s.length()-1;i>=0;i--){
12            for(int j=p.length()-1;j>=0;j--){
13                if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')
14                        match[i][j]=match[i+1][j+1];
15                else if(p.charAt(j)=='*')
16                        match[i][j]=match[i+1][j]||match[i][j+1];
17                else
18                    match[i][j]=false;
19            }
20        }
21        return match[0][0];
22    }
23}