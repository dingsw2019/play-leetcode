import java.util.*;

class Solution4 {

    public void moveZeroes(int[] nums) {

        int k = 0;
        for(int i = 0 ; i < nums.length ; i ++){
            if (nums[i] != 0){
                if(k != i)
                    swap(nums,k++,i);
                else
                    k++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    private static void printArr(int[] arr){
        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){

        int[] arr = {0, 1, 0, 3, 12};
        (new Solution4()).moveZeroes(arr);
        printArr(arr);
    }
}
