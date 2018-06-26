package lou.study.letcode;

public class IntegerReplacement {
    static class Solution {
        public int integerReplacement(int n) {
            int times = 0;
            while (n != 1) {
                if (n % 2 == 1) {
                    if ((n & 3) == 3 && n != 3) {
                        n = n + 1;
                    } else {
                        n = n - 1;
                    }
                } else {
                    n = n / 2;
                }
                times++;
            }
            return times;
        }
    }
   public static void main(String[] args) {
        System.out.print(new Solution().integerReplacement(3));
   }
}
