package lou.study.letcode.number;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        if (x < 10) {
            return true;
        }
        if (x % 10 == 0) {
            return false;
        }
        int tmp = x;
        int rs = 0;
        try {

            while (tmp > 0) {
                int i = tmp % 10;
                tmp = tmp / 10;
                rs = rs * 10 + i;
            }
            return rs == x;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
