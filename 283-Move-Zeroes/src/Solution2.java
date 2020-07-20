public class Solution2 {

    public void moveZeroes(int[] nums) {
        // 非0值前移, k指向非0存放位
        int k = 0;
        for (int i = 0; i < nums.length; i ++)
            if (nums[i] != 0)
                nums[k++] = nums[i];

        // 将 0 填充到剩下的位置
        for (int i = k; i < nums.length; i ++)
            nums[i] = 0;
    }

    private static void printArr(int[] arr){
        for (int i = 0; i < arr.length; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        (new Solution1()).moveZeroes(arr);
        printArr(arr);
    }

}
