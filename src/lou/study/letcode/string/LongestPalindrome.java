package lou.study.letcode.string;

/*
 * one char isPalindrome
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        if (isPalindrome(s)) {
            return s;
        }
        if (s.length() == 2) {
            return s.substring(1);
        }
        String result = s.substring(0, 1);
        for (int i = 2; i < s.length(); i++) {
            boolean have = false;
            for (int j = 0; j <= s.length() - i; j++) {
                String tmp = s.substring(j, j + i);
                if (isPalindrome(tmp)) {
                    result = tmp;
                    have = true;
                    break;
                }
            }
            if (!have && i >= result.length() + 2) {
                return result;
            }
        }
        return result;
    }

    private boolean isPalindrome(String s) {
        if (s.length() < 2) {
            return false;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
