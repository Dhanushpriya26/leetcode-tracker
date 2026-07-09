// Last updated: 7/9/2026, 9:31:59 AM
1class Solution {
2    public char nextGreatestLetter(char[] letters, char target) {
3        int l=0;
4        int r=letters.length-1;
5         char ch=letters[0];
6         while(l<=r){
7            int mid=l+(r-l)/2;
8            if(letters[mid]>target)
9             {
10                ch=letters[mid];
11                r=mid-1;
12             }
13             else if(letters[mid]<=target)
14              l=mid+1;
15         }
16         return ch;
17    }
18}