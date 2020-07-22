import java.util.HashSet;

public class Solution1 {

    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> record = new HashSet<>();
        for (int num : nums1)
            record.add(num);

        HashSet<Integer> resultSet = new HashSet<>();
        for (int num : nums2)
            if (record.contains(num))
                resultSet.add(num);

        int[] result = new int[resultSet.size()];
        int index = 0;
        for (Integer num: resultSet)
            result[index++] = num;

        return result;
    }

    private static void printArr(int[] arr){
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        int[] res = (new Solution1()).intersection(nums1, nums2);
        printArr(res);
    }
}
