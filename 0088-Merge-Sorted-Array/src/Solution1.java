import java.util.Arrays;

// 归并排序
// https://leetcode-cn.com/problems/merge-sorted-array/
class Solution1 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n <= 0)
            return;

        int[] result = new int[m+n];

        int point1 = 0;
        int point2 = 0;

        for (int i = 0; i < m+n; i ++) {

            if (point1 < m && point2 < n && nums1[point1] < nums2[point2])
                result[i] = nums1[point1++];
            else if (point2 < n)
                result[i] = nums2[point2++];
            else
                result[i] = nums1[point1++];
        }

        System.arraycopy(result,0,nums1,0,nums1.length);
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        merge(num1, 3, num2, 3);
    }
}