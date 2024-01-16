import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = Arrays.copyOf(digits, digits.length + 1);
        digits[0] = 1;
        return digits;

    }

    public static void main(String[] args) {
        PlusOne a = new PlusOne();
        System.out.println(Arrays.toString(a.plusOne(new int[] { 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9,
                9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9 })));
    }
}
