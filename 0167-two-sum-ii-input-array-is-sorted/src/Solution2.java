// 对撞指针
public class Solution2 {

    public int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length-1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                int[] res = {i+1,j+1};
                return res;
            }else if (numbers[i] + numbers[j] > target)
                j--;
            else
                i++;
        }

        throw new IllegalStateException("The input has no solution");
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 18;
//        int[] numbers = {2, 3, 4};
//        int target = 6;
        int[] result;
        result = (new Solution1()).twoSum(numbers,target);

        for (int i = 0; i < result.length; i ++)
            System.out.print(result[i] + " ");
        System.out.println();
    }
}
