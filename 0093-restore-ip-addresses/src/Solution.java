import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {

    public List<String> restoreIpAddresses(String s) {

        int len = s.length();
        List<String> res = new ArrayList<>();
        if (len < 4 || len > 12)
            return res;

        Deque<String> path = new ArrayDeque<>(4);
        dfs(s,len,0,0,path,res);
        return res;
    }

    // 判断字符串s在[left,right]区间内的数值, 是否满足ip的数值要求
    private int judgeIfIpSegment(String s, int left, int right){

        int len = right-left+1;

        if (len > 1 && s.charAt(left) == '0')
            return -1;

        // 转成整型
        int res = 0;
        for (int i = left; i <= right; i ++)
            res = (res * 10) + (s.charAt(i) - '0');

        if (res > 255)
            return -1;

        return res;
    }

    private void dfs(String s, int len, int split, int begin, Deque<String> path, List<String> res) {
        if (begin == len) {
            if (split == 4)
                res.add(String.join(".",path));

            return;
        }

        // 剩下的数字不够分或分不完
        if (len - begin < (4 - split) || len - begin > 3*(4-split))
            return;

        // 继续拆分
        for (int i = 0; i < 3; i ++) {
            if (begin + i >= len)
                break;

            int ipSegment = judgeIfIpSegment(s,begin,begin+i);
            if (ipSegment != -1) {
                path.addLast(ipSegment + "");
                dfs(s,len,split+1,begin+i+1,path,res);
                path.removeLast();
            }
        }
    }
}