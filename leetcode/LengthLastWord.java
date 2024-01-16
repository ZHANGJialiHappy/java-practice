public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        LengthLastWord a = new LengthLastWord();
        System.out.println(a.lengthOfLastWord("luffy is still joyboy"));
    }
}
