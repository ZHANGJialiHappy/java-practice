import java.util.Arrays;
import java.util.Scanner;

public class WeScan {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            System.out.println(input);
        } catch (Exception e) {
            System.out.println("You input wrong type.");
        }

        // try (Scanner sc = new Scanner(System.in)) {
        // Double x = sc.nextDouble();
        // System.out.println(x * 2);
        // } catch (Exception e) {
        // System.out.println("Error");
        // }

        // try (Scanner sc = new Scanner(System.in)) {
        // String input = sc.next();
        // int x = Integer.parseInt(input);
        // System.out.println(x * 2);
        // } catch (Exception e) {
        // System.out.println("Error");
        // }

        // try (Scanner sc = new Scanner(System.in)) {
        // String input = sc.next();

        // } catch(Exception e) {

        // }

        // Scanner sc = new Scanner(System.in);
        // String line = sc.nextLine();
        // char d = line.charAt(2);
        // System.out.println(d);
        // String c = line.substring(3, 6);
        // String[] words = line.split(" ");
        // System.out.println(Arrays.toString(words));
        // for (String word : words) {
        // System.out.println(word);
        // }

    }

}
