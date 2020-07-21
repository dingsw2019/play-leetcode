/**
 * 209. 长度最小的子数组
 * https://leetcode-cn.com/problems/minimum-size-subarray-sum/
 * 滑动窗口
 */
public class Solution2 {

    public int minSubArrayLen(int s, int[] nums) {

        int n = nums.length;
        if (n == 0)
            return 0;

        int l = 0, r = 0;
        int sum = 0;
        int len = n+1;
        while (l < n) {

            sum += nums[r];
            while (sum >= s) {
                len = Math.min(len,r-l+1);
                sum -= nums[l++];
            }
            r++;
        }

        return len == n+1 ? 0 : len;
    }

    public static void main(String[] args) {

        int s = 7;
        int[] nums = {2,3,1,2,4,3};
        int len = (new Solution1()).minSubArrayLen(s,nums);
        System.out.println("len = " + len);
    }
}