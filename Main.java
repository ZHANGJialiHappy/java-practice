import java.util.Scanner;

public class Main {
    // psvm
    public static void main(String[] args) {
        // syso
        System.out.println("\nHello\n");
        String var1 = "haha";
        var1 = "\nXixi\n";
        System.out.println((var1));

        try (Scanner scanner = new Scanner(System.in)) {
            String var2 = scanner.nextLine();
            System.out.println(var2);
            System.out.println(var2);
        } catch (Exception e) {
            System.out.println("haha");
        }

        // Scanner scanner = new Scanner(System.in);
        // int var2 = scanner.nextInt();
        // System.out.println(var2);
        // System.out.println(var2);
        // scanner.close();

    }

}