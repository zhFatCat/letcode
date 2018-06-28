package lou.study.letcode.array;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int tail = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[tail] != nums[i]) {
                if (i > tail + 1) {
                    nums[tail + 1] = nums[i];
                    tail++;
                } else {
                    tail = i;
                }
            }
        }
        return tail + 1;
    }
}
