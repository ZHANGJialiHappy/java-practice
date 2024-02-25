import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKElement {
    public static int[] solution(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> frequentMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            // int value = 1;
            // if (frequentMap.containsKey(key)) {
            // value++;
            // }
            // frequentMap.put(key, value);
            frequentMap.merge(key, 1, Integer::sum);
            // frequentMap.merge(key, 1, (oldevalue, newvalue) -> oldevalue + newvalue);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequentMap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i).getKey();
        }
        return ans;
    }

    public static int[] solution2(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> frequentMap = new HashMap<>();
        for (int num : nums) {
            frequentMap.put(num, frequentMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> frequentMap.get(b) - frequentMap.get(a));
        for (int num : frequentMap.keySet()) {
            pq.offer(num);
        }
        System.out.println(pq);

        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll();
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(solution2(a, 2)));
    }
}
