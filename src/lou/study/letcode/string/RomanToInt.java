package lou.study.letcode.string;

public class RomanToInt {
    public int romanToInt(String s) {
        int result = 0;
        int len = s.length() - 1;
        for (int i = 0; i < len; i++) {
            int m = getInt(s.charAt(i));
            int next = getInt(s.charAt(i + 1));
            if (m >= next) {
                result += m;
            } else {
                result -= m;
            }
        }
        result += getInt(s.charAt(len));
        return result;
    }


    private int getInt(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                throw new IllegalArgumentException();
        }
    }
}
