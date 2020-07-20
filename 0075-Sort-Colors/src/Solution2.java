// 三路快排
public class Solution2 {
    // [0,zero] 是 0
    // [zero+1,two-1] 是 1
    // [two,n-1] 是 2
    public void sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;

        for (int i = 0; i < two; ) {
            if (nums[i] == 1)
                i++;
            else if (nums[i] > 1)
                swap(nums,--two,i);
            else //nums[i] < 0
                swap(nums,++zero,i++);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        (new Solution2()).sortColors(nums);
        for (int i = 0; i < nums.length; i ++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}
