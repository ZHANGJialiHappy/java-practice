import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs, (a, b) -> a.length() - b.length());
        String result = "";
        for (int i = 0; i < strs[0].length(); i++) {
            String letter = strs[0].substring(i, i + 1);
            for (int j = 1; j < strs.length; j++) {
                if (!letter.equals(strs[j].substring(i, i + 1))) {
                    return result;
                }
            }
            result += letter;
        }
        return result;
    }

    public String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(s) != 0) {
                s = s.substring(0, s.length() - 1);
            }
        }

        return s;
    }

    public static void main(String[] args) {
        LongestCommonPrefix a = new LongestCommonPrefix();
        System.out.println(a.longestCommonPrefix2(new String[] { "abca", "aba", "aaab" }));
    }
}
