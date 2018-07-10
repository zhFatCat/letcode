package lou.study.letcode.array;

/*
给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
你的算法时间复杂度必须是 O(log n) 级别。
如果数组中不存在目标值，返回 [-1, -1]。
*/
public class SearchRange {

    public int[] searchRange(int[] nums, int target) {
        int[] RESULT = new int[]{-1, -1};
        if (nums.length == 0) {
            return RESULT;
        }

        int l = 0;
        int k = nums.length;
        int i = nums.length / 2;
        while (l <= k){
            if (nums[i] == target) {
                int m = i - 1;
                int n = i + 1;
                while (m >= 0 && nums[m] == target) {
                    --m;
                }
                while (n < nums.length && nums[n] == target) {
                    ++n;
                }
                RESULT[0] = m + 1;
                RESULT[1] = n - 1;
                return RESULT;
            } else if (nums[i] < target) {
                if (i >= nums.length - 1) {
                    return RESULT;
                }
                l = i + 1;
                i = (l + k) / 2;
            } else {
                if (i <= 0) {
                    return RESULT;
                }
                k = i - 1;
                i = k / 2;
            }
        }
        return RESULT;
    }
}
