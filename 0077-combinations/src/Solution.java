import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

    private void dfs(int n, int k, int index,Stack<Integer>pre, List<List<Integer>> res) {

        if (pre.size() == k) {
            res.add(new ArrayList<>(pre));
            return;
        }

        for (int i = index; i <= n; i ++) {
            pre.push(i);
            dfs(n,k,i+1,pre,res);
            pre.pop();
        }
    }

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res = new ArrayList<>();

        dfs(n,k,1,new Stack<>(),res);
        return res;
    }
}