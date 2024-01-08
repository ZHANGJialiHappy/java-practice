import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split("-");
        for (String w : words) {
            System.out.print(w.substring(0, 1));
        }
        System.out.println();

    }
}
