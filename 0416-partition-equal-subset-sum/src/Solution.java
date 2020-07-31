class Solution {

    public boolean canPartition(int[] nums) {

        int sum = 0;
        for (int n : nums) {
            assert n > 0;
            sum += n;
        }

        if (sum % 2 != 0)
            return false;

        return tryPartition(nums,nums.length-1,sum/2);
    }

    private boolean tryPartition(int[] nums, int index, int sum) {

        if (sum == 0)
            return true;

        if (index < 0 || sum < 0)
            return false;

        return tryPartition(nums,index-1,sum) ||
                tryPartition(nums,index-1,sum-nums[index]);
    }
}