import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String jonSay = sc.nextLine().toLowerCase();
            if (sc.hasNextLine()) {
                String doctorWant = sc.nextLine();
                if (jonSay.length() >= doctorWant.length()) {
                    System.out.println("go");
                } else {
                    System.out.println("no");
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
