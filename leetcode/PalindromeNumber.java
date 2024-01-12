public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String palindrome = String.valueOf(x);
        for (int i = 0; i < palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int temp = x;
        int reverse = 0;
        while (temp > 0) {
            reverse = 10 * reverse + temp % 10;
            temp /= 10;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        PalindromeNumber a = new PalindromeNumber();
        System.out.println(a.isPalindrome(-121));
        System.out.println(a.isPalindrome2(0));
    }

}
