package lou.study.letcode.string;

public class RotateString {
    public boolean rotateString(String A, String B) {
        if (A.equals(B)) {
            return true;
        }
        if (A.length() != B.length()) {
            return false;
        }
        String tmp = A;
        for (int i = 0; i < A.length(); i++) {
            tmp = tmp.substring(1) + tmp.charAt(0);
            if (tmp.equals(B)) {
                return true;
            }
        }
        return false;
    }
}
