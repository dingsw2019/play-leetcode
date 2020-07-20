class Solution2 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n <= 0)
            return;


        int point1 = m-1;
        int point2 = n-1;

        for (int i = m+n-1; i >= 0; i --) {

            if (point1 >= 0 && point2 >= 0 && nums1[point1] > nums2[point2])
                nums1[i] = nums1[point1--];
            else if (point2 >= 0)
                nums1[i] = nums2[point2--];
            else
                nums1[i] = nums1[point1--];
        }

    }
}