// Last updated: 9/24/2026, 9:16:54 PM
1class Solution {
2    public List<List<String>> partition(String s) {
3        List<List<String>> result= new ArrayList<>();
4        List<List<String>> ans= new ArrayList<>();
5        generate(s, 0, new ArrayList<>(), result);
6        for (List<String> a : result) {
7            boolean valid= true;
8            for (String str : a) {
9                if(!isPalindrome(str)){
10                    valid= false;
11                    break;
12                }
13            }
14            if(valid){
15                ans.add(a);
16            }
17        }
18        return ans;
19    }
20    static void generate(String s, int index, List<String> current, List<List<String>> result) {
21        if (index == s.length()) {
22            result.add(new ArrayList<>(current));
23            return;
24        }
25        for (int i = index + 1; i <= s.length(); i++) {
26            String part = s.substring(index, i);
27            current.add(part);
28            generate(s, i, current, result);
29            current.remove(current.size() - 1);
30        }
31    }
32    static boolean isPalindrome(String s) {
33        int left = 0;
34        int right = s.length() - 1;
35        while (left < right) {
36            if (s.charAt(left) != s.charAt(right)) {
37                return false;
38            }
39            left++;
40            right--;
41        }
42        return true;
43    }
44}