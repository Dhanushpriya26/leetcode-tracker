// Last updated: 7/24/2026, 9:28:39 AM
1class Solution {
2    public static String intToRoman(int num) {
3    String M[] = {"", "M", "MM", "MMM"};
4    String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
5    String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
6    String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
7    return M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10];
8}
9}