// Last updated: 7/9/2026, 9:34:29 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int r=letters.length-1;
         char ch=letters[0];
         while(l<=r){
            int mid=l+(r-l)/2;
            if(letters[mid]>target)
             {
                ch=letters[mid];
                r=mid-1;
             }
             else if(letters[mid]<=target)
              l=mid+1;
         }
         return ch;
    }
}