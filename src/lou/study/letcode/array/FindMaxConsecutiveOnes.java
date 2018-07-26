package lou.study.letcode.array;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (max < tmp) {
                    max = tmp;
                }
                tmp = 0;
            } else {
                ++tmp;
            }
        }
        return max > tmp ? max : tmp;
    }
}
