class Repeat {

    public int rob(int[] nums) {

        int n = nums.length;
        int dp_i = 0, dp_i_1 = 0, dp_i_2 = 0;

        for (int i = n-1; i >= 0; i --) {
            dp_i = Math.max(dp_i,nums[i]+dp_i_2);
            dp_i_2 = dp_i_1;
            dp_i_1 = dp_i;
        }

        return dp_i;
    }
}