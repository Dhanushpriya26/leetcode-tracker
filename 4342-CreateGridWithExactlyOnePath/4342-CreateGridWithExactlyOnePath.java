// Last updated: 7/9/2026, 9:13:34 AM
class Solution {
    public String[] createGrid(int m, int n) {
        String[] grid=new String[m];
        for(int i=0;i<m;i++){
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                sb.append('#');
            }
            grid[i]=sb.toString();
        }
        StringBuilder first=new StringBuilder(grid[0]);
        first.setCharAt(0,'.');
        for(int j=1;j<n;j++){
            first.setCharAt(j,'.');
        }
        grid[0]=first.toString();
        for(int i=1;i<m;i++){
            StringBuilder row=new StringBuilder(grid[i]);
            row.setCharAt(n-1,'.');
            grid[i]=row.toString();
        }
        return grid;
    }
    
}