import java.util.Arrays;

class Repeat {

    public int lengthOfLIS(int[] nums) {

        int len = nums.length;
        int[] dp = new int[len];

        Arrays.fill(dp,1);

        for (int i = 1; i < len; i ++) {

            for (int j = 0; j < i; j ++) {

                if (nums[j] < nums[i])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }

        int max = 0;
        for (int i = 0; i < len; i ++)
            max = Math.max(max,dp[i]);

        return max;
    }
}