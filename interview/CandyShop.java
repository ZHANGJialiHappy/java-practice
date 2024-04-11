import java.util.HashSet;
import java.util.Set;

public class CandyShop {
    public static int solution(int[] A, int[] B) {
        return difference2(A) + difference2(B);

    }

    public static int difference(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            set.add(array[i]);
        }
        if (set.size() > array.length / 2) {
            return array.length / 2;
        }
        return set.size();
    }

    public static int difference2(int[] array) {

        if (countUniqueElements(array) > array.length / 2) {
            return array.length / 2;
        }
        return countUniqueElements(array);
    }

    public static int countUniqueElements(int[] array) {
        int uniqueCount = 0;
        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[j] == array[i]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        return uniqueCount;
    }

    public static void main(String[] args) {
        int[] A = { 2, 2, 2, 2, 2, 2 };
        int[] B = { 7, 4, 2, 5, 1, 2 };
        System.out.println(solution(A, B));
    }

}
