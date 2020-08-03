import java.util.List;

public class Repeat {

    public int minimumTotal(List<List<Integer>> triangle) {


        int m = triangle.size();
        int[][] dp = new int[m+1][m+1];

        for (int i = m-1; i >= 0; i --) {

            int n = triangle.get(i).size();
            for (int j = 0; j < n; j ++) {

                dp[i][j] = Math.min(dp[i+1][j],dp[i+1][j+1]) + triangle.get(i).get(j);
            }
        }

        return dp[0][0];
    }
}
