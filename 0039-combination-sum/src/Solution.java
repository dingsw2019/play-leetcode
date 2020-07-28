import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int len = candidates.length;
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0)
            return res;

        Arrays.sort(candidates);

        dfs(candidates,len,target,0, new ArrayDeque<>(),res);
        return res;
    }

    /**
     *
     * @param candidates 原始数据
     * @param len        原始数据长度
     * @param residue    剩余数值
     * @param begin      开始索引, 避免重复
     * @param path       单次满足条件的所有元素值
     * @param res        保存全部满足条件的元素值
     */
    private void dfs(int[] candidates, int len, int residue, int begin, Deque<Integer> path, List<List<Integer>> res) {

        if (residue == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i < len; i ++) {

            // 剪枝
            if (residue - candidates[i] < 0)
                break;

            path.addLast(candidates[i]);

            dfs(candidates,len,residue-candidates[i],i,path,res);
            path.removeLast();
        }
    }
}