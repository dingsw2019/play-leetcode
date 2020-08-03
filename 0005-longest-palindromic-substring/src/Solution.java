class Solution {

    public String longestPalindrome(String s) {

        int len = s.length();
        int max = 0;
        String ans = "";
        for (int i = 0; i < len; i ++) {

            for (int j = i+1; j <= len; j ++) {

                String part = s.substring(i,j);

                if (isPalindrome(part) && part.length() > max) {

                    max = Math.max(max,part.length());
                    ans = s.substring(i,j);
                }
            }
        }

        return ans;
    }

    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length()-1;
        while (i < j) {

            if (s.charAt(i) != s.charAt(j))
                return false;

            i ++;
            j --;
        }

        return true;
    }

    // 动态规划
    public String longestPalindrome2(String s) {

        int len = s.length();
        int maxLen = 0;
        int begin = 0;

        boolean[][] dp = new boolean[len][len];
        char[] charArray = s.toCharArray();

        // 对角线都是true
        for (int i = 0; i < len; i ++)
            dp[i][i] = true;

        // 一列一列填充
        for (int j = 1; j < len; j ++) {

            for (int i = 0; i < j; i ++) {

                if (charArray[i] != charArray[j])
                    dp[i][j] = false;
                else {
                    if (j - i < 3) // 小于3, 只要判断两头相等就可以了
                        dp[i][j] = true;
                    else
                        dp[i][j] = dp[i+1][j-1];
                }

                // 记录最大长度
                if (dp[i][j] && j-i+1 > maxLen) {
                    maxLen = j-i+1;
                    begin = i;
                }
            }
        }

        return s.substring(begin,begin+maxLen);
    }
}