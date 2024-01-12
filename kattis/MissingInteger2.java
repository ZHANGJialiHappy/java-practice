import java.util.Arrays;

public class MissingInteger2 {
    public int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) {
            return 1;
        }
        int firstPositiveIndex = indexOfPositive(A);
        if (firstPositiveIndex < 0) {
            return 1;
        }
        for (int i = firstPositiveIndex; i < A.length - 1; i++) {
            if (A[i + 1] - A[i] > 1) {
                return A[i] + 1;
            }
        }
        return A[A.length - 1] + 1;
    }

    private int indexOfPositive(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = { 1, 3, 6, 4, 1, 2 };

        System.out.println(new MissingInteger2().solution(A));

    }
}
