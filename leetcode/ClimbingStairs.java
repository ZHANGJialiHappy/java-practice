public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int a1 = 1, a2 = 2, temp = 0;
        for (int i = 3; i < n + 1; i++) {
            temp = a1 + a2;
            a1 = a2;
            a2 = temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        ClimbingStairs a = new ClimbingStairs();
        System.out.println(a.climbStairs(5));
    }

}
