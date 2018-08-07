package lou.study.letcode.array.simple;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int index = 0;
        while (index < nums.length && nums[index] < target) {
            ++index;
        }
        return index;
    }
}
