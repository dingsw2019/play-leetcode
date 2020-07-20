public class Solution1 {

    public int partition(int[] nums, int l, int r){
        swap(nums,l,(int)Math.random()*(r-l+1) + l);
        int v = nums[l];

        int j = l;
        for (int i = l+1; i <= r; i ++) {
            if (nums[i] < v)
                swap(nums,++j,i);
        }

        swap(nums,l,j);
        return j;
    }

    public int findKthLargest(int[] nums, int k) {

        int n = nums.length;
        int l = 0;
        int r = n-1;

        while (l <= r){

            int p = partition(nums,l,r);
            if (n-p < k)
                l = p+1;
            else if (n-p > k)
                r = p-1;
            else
                return nums[p];
        }
    }

    public void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}
