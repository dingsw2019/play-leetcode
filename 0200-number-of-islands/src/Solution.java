class Solution {

    private int[][] direction = {{-1,0}, {0,-1}, {0,1}, {1,0}};
    private boolean[][] marked;
    private int m;
    private int n;

    private char[][] grid;

    public int numIslands(char[][] grid) {

        m = grid.length;
        if (m == 0) return 0;
        n = grid[0].length;
        this.grid = grid;
        marked = new boolean[m][n];
        int res = 0;

        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (grid[i][j] == '1' && !marked[i][j]) {
                    res ++;
                    dfs(i,j);
                }
            }
        }

        return res;
    }

    private void dfs(int i, int j) {

        marked[i][j] = true;

        for (int k = 0; k < 4; k ++) {
            int newX = i + direction[k][0];
            int newY = j + direction[k][1];

            if (inArea(newX,newY) && !marked[newX][newY] && grid[newX][newY] == '1')
                dfs(newX,newY);
        }

    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}