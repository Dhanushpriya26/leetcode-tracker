// Last updated: 9/1/2026, 9:08:17 AM
1class Solution {
2    public int minMoves(String[] classroom, int energy) {
3        int m = classroom.length;
4        int n = classroom[0].length();
5        int sr = -1, sc = -1;
6        int cnt = 0;
7        int[][] id = new int[m][n];
8        for(int[] row : id) Arrays.fill(row, -1);
9        for(int i = 0; i < m; i++){
10            for(int j = 0; j < n; j++){
11                if(classroom[i].charAt(j) == 'S'){
12                    sr = i;
13                    sc = j;
14                }
15                if(classroom[i].charAt(j) == 'L'){
16                    id[i][j] = cnt++;
17                }
18            }
19        }
20        int masks = 1 << cnt;
21        int fullMask = masks - 1;
22        int[][][] best = new int[m][n][masks];
23        for(int[][] layer : best)
24            for(int[] row : layer)
25                Arrays.fill(row, -1);
26        class State {
27            int r, c, mask, en, dist;
28            State(int r, int c, int mask, int en, int dist){
29                this.r = r;
30                this.c = c;
31                this.mask = mask;
32                this.en = en;
33                this.dist = dist;
34            }
35        }
36        Queue<State> q = new LinkedList<>();
37        q.add(new State(sr, sc, 0, energy, 0));
38        best[sr][sc][0] = energy;
39        int[] dr = {-1, 1, 0, 0};
40        int[] dc = {0, 0, -1, 1};
41        while(!q.isEmpty()){
42            State cur = q.poll();
43            int r = cur.r;
44            int c = cur.c;
45            int mask = cur.mask;
46            int en = cur.en;
47            int dist = cur.dist;
48            if(mask == fullMask){
49                return dist;
50            }
51            if(en == 0){
52                continue;
53            }
54            for(int d = 0; d < 4; d++){
55                int nr = r + dr[d];
56                int nc = c + dc[d];
57                if(nr < 0 || nr >= m || nc < 0 || nc >= n){
58                    continue;
59                }
60                if(classroom[nr].charAt(nc) == 'X'){
61                    continue;
62                }
63                int newEn = en - 1;
64                int newMask = mask;
65                if(classroom[nr].charAt(nc) == 'L'){
66                    newMask |= (1 << id[nr][nc]);
67                }
68                if(classroom[nr].charAt(nc) == 'R'){
69                    newEn = energy;
70                }
71                if(best[nr][nc][newMask] >= newEn){
72                    continue;
73                }
74                best[nr][nc][newMask] = newEn;
75                q.add(new State(nr, nc, newMask, newEn, dist + 1));
76            }
77        }
78        return -1;
79    }
80}