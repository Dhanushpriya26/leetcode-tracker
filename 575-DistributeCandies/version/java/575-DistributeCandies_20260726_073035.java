// Last updated: 7/26/2026, 7:30:35 AM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        Set<Integer> set = new HashSet<>();
4
5        for (var i : candyType) 
6            set.add(i);
7        
8        var n = candyType.length / 2;
9
10        if (set.size() >= n) 
11            return n;
12        else 
13            return set.size();
14    }
15}