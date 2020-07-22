import java.util.HashMap;

public class Solution {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i ++) {
            int n = target-nums[i];
            if (map.containsKey(n)) {
                return new int[] {map.get(n),i};
            }

            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = (new Solution()).twoSum(nums,target);
        for (int i = 0; i < res.length; i ++)
            System.out.print(res[i] + " ");

        System.out.println();
    }
}
