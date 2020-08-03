class Repeat {

    private int[] nums;

    public int rob(int[] nums) {

        int len = nums.length;
        if (len == 1) return nums[0];
        this.nums = nums;
        return Math.max(robRange(0,len-2),robRange(1,len-1));
    }

    public int robRange(int start, int end) {

        int dp_i = 0, dp_i_1 = 0, dp_i_2 = 0;

        for (int i = end; i >= start; i --) {
            dp_i = Math.max(dp_i, nums[i] + dp_i_2);
            dp_i_2 = dp_i_1;
            dp_i_1 = dp_i;
        }

        return dp_i;
    }
}