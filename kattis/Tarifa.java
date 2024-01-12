import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int megabytePerM = sc.nextInt();
        int months = sc.nextInt();
        int totalUse = 0;
        for (int i = 0; i < months; i++) {
            totalUse += sc.nextInt();
        }
        System.out.println(megabytePerM * (months + 1) - totalUse);
    }
}
