import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new LinkedList<>();
        if (nums == null || nums.length < 4) return ans;

        Arrays.sort(nums);
        int len = nums.length - 3;

        for (int i = 0; i < len; i ++) {

            if (i > 0 && nums[i] == nums[i-1]) continue;

            for (int j = nums.length-1; j > i+1; j --) {

                int L = i+1;
                int R = j-1;
                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R] + nums[j];
                    if (sum == target) {
                        List<Integer> list = Arrays.asList(nums[i], nums[L], nums[R], nums[j]);
                        if (!ans.contains(list))
                            ans.add(list);

                        while (L < R && nums[R] == nums[R-1]) R--;
                        while (L < R && nums[L] == nums[L+1]) L++;
                        L++;
                        R--;
                    }
                    else if (sum < target) L++;
                    else R--;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        (new Solution()).threeSum(nums);

    }
}
