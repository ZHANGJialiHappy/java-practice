public class FirstToEnd {
    public int solution(String S) {
        if (S.length() < 2) {
            return 0;
        }
        int count = 0;
        int res = 0;
        while (count < S.length()) {
            int first = count;
            int last = count - 1 >= 0 ? count - 1 : S.length() - 1;
            if (S.charAt(first) == S.charAt(last)) {
                res++;
            }
            count++;
        }
        return res;
    }

    public static void main(String[] args) {
        FirstToEnd a = new FirstToEnd();
        System.out.println(a.solution("abbaa"));
    }
}
