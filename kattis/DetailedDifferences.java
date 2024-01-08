import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 500 && num < 1) {
            sc.close();
            throw new IllegalArgumentException("the number of test should between 1 and 500");
        }
        Scanner sc2 = new Scanner(System.in);
        int count = 0;
        while (count < num && sc2.hasNextLine()) {
            String str1 = sc2.nextLine();
            String str2 = sc2.nextLine();
            System.out.println(str1);
            System.out.println(str2);

            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) == str2.charAt(j)) {
                    System.out.print(".");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
            System.out.println();

            count++;
        }
        sc.close();
        sc2.close();

    }

}
