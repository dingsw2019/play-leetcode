import java.util.*;

class Solution1 {
    public int removeElement(int[] nums, int val) {

        int newl = 0;
        for (int i = 0; i < nums.length; i ++)
            if (nums[i] != val)
                nums[newl++] = nums[i];

        return newl;
    }

    private static void printArr(int[] arr){
        for(int i = 0 ; i < arr.length ; i ++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){

        int[] arr = {7, 5, 3, 2,1, 2, 3};
        int remain = (new Solution1()).removeElement(arr,3);
        System.out.println("remian:" + remain);
        printArr(arr);
    }
}