import java.util.List;

class Solution {

    Integer[][] memo;

    public int minimumTotal(List<List<Integer>> triangle) {
        memo = new Integer[triangle.size()][triangle.size()];
        return dfs(triangle,0,0);
    }

    public int dfs(List<List<Integer>> triangle, int i, int j) {

        if (i == triangle.size())
            return 0;

        if (memo[i][j] == null)
            memo[i][j] = Math.min(dfs(triangle,i+1,j), dfs(triangle,i+1,j+1)) + triangle.get(i).get(j);

        return memo[i][j];
    }

    // 动态规划
    public int minimumTotal2(List<List<Integer>> triangle) {

        int n = triangle.size();
        int[][] dp = new int[n+1][n+1];

        for (int i = n-1; i >= 0; i --) {

            for (int j = 0; j <= i; j ++) {

                dp[i][j] = Math.min(dp[i+1][j], dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }

        return dp[0][0];
    }
}