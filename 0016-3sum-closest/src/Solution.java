import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int len = nums.length;
        if (nums == null || len < 3) return 0;
        int ans = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);

        for (int i = 0; i < len; i ++) {

            int L = i + 1;
            int R = len - 1;

            while (L < R) {
                int sum = nums[i] + nums[L] + nums[R];
                if (Math.abs(target - sum) < Math.abs(target - ans)) {
                    ans = sum;
                }

                if (sum < target)
                    L++;
                else if (sum > target)
                    R--;
                else
                    return ans;
            }
        }

        return ans;
    }
}
