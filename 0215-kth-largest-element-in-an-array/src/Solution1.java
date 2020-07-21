public class Solution1 {

    public int findKthLargest(int[] nums, int k) {

        return findKthLargest(nums,0,nums.length-1, nums.length - k);
    }

    private int findKthLargest(int[] nums, int l, int r, int k) {

        if (l == r)
            return nums[l];

        int p = partition(nums,l,r);

        if (p == k)
            return nums[p];
        else if (k < p)
            return findKthLargest(nums,l,p-1,k);
        else
            return findKthLargest(nums,p+1,r,k);
    }

    private int partition(int[] nums, int l, int r){
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

    private void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
//        int[] nums = {3,2,1,5,6,4};
//        int n = (new Solution1()).findKthLargest(nums,2);
//        System.out.println("n = " + n);

        int[] nums = {3,2,3,1,2,4,5,5,6};
        int n = (new Solution1()).findKthLargest(nums,4);
        System.out.println("n = " + n);
    }
}
