public class MissingInteger {
    public int solution(int[] A) {
        // Implement your solution here
        if (A.length == 0) {
            return 1;
        }
        int res = 100001;
        for (int i = 1; i <= 100000; i++) {
            if (!isInArray(A, i)) {
                res = i;
                return i;
            }
        }
        return res;
    }

    private boolean isInArray(int[] A, int n) {
        for (int element : A) {
            if (element == n)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] A = { -1, -3, 0, 4, 1, 2, 2, 34 };

        System.out.println(new MissingInteger().solution(A));
    }

}
