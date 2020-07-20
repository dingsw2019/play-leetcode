class Solution1 {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[k] != nums[i])
                nums[++k] = nums[i];
        }

        return k+1;
    }

    public static void main(String[] args) {
//        int[] nums = {1,1,2};
//        int n = (new Solution1()).removeDuplicates(nums);
//        System.out.println("n = " + n);

        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = (new Solution1()).removeDuplicates(nums);
        System.out.println("n = " + n);
    }
}