import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {

    private void dfs(int[] nums, int len, int begin, boolean[] used, Deque<Integer> path, List<List<Integer>> res) {

        res.add(new ArrayList<>(path));

        for (int i = begin; i < len; i ++) {
            if (used[i])
                continue;

            used[i] = true;
            path.addLast(nums[i]);

            dfs(nums,len,i,used,path,res);

            used[i] = false;
            path.removeLast();
        }
    }

    public List<List<Integer>> subsets(int[] nums) {

        int len = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0)
            return res;

        dfs(nums,len,0,new boolean[len], new ArrayDeque<>(), res);
        return res;
    }
}