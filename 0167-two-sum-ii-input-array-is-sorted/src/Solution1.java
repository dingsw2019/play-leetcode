// 二分查找
class Solution1 {
    public int[] twoSum(int[] numbers, int target) {

        for (int i = 0; i < numbers.length; i ++) {
            int j = find(numbers,i+1,numbers.length-1,target - numbers[i]);

            if (j != -1) {
                int[] res = {i+1,j+1};
                return res;
            }
        }

        throw new IllegalStateException("The input has no solution");
    }

    // 在numbers的[l,r]内查找target
    private int find(int[] numbers, int l, int r, int target){

        while (l <= r) {
            int mid = l + (r - l)/2;

            if (numbers[mid] == target)
                return mid;
            else if (numbers[mid] > target)
                r = mid-1;
            else // numbers[index] < target
                l = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
//        int[] numbers = {2, 7, 11, 15};
//        int target = 18;
        int[] numbers = {2, 3, 4};
        int target = 6;
        int[] result;
        result = (new Solution1()).twoSum(numbers,target);

        for (int i = 0; i < result.length; i ++)
            System.out.print(result[i] + " ");
        System.out.println();
    }

}
