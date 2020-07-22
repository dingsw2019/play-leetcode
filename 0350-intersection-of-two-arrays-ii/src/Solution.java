import java.util.ArrayList;
import java.util.TreeMap;

public class Solution {

    public int[] intersect(int[] nums1, int[] nums2) {

        TreeMap<Integer,Integer> map1 = new TreeMap<>();
        for (int num : nums1) {
            if (!map1.containsKey(num))
                map1.put(num,1);
            else
                map1.put(num,map1.get(num)+1);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums2) {
            if (map1.containsKey(num)) {
                list.add(num);
                map1.put(num,map1.get(num)-1);
                if (map1.get(num) == 0)
                    map1.remove(num);
            }
        }

        int[] res = new int[list.size()];
        int index = 0;
        for (int num : list)
            res[index++] = num;

        return res;
    }

    private static void printArr(int[] arr){
        for(int e: arr)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void main(String[] args) {

//        int[] nums1 = {1, 2, 2, 1};
//        int[] nums2 = {2, 2};
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] res = (new Solution()).intersect(nums1, nums2);
        printArr(res);
    }
}
