// Last updated: 8/11/2026, 8:32:44 PM
1class Solution {
2
3    public String multiply(String num1, String num2) {
4        if(num1.length() == 1 && num2.length() == 1){
5            int cnt1 = num1.charAt(0) - '0';
6            int cnt2 = num2.charAt(0) - '0';
7            int ans = cnt1 * cnt2;
8            return String.valueOf(ans);
9        }
10
11        int carry = 0;
12        int[] arr = new int[num1.length() + num2.length()];
13
14        for(int i = num2.length() - 1; i >= 0; i--){
15            char ch = num2.charAt(i);
16            int count1 = ch - '0';
17
18            for(int j = num1.length() - 1; j >= 0; j--){
19                char ch2 = num1.charAt(j);
20                int count2 = ch2 - '0';
21
22                int mul = count1 * count2;
23                int sum = arr[i + j + 1] + mul + carry;
24
25                carry = sum / 10;
26                arr[i + j + 1] = sum % 10;
27            }
28
29            arr[i] += carry;
30            carry = 0;
31        }
32
33        StringBuilder sb = new StringBuilder();
34        int index = 0;
35
36        for(int l = 0; l < arr.length; l++){
37            if(arr[l] == 0){
38                index = l;
39            } else {
40                break;
41            }
42        }
43
44        if(index == arr.length - 1){
45            return "0";
46        }
47
48        if(arr[index] == 0){
49            index++;
50        }
51
52        for(int k = index; k < arr.length; k++){
53            sb.append(arr[k]);
54        }
55
56        return sb.toString();
57    }
58}