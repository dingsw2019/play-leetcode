class Solution {

    public int wiggleMaxLength(int[] nums) {

        int len = nums.length;
        int up = 1, down = 1;

        for (int i = 1; i < len; i ++) {
            if (nums[i] > nums[i-1])
                up = down + 1;
            else if (nums[i] < nums[i-1])
                down = up + 1;
        }

        return nums.length == 0 ? 0 : Math.max(up,down);
    }
}