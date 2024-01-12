import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int xFizz = sc.nextInt();
        int yBuzz = sc.nextInt();
        int countUntil = sc.nextInt();
        for (int i = 1; i <= countUntil; i++) {
            if (i % xFizz == 0 && i % yBuzz == 0) {
                System.out.println("FizzBuzz");
            } else if (i % xFizz == 0) {
                System.out.println("Fizz");
            } else if (i % yBuzz == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
