package lou.study.letcode.number;

import java.util.Arrays;

public class MedianSlidingWindow {
    public double[] medianSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || nums.length < k || k <= 0) {
            return new double[0];
        }
        double result[] = new double[nums.length - k + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = medianNum(Arrays.copyOfRange(nums, i, i + k));
        }
        return result;
    }

    double medianNum(int datas[]) {
        if (datas.length == 1) {
            return datas[0];
        }
        if (datas.length == 2) {
            long tmp = (long) datas[0] + (long)datas[1];
            return tmp / 2d;
        }
        Arrays.sort(datas);
        int media = datas.length / 2;
        if (datas.length % 2 == 0) {
            long tmp = (long)datas[media - 1] + (long)datas[media];
            return tmp / 2d;
        }
        return datas[media];
    }

    double average(int datas[]) {
        return Arrays.stream(datas).average().getAsDouble();
    }

}
