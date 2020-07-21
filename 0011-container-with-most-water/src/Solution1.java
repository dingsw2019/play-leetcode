/**
 * 11. 盛最多水的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class Solution1 {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int area = 0;
        while (l < r) {
            int h = Math.min(height[l],height[r]);
            int w = r - l;
            area = Math.max(area,h*w);

            if (height[l] < height[r])
                l++;
            else
                r--;
        }

        return area;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int area = (new Solution1()).maxArea(height);
        System.out.println("max area : " + area);
    }
}
