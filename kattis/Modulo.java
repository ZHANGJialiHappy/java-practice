import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        try (Scanner scanner = new Scanner(System.in)) {
            int i = 0;
            while (i < 10) {
                int input = scanner.nextInt();
                if (input < 0 || input >= 1000) {
                    return;
                }
                int remainder = input % 42;
                if (!values.contains(remainder)) {
                    values.add(remainder);
                }
                i++;
            }
            System.out.println(values.size());
            // for (int value : values) {
            // System.out.println(value);
            // }
            // System.out.println(values.toString());
        } catch (Exception e) {
            System.out.println("Please enter integers.");
        }
    }
}
