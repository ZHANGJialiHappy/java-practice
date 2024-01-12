import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int index = 1;
        while (index < nums.length) {
            for (int i = 0; i + index < nums.length; i++) {
                if (nums[i] + nums[i + index] == target) {
                    return new int[] { i, i + index };
                }
            }
            index++;
        }
        return new int[2];
    }

    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[2];
    }

    public static void main(String[] args) {
        TwoSum a = new TwoSum();
        System.out.println(Arrays.toString(a.twoSum(new int[] { 1, 2 }, 6)));
    }
}