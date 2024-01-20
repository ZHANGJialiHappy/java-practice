
public class AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int sum = 0;
        while (i >= 0 || j >= 0 || carry > 0) {
            sum = carry;
            if (i >= 0) {
                sum = sum + a.charAt(i) - '0';
            }
            if (j >= 0) {
                sum = sum + b.charAt(j) - '0';
            }
            carry = sum / 2;
            result.append((char) ((sum % 2) + '0'));
            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        AddBinary a = new AddBinary();
        System.out.println(a.addBinary("1011", "1010"));
    }
}