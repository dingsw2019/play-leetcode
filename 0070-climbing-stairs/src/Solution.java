class Solution {

    public int climbStairs(int n) {

        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairs2(int n) {

        int[] memo = new int[n+1];
        memo[0] = 1;
        memo[1] = 1;

        for (int i = 2; i <= n; i ++)
            memo[i] = memo[i-1] + memo[i-2];

        return memo[n];
    }
}