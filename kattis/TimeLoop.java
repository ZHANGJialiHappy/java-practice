import java.util.Scanner;

public class TimeLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            if (n > 100 || n < 1) {
                return;
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.println(i + 1 + " Abracadabra");
                }
            }

        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
