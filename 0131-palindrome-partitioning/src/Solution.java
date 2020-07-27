import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {
    public List<List<String>> partition(String s) {

        int len = s.length();
        Deque<String> path = new ArrayDeque<>();
        List<List<String>> res = new ArrayList<>();
        if (len == 0)
            return res;

        backtracking(s,0,len,path,res);
        return res;
    }

    private void backtracking(String s, int start, int len, Deque<String> path, List<List<String>> res) {
        if (start == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < len; i ++) {

            // 不是回文串
            if (!checkPalindrome(s,start,i))
                continue;

            path.addLast(s.substring(start,i+1));
            backtracking(s,i+1,len,path,res);
            path.removeLast();
        }
    }

    private boolean checkPalindrome(String str, int left, int right) {

        while (left < right) {

            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}