// Last updated: 9/24/2026, 10:02:08 PM
1class Solution {
2    
3    public static void countSort (int[] arr, int col) {
4        int[] counts = new int[10];
5
6        int powVal = (int) Math.pow(10, col-1);
7
8        for(int i=0; i<arr.length; i++){
9            int idx = (arr[i]/powVal) % 10;
10            counts[idx] += 1;
11        }
12
13        int startIndex=0;
14
15        for(int i=0; i<counts.length; i++){
16            int curr = counts[i];
17            counts[i] = startIndex;
18            startIndex += curr;
19        }
20
21        int[] sortedArr = new int[arr.length];
22
23        for(int i=0; i<sortedArr.length; i++){
24            int idx = (arr[i]/powVal) % 10;
25            sortedArr[counts[idx]] = arr[i];
26            counts[idx] += 1;
27        }
28
29        for(int i=0; i<sortedArr.length; i++){
30            arr[i] = sortedArr[i];
31        }
32    }
33
34    public int maximumGap(int[] nums) {
35        if(nums == null || nums.length < 2) return 0; 
36
37        int[] arr = nums;
38        int max = arr[0];
39
40        for(int i=1; i<arr.length; i++){
41            max = Math.max(max, arr[i]);
42        }
43
44        int len = 0;
45        int temp = max;
46
47        while(temp != 0){
48            temp = temp / 10;
49            len += 1;
50        }
51        
52        if(len == 0) len = 1;
53
54        for(int i=1; i<=len; i++){
55            countSort(arr, i);
56        }
57
58        int maxG = Integer.MIN_VALUE;
59
60        for(int i=1; i<arr.length; i++){
61            maxG = Math.max(maxG, arr[i] - arr[i-1]);
62        }
63        return maxG;
64    }
65}