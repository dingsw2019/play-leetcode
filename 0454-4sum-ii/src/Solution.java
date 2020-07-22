import java.util.HashMap;

public class Solution {

    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {

        int ans = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < A.length; i ++) {
            for (int j = 0; j < B.length; j ++) {
                int sumAB = A[i] + B[j];
                if (map.containsKey(sumAB)) map.put(sumAB,map.get(sumAB)+1);
                else map.put(sumAB,1);
            }
        }

        for (int i = 0; i < C.length; i ++) {
            for (int j = 0; j < D.length; j ++) {
                int sumCD = -(C[i]+D[j]);
                if (map.containsKey(sumCD))
                    ans += map.get(sumCD);
            }
        }

        return ans;
    }
}
