class Solution1 {

    public int removeDuplicates(int[] nums) {

        int i = 0; // 赋值偏移量
        int j = 0; // 区间起始位置
        while (j < nums.length) {

            // 下一个不同数的位置
            int k = nextIndex(nums,j);
            // 最多取2个
            int len = Math.min(2,k-j);

            // 赋值
            for (int ii = 0; ii < len; ii ++)
                nums[i+ii] = nums[j];

            i += len;
            j = k;
        }

        return i;
    }

    public int nextIndex(int[] nums, int index){
        for (int i = index+1; i < nums.length; i ++)
            if (nums[i] != nums[index])
                return i;
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
//        int[] nums = {1,1,1,2,2,3};
//        int[] nums = {0,0,1,1,1,1,2,3,3};
        int n = (new Solution1()).removeDuplicates(nums);
        System.out.println("n = " + n);

        for (int i = 0; i < n; i ++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}