import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            if (stack.isEmpty()) {
                return false;
            } else {
                if (c == ')' && stack.pop() != '(') {
                    return false;
                }
                if (c == ']' && stack.pop() != '[') {
                    return false;
                }
                if (c == '}' && stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses a = new ValidParentheses();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (a.isValid(input)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }
}
