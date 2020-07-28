class Solution {

    // 是否遍历过
    private boolean[][] marked;

    //         x-1,y
    //  x,y-1   x,y   x,y+1
    //         x+1,y
    private int[][] direction = {{-1,0}, {0,-1}, {0,1}, {1,0}};


    private String word;
    private int m; // board 行数
    private int n; // board 列数
    private char[][] board;

    public boolean exist(char[][] board, String word) {

        m = board.length;
        if (m == 0) return false;
        n = board[0].length;
        marked = new boolean[m][n];
        this.word = word;
        this.board = board;

        // 遍历每一个节点, 寻找字符串的起始节点
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (dfs(i,j,0))
                    return true;
            }
        }

        return false;
    }

    /**
     *
     * @param i 二维平面的x轴索引
     * @param j 二维平面的y轴索引
     * @param start 字符串的索引
     * @return
     */
    private boolean dfs(int i, int j, int start) {

        // 最后一个, 不用上下左右移动了
        if (start == word.length() - 1)
            return board[i][j] == word.charAt(start);

        // 找到当前查找字母, 进行下一次比对
        if (board[i][j] == word.charAt(start)) {
            // 当前节点查找过
            marked[i][j] = true;

            for (int k = 0; k < 4; k ++) {
                int newX = i + direction[k][0];
                int newY = j + direction[k][1];

                // 新坐标没越界, 没遍历过
                if (inArea(newX,newY) && !marked[newX][newY]) {
                    if (dfs(newX,newY,start+1))
                        return true;
                }
            }

            // 释放标记
            marked[i][j] = false;
        }

        return false;
    }

    // 判断x, y 是否越界
    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

}