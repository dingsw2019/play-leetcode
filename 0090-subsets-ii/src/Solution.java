import java.util.*;

class Solution {

    private void dfs(int[] nums, int len, int begin, Deque<Integer> path, List<List<Integer>> res) {

        if (begin == len)
            return;

        for (int i = begin; i < len; i ++) {

            if (i > begin && nums[i] == nums[i-1])
                continue;

            path.addLast(nums[i]);
            res.add(new ArrayList<>(path));

            dfs(nums,len,i+1,path,res);

            path.removeLast();
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0)
            return res;

        Arrays.sort(nums);

        dfs(nums,len,0, new ArrayDeque<>(), res);
        res.add(new ArrayList<Integer>());
        return res;
    }
}
