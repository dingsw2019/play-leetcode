import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {

        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0)
            return res;

        Arrays.sort(candidates);

        dfs(candidates,len,target,0,new ArrayDeque<>(),res);
        return res;
    }

    private void dfs(int[] candidates, int len, int residue, int begin, Deque<Integer> path, List<List<Integer>> res){
        if (residue == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; i ++) {
            if (residue - candidates[i] < 0)
                break;

            if (i > begin && candidates[i] == candidates[i-1])
                continue;

            path.addLast(candidates[i]);
            dfs(candidates,len,residue - candidates[i], i+1, path, res);
            path.removeLast();
        }
    }
}