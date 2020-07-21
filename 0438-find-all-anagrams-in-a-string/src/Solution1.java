/**
 * 438. 找到字符串中所有字母异位词
 * https://leetcode-cn.com/problems/find-all-anagrams-in-a-string/
 */
import java.util.ArrayList;
import java.util.List;
public class Solution1 {

    public List<Integer> findAnagrams(String s, String p) {

        // 转成数组
        char[] arrS = s.toCharArray();
        char[] arrP = p.toCharArray();

        List<Integer> ans = new ArrayList<>();

        // arrP中包含元素
        int[] needs = new int[26];
        // 滑动窗口包含元素
        int[] window = new int[26];

        // 统计每个要匹配元素的数量
        for (int i = 0; i < arrP.length; i ++)
            needs[arrP[i] - 'a'] += 1;

        int left = 0, right = 0;
        while (right < arrS.length) {
            int curR = arrS[right++] - 'a';

            window[curR] += 1;

            // 不包含元素或超出数量
            while (window[curR] > needs[curR]) {
                int curL = arrS[left++] - 'a';
                window[curL] -= 1;
            }

            // 满足 arrP
            if (right-left == arrP.length)
                ans.add(left);
        }

        return ans;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> res;
        res = (new Solution1()).findAnagrams(s,p);
        for (int i = 0; i < res.size(); i ++)
            System.out.print(res.get(i) + " ");

        System.out.println();
    }
}
