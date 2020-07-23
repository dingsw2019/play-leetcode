import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int numberOfBoomerangs(int[][] points) {

        int ans = 0;
        for (int i = 0; i < points.length; i ++) {
            Map<Integer,Integer> map = new HashMap<>();

            for (int j = 0; j < points.length; j ++) {
                if (i != j) {
                    int dis = distance(points[i],points[j]);
                    map.put(dis,map.getOrDefault(dis,0)+1);
                }
            }

            for (int dis : map.keySet()) {
                ans += map.get(dis) * (map.get(dis)-1);
            }
        }

        return ans;
    }

    private int distance(int[] a, int[] b) {
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}
