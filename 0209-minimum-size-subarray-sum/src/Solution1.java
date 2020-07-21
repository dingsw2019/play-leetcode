/**
 * 209. 长度最小的子数组
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 * 暴力解
 */
public class Solution1 {
    public int minSubArrayLen(int s, int[] nums) {

        int n = nums.length;
        int len = Integer.MAX_VALUE;
        for (int i = 0; i < n; i ++) {
            int sum = nums[i];
            int j = i+1;
            for (; j < n; j ++) {
                sum += nums[j];
                if (sum >= s)
                    break;
            }

            len = Math.min(len,j-i+1);
        }

        return len;
    }

    public static void main(String[] args) {

        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        int len = (new Solution1()).minSubArrayLen(s,nums);
        System.out.println("len = " + len);
    }
}
