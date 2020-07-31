class Solution {

    Integer[] memo;

    private int tryRob(int[] nums, int index) {

        if (index >= nums.length)
            return 0;

        if (memo[index] != null)
            return memo[index];

        int res = 0;
        for (int i = index; i < nums.length; i ++)
            res = Math.max(res, nums[i] + tryRob(nums,i+2));

        memo[index] = res;

        return res;
    }

    public int rob(int[] nums) {
        memo = new Integer[nums.length+1];
        return tryRob(nums,0);
    }

    // 动态规划
    public int rob2(int[] nums) {

        if (nums == null || nums.length == 0)
            return 0;

        int n = nums.length;
        if (n == 1)
            return nums[0];

        int[] dp = new int[n];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);

        for (int i = 2; i < n; i ++)
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);

        return dp[n-1];
    }

    public int rob3(int[] nums) {

        int n = nums.length;

        int dp_i = 0, dp_i_1 = 0, dp_i_2 = 0;

        for (int i = n - 1; i >= 0; i --) {
            dp_i = Math.max(dp_i, nums[i] + dp_i_2);
            dp_i_2 = dp_i_1;
            dp_i_1 = dp_i;
        }

        return dp_i;
    }
}