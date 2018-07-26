package lou.study.letcode.array;

import java.util.Arrays;

public class EatBanana {
    public int minEatingSpeed(int[] piles, int h) {
        if (piles.length == 0) {
            return 0;
        }
        if (h == piles.length) {
            return Arrays.stream(piles).max().getAsInt();
        }
        // may not good but i want to try.
        //int min = Arrays.stream(piles).min().getAsInt();
        int max = Arrays.stream(piles).max().getAsInt();
        long total = Arrays.stream(piles).asLongStream().sum();
        int k = (int) (total / h);
        if (total % h > 0) {
            ++k;
        }
        while (k <= max && spendTime(piles, k, max) > h) {
            ++k;
        }
        return  k;
    }
    int spendTime(int[] piles, int k, int max) {
        int time = 0;
        for (int i = 0; i < piles.length; i++) {
            time += piles[i] / k;
            if (piles[i] % k > 0) {
                ++time;
            }
            if (time < 0 || time > max) {
                return Integer.MAX_VALUE;
            }
        }
        return time;
    }
}
