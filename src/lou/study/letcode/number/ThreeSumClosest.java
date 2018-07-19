package lou.study.letcode.number;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int result = twoSumClosest(0, nums, target - nums[0]) + nums[0];
        for (int i = 1; i< nums.length; ++i) {
            int tmp = twoSumClosest(i, nums, target - nums[i]) + nums[i];
            if (tmp == target) {
                return target;
            }
            if (Math.abs(target - tmp) < Math.abs(target - result)) {
                result = tmp;
            }
        }
        return result;
    }

    private int twoSumClosest(int i, int[] nums, int target){
        boolean first = true;
        int result = 0;
        for (int m = 0; m < nums.length; m++) {
            if (m == i) {
                continue;
            }
            for (int n = m + 1; n < nums.length; n++) {
                if (n == i) {
                    continue;
                }
                int tmp = nums[m] + nums[n];
                if (first) {
                    result = tmp;
                    first = false;
                } else if (Math.abs(target - tmp) < Math.abs(target - result)) {
                    result = tmp;
                }
            }
        }
        return result;
    }

}
