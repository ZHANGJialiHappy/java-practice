import java.util.Arrays;

public class FindBestPath {

    public int solution(int[] A, int[] B) {
        // Implement your solution here
        int max = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int[] subarrayA = Arrays.copyOfRange(A, 0, i + 1);
            int[] subarrayB = Arrays.copyOfRange(B, i, B.length);
            int[] mergedArray = merge(subarrayA, subarrayB);
            int tempMax = getMax(mergedArray);
            if (tempMax < max) {
                max = tempMax;
            }
        }
        return max;
    }

    public static int[] merge(int[] subarrayA, int[] subarrayB) {
        int[] mergedArray = new int[subarrayA.length + subarrayB.length];
        System.arraycopy(subarrayA, 0, mergedArray, 0, subarrayA.length);
        System.arraycopy(subarrayB, 0, mergedArray, subarrayA.length, subarrayB.length);
        return mergedArray;
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] A = { 1, 2, 200, 3 };
        int[] B = { 1, 3, 100, 1 };
        FindBestPath a = new FindBestPath();
        System.out.println(a.solution(A, B));
    }

}
