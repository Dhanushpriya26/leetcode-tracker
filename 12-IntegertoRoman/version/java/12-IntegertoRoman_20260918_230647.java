// Last updated: 9/18/2026, 11:06:47 PM
1class Solution {
2    public String intToRoman(int num) {
3
4        String[] M = {"", "M", "MM", "MMM"};
5        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
6        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
7        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
8
9        return M[num / 1000]
10             + C[(num % 1000) / 100]
11             + X[(num % 100) / 10]
12             + I[num % 10];
13    }
14}