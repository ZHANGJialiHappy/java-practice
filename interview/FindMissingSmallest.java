import java.util.Arrays;

public class FindMissingSmallest {

    public int solution(int[] A) {
        Arrays.sort(A);
        int beginIndex = searchBiggerThan0(A);

        if (beginIndex >= A.length)
            return 1;

        int target = 1;
        for (int i = beginIndex; i < A.length; i++) {
            if (A[i] == target) {
                target = A[i] + 1;
            }
            if (A[i] >= target) {
                break;
            }
        }

        return target;
    };

    public int searchBiggerThan0(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (A[mid] > 1)
                hi = mid - 1;
            else if (A[mid] < 1)
                lo = mid + 1;
            else
                return mid;
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] A = { 0, 1, 1, 1, 1, 2, 6 };

        FindMissingSmallest a = new FindMissingSmallest();

        System.out.println(a.searchBiggerThan0(A));

        System.out.println(a.solution(A));

    }
}
