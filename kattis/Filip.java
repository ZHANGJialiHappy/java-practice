import java.util.Scanner;

public class Filip {
    static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int firstRevesedNumber = reverseNumber(sc.nextInt());
            int biggerNumber = 0;
            if (sc.hasNext()) {
                int secondRevesedNumber = reverseNumber(sc.nextInt());
                if (firstRevesedNumber > secondRevesedNumber) {
                    biggerNumber = firstRevesedNumber;
                } else {
                    biggerNumber = secondRevesedNumber;
                }
            }
            System.out.println(biggerNumber);
        }
    }
}
