import java.util.Scanner;

public class BabyBites {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counUntil = sc.nextInt();
        for (int i = 1; i <= counUntil; i++) {
            String count = sc.next();
            if (!count.equals("mumble")) {
                if (Integer.parseInt(count) != i) {
                    System.out.println("something is fishy");
                    return;
                }
            }
        }
        System.out.println("makes sense");

    }

}
