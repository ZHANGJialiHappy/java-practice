import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            if (sc.hasNextLine()) {
                int y = sc.nextInt();
                if (x < -1000 || x > 1000 || x == 0 || y < -1000 || y > 1000 || y == 0) {
                    throw new IllegalArgumentException("x or y is out of range");
                }
                if (x > 0 && y > 0) {
                    System.out.println("1");
                }
                if (x < 0 && y > 0) {
                    System.out.println("2");
                }
                if (x < 0 && y < 0) {
                    System.out.println("3");
                }
                if (x > 0 && y < 0) {
                    System.out.println("4");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
