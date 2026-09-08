// Last updated: 9/8/2026, 9:00:34 AM
1class Solution {
2public int countCommas(int n) {
3int count = 0;
4for (int i = 1; i <= n; i++) {
5if (i >= 1000) {
6count++;
7}
8}
9return count;
10}
11}