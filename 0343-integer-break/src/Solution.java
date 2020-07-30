class Solution {

    Integer[] memo;

    public int integerBreak(int n) {
        memo = new Integer[n+1];
        return dfs(n);
    }

    private int max3(int a, int b, int c) {
        return Math.max(a,Math.max(b,c));
    }

    private int dfs(int n) {

        if (n == 1)
            return 1;

        if (memo[n] != null)
            return memo[n];

        int res = -1;
        for (int i = 1; i <= n - 1; i ++) {
            res = max3(res, i*(n-i), i*dfs(n-i));
        }
        memo[n] = res;

        return res;
    }

    // 动态规划
    public int integerBreak2(int n) {

        int[] dp = new int[n+1];

        for (int i = 2; i <= n; i ++) {
            int curMax = 0;
            for (int j = 1; j < i; j ++) {
                curMax = max3(curMax,j*(i-j), j*dp[i-j]);
            }
            dp[i] = curMax;
        }

        return dp[n];
    }
}