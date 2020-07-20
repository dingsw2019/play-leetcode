// 计数排序
class Solution1 {
    public void sortColors(int[] nums) {
        int[] count = {0,0,0};
        for (int i = 0; i < nums.length; i ++) {
            assert (nums[i] >= 0 && nums[i] <= 2);
            count[nums[i]]++;
        }

        // 数组重置
        int index = 0;
        for (int i = 0; i < count[0]; i ++)
            nums[index++] = 0;
        for (int i = 0; i < count[1]; i ++)
            nums[index++] = 1;
        for (int i = 0; i < count[2]; i ++)
            nums[index++] = 2;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        (new Solution1()).sortColors(nums);
        for (int i = 0; i < nums.length; i ++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}
