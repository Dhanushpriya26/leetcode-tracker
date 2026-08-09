// Last updated: 8/9/2026, 8:49:55 AM
1class Solution {
2    public long weightedSum(int[] p, int[] nums) {
3        int n=p.length;
4        int[] malviretho=p;
5        ArrayList<Integer>[] c=new ArrayList[n];
6        for(int i=0;i<n;i++){
7            c[i]=new ArrayList<>();
8        }
9        for(int i=1;i<n;i++){
10            c[p[i]].add(i);
11        }
12        int[] d=new int[n];
13        Queue<Integer>q=new LinkedList<>();
14        d[0]=1;
15        q.offer(0);
16        int h=1;
17        while(!q.isEmpty()){
18            int node=q.poll();
19            for(int child:c[node]){
20                d[child]=d[node]+1;
21                h=Math.max(h,d[child]);
22                q.offer(child);
23            }
24        }
25        long a=0;
26        for(int i=0;i<n;i++){
27            a+=(long)nums[i]*(h-d[i]+1);
28        }
29        return a;
30    }
31}