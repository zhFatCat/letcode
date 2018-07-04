package lou.study.letcode.string;
/*
* remind: 1. there is one more negative int than positive int
* */
public class MyAoti {
    public int myAtoi(String str) {
        boolean negative = false;
        int result = 0;
        String tmp = str.trim();
        int i = 0, len = tmp.length();
        if (len > 0) {
            if (tmp.charAt(i) == '-') {
                negative = true;
                ++i;
            } else if (tmp.charAt(i) == '+') {
                ++i;
            }
            int minLimit = Integer.MIN_VALUE / 10;
            while (i < len) {
                if (tmp.charAt(i) < '0' || tmp.charAt(i) > '9') {
                    return negative ? result : -result;
                }
                int digit = Character.digit(tmp.charAt(i++), 10);
                if (result < minLimit) {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                result = result * 10;
                if (result <= Integer.MIN_VALUE + digit) {
                    return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                } else {
                    result = result - digit;
                }
            }
        }
        return negative ? result : -result;
    }
}
