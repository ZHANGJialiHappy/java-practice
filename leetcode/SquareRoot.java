public class SquareRoot {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            if ((long) mid * mid > (long) x) {
                right = mid - 1;
            } else if (mid * mid < x) {
                left = mid + 1;
            } else
                return mid;
        }
        return right;
    }

    public int mySqrt2(int x) {
        for (int i = 0; i <= x; i++) {
            if (i * i <= x && (long) (i + 1) * (i + 1) > (long) x) {
                return (int) i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SquareRoot a = new SquareRoot();
        System.out.println(a.mySqrt(2147395600));
    }
}
