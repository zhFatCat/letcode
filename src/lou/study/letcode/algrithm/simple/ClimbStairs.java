package lou.study.letcode.algrithm.simple;

public class ClimbStairs {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int[] cache = new int[n];
        cache[0] = 1;
        cache[1] = 2;
        for (int i = 2; i < n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[n - 1];
    }
}
