import java.util.Scanner;

public class Tri {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] intString = sc.nextLine().trim().split(" ");
            int firstInt = Integer.parseInt(intString[0]);
            int secondInt = Integer.parseInt(intString[1]);
            int thirdInt = Integer.parseInt(intString[2]);
            if (firstInt >= 100 || secondInt >= 100 || thirdInt >= 100) {
                throw new IllegalArgumentException("three integers should be less than 100");
            }
            if (firstInt + secondInt == thirdInt) {
                System.out.println(String.format("%d+%d=%d", firstInt, secondInt, thirdInt));
            } else if (firstInt - secondInt == thirdInt) {
                System.out.println(String.format("%d-%d=%d", firstInt, secondInt, thirdInt));
            } else if (firstInt * secondInt == thirdInt) {
                System.out.println(String.format("%d*%d=%d", firstInt, secondInt, thirdInt));
            } else if (firstInt / secondInt == thirdInt) {
                System.out.println(String.format("%d/%d=%d", firstInt, secondInt, thirdInt));
            } else if (firstInt == secondInt + thirdInt) {
                System.out.println(String.format("%d=%d+%d", firstInt, secondInt, thirdInt));
            } else if (firstInt == secondInt - thirdInt) {
                System.out.println(String.format("%d=%d-%d", firstInt, secondInt, thirdInt));
            } else if (firstInt == secondInt * thirdInt) {
                System.out.println(String.format("%d=%d*%d", firstInt, secondInt, thirdInt));
            } else if (firstInt == secondInt / thirdInt) {
                System.out.println(String.format("%d=%d/%d", firstInt, secondInt, thirdInt));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
