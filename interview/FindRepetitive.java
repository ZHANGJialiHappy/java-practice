import java.util.HashSet;

public class FindRepetitive {

    public int solution(String s) {
        int count = 0;
        HashSet<Character> letterSet = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (letterSet.contains(c)) {
                count++;
                letterSet.clear();
            }
            letterSet.add(c);
        }

        if (!letterSet.isEmpty()) {
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        FindRepetitive a = new FindRepetitive();
        System.out.println(a.solution("world"));
    }
}
