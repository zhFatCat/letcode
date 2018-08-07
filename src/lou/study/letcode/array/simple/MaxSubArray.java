package lou.study.letcode.array.simple;

public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            pre = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                int tmp = pre + nums[j];
                pre = tmp;
                if (max < tmp) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    // passed but not so good
    public int badSolution(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int pre = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            pre = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                int tmp = pre + nums[j];
                pre = tmp;
                if (max < tmp) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    // need too much space
    private int greedy(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int[][] sums = new int[nums.length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            sums[i][i] = nums[i];
            for (int j = i - 1; j >= 0; j--) {
                int tmp = sums[i][j + 1] + nums[j];
                sums[i][j] = tmp;
                if (max < tmp) {
                    max = tmp;
                }
            }
        }
        return max;
    }

    // time excced
    int greedy2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int[] sums = new int[(nums.length) * (nums.length + 1) / 2];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            sums[k] = nums[i];
            ++k;
            for (int j = i - 1; j >= 0; j--) {
                int tmp = sums[k - 1] + nums[j];
                sums[k] = tmp;
                ++k;
                if (max < tmp) {
                    max = tmp;
                }
            }
        }
        return max;
    }
}
