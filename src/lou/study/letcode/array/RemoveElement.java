package lou.study.letcode.array;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int empty = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                if (empty >= 0) {
                    nums[empty] = nums[i];
                    empty++;
                }
            } else {
                if (empty < 0) {
                    empty = i;
                }
            }
        }
        return empty < 0 ? nums.length : empty;
    }
}
