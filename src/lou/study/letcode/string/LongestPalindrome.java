package lou.study.letcode.string;

/*
* one char isPalindrome
*/
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if (s== null || s.length() < 2) {
            return s;
        }
        if (isPalindrome(s)) {
            return s;
        }
        if (s.length() == 2) {
            return s.substring(1);
        }
        String l = longestPalindrome(s.substring(0, s.length() - 1));
        String r = longestPalindrome(s.substring(1));
        return l.length() >= r.length() ? l : r;
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
