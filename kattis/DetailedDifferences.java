import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetailedDifferences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 500 && num < 1) {
            sc.close();
            throw new IllegalArgumentException("the number of test should between 1 and 500");
        }
        List<String> str1s = new ArrayList<>();
        List<String> str2s = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            str1s.add(str1);
            str2s.add(str2);
        }

        for (int i = 0; i < str1s.size(); i++) {
            String str1 = str1s.get(i);
            String str2 = str2s.get(i);

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

        }
        sc.close();
    }

}
