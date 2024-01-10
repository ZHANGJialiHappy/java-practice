import java.util.Scanner;

public class ColdPuterScience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = sc.nextInt();
        int negativeQuantity = 0;
        for (int i = 0; i < quantity; i++) {
            int temperatur = sc.nextInt();
            if (temperatur < 0) {
                negativeQuantity++;
            }
        }
        sc.close();
        System.out.println(negativeQuantity);

    }
}
