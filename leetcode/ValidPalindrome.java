public class ValidPalindrome {
    public boolean isPalindrome1(String s) {
        String cleanS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(cleanS);
        String reversed = new StringBuilder(cleanS).reverse().toString();
        System.out.println(reversed);
        return reversed.equals(cleanS);
    }

    // "A man, a plan, a canal: Panama"
    public boolean isPalindrome(String s) {
        int j = s.length() - 1;
        int i = 0;
        while (i < j) {
            char x = s.charAt(i);
            char y = s.charAt(j);
            if (!isAlpNum(x)) {
                i++;
                continue;
            }
            if (!isAlpNum(y)){
                j--;
                continue;
            }
            if (lowerCase(x) != lowerCase(y)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private int lowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c + 32;
        }
        return c;
    }

    private boolean isAlpNum(int c) {
        if (c >= 'A' && c <= 'Z') {
            return true;
        }
        if (c >= 'a' && c <= 'z') {
            return true;
        }
        if (c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        ValidPalindrome p = new ValidPalindrome();
        System.out.println(p.isPalindrome(s));
    }
}
