import java.util.HashSet;
import java.util.Set;

public class CandyShope {
    public int solution(int[] A, int[] B) {
        return difference(A) + difference(B);

    }

    public int difference(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        if (set.size() > array.length / 2) {
            return array.length / 2;
        }
        return set.size();
    }

}
