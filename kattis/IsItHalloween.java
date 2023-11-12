import java.util.Scanner;

public class IsItHalloween {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            if (input.equals("OCT 31") || input.equals("DEC 25")) {
                System.out.println("yup");
            } else {
                System.out.println("nope");
            }
        } catch (Exception e) {
            System.out.println("please enter right format.");
        }
    }
}