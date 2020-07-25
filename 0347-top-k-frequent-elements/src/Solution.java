import java.util.*;

public class Solution {

    public int[] topKFrequent(int[] nums, int k) {

        // 统计频率
        HashMap<Integer,Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.put(n,freq.getOrDefault(n,0)+1);

        // 构建最小堆
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((n1,n2) -> freq.get(n1) - freq.get(n2));
        for (Integer key : freq.keySet()) {

            if (pq.size() < k) {
                pq.add(key);
            } else if (freq.get(key) > freq.get(pq.peek())) {
                pq.remove();
                pq.add(key);
            }
        }

        List<Integer> top = new LinkedList<Integer>();
        while(!pq.isEmpty()) {
            top.add(pq.poll());
        }
        Collections.reverse(top);
        int[] topK = new int[top.size()];
        for(int i=0; i<topK.length;i++) {
            topK[i] = top.get(i);
        }
        return topK;
    }
}
