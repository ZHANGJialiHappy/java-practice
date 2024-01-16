public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        if (target == nums[nums.length - 1]) {
            return nums.length - 1;
        }
        if (target < nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        SearchInsertPosition a = new SearchInsertPosition();
        System.out.println(a.searchInsert(new int[] { 1, 3, 5, 6 }, 6));
    }

}
