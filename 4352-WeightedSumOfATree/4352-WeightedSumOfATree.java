// Last updated: 8/11/2026, 8:31:58 PM
class Solution {
    public long weightedSum(int[] p, int[] nums) {
        int n=p.length;
        int[] malviretho=p;
        ArrayList<Integer>[] c=new ArrayList[n];
        for(int i=0;i<n;i++){
            c[i]=new ArrayList<>();
        }
        for(int i=1;i<n;i++){
            c[p[i]].add(i);
        }
        int[] d=new int[n];
        Queue<Integer>q=new LinkedList<>();
        d[0]=1;
        q.offer(0);
        int h=1;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int child:c[node]){
                d[child]=d[node]+1;
                h=Math.max(h,d[child]);
                q.offer(child);
            }
        }
        long a=0;
        for(int i=0;i<n;i++){
            a+=(long)nums[i]*(h-d[i]+1);
        }
        return a;
    }
}