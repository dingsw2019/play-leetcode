// 快排实现
public class Solution10 {

    public int partition(int[] nums,int l, int r){
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

    public void sort(int[] nums,int l,int r) {
        if (l >= r)
            return;

        int p = partition(nums,l,r);

        sort(nums,l,p-1);
        sort(nums,p+1,r);
    }

    private void swap(int[] nums, int i , int j ){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        (new Solution10()).sort(nums,0,nums.length-1);
        for (int i = 0; i < nums.length; i ++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}
