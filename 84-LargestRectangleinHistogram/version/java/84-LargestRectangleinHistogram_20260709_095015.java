// Last updated: 7/9/2026, 9:50:15 AM
1class Solution {
2    public int largestRectangleArea(int[] heights) {
3        int n = heights.length;
4        int[] left = new int[n];
5        int[] right = new int[n];
6        Stack<Integer> stack = new Stack<>();
7        for (int i = 0; i < n; i++) {
8            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
9            left[i] = stack.isEmpty() ? -1 : stack.peek();
10            stack.push(i);
11        }
12        stack.clear();
13        for (int i = n - 1; i >= 0; i--) {
14            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) stack.pop();
15            right[i] = stack.isEmpty() ? n : stack.peek();
16            stack.push(i);
17        }
18        int maxArea = 0;
19        for (int i = 0; i < n; i++) {
20            int width = right[i] - left[i] - 1;
21            maxArea = Math.max(maxArea, heights[i] * width);
22        }
23        return maxArea;
24    }
25}