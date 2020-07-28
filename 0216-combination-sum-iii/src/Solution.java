import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {

    private void dfs(int k, int residue, int begin, Deque<Integer> path, List<List<Integer>> res) {

        if (residue < 0)
            return;

        if (k == 0) {
            if (residue == 0)
                res.add(new ArrayList<>(path));
            return;
        }

        for (int i = begin; i <= 9; i ++) {

            path.addLast(i);
            dfs(k-1,residue-i,i+1,path,res);
            path.removeLast();
        }
    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> res = new ArrayList<>();
        dfs(k,n,1,new ArrayDeque<>(),res);
        return res;
    }
}