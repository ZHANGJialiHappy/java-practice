import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKWords {
    public static List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>(Collections.nCopies(k, null));
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }

        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String word1, String word2) {
                int frequency1 = map.get(word1);
                int frequency2 = map.get(word2);

                if (frequency1 == frequency2) {
                    return word2.compareTo(word1);
                }
                return frequency1 - frequency2;
            }
        });

        for (String w : map.keySet()) {
            pq.offer(w);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        for (int i = k - 1; i >= 0; i--) {
            ans.set(i, pq.poll());
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
        System.out.println(topKFrequent(words, 2));

    }
}
