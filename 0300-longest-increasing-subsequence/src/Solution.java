import java.util.Arrays;

class Solution {

    public int lengthOfLIS(int[] nums) {

        int len = nums.length;
        if (len < 2)
            return len;

        int[] dp = new int[len];
        Arrays.fill(dp,1);

        for (int i = 1; i < len; i ++) {
            for (int j = 0; j < i; j ++) {
                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[i], 1 + dp[j]);
            }
        }

        int res = 0;
        for (int i = 0; i < len; i ++)
            res = Math.max(res,dp[i]);

        return res;
    }
}