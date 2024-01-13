public class MissingPositiveNumber {
    public int findKthPositive(int[] arr, int k) {
        int count = 1;
        int i = 1;
        while (count >= 0) {
            if (!isNumberContained(arr, i)) {
                if (count == k) {
                    return i;
                }
                count++;
            }
            i++;
        }
        return 0;
    }

    public boolean isNumberContained(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    public int findKthPositive2(int[] arr, int k) {
        int count = 1;
        int i = 1;
        int arrayIndex = 0;
        while (count >= 0) {
            if (i != arr[arrayIndex]) {
                if (count == k) {
                    return i;
                }
                count++;
            } else {
                if (arrayIndex < arr.length - 1) {
                    arrayIndex++;
                }
            }
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        MissingPositiveNumber a = new MissingPositiveNumber();
        System.out.println(a.findKthPositive2(new int[] { 2, 3, 4, 7, 11 }, 5));
    }

}
