package lou.study.letcode.string.simple;

public class BinaryAdd {
    public String addBinary(String a, String b) {
        if (a == null || a.length() == 0) {
            return b;
        }
        if (b == null || b.length() == 0) {
            return a;
        }
        StringBuilder sb = new StringBuilder();
        int mark = 0;
        int index = 1;
        while ((index <= a.length() && index <= b.length())) {
            int tmp = char2int(a.charAt(a.length() - index)) + char2int(b.charAt(b.length() - index)) + mark;
            mark = tmp >= 2 ? 1: 0;
            sb.append(tmp % 2);

            ++index;
        }
        --index;
        String aleft = a.substring(0, a.length() - index);
        if (aleft.length() > 0) {
            if (mark == 1) {
                sb.append(plusOne(aleft));
            } else {
                return  aleft + sb.reverse().toString();
            }
        } else {
            String bleft = b.substring(0, b.length() - index);
            if (mark == 1) {
                sb.append(plusOne(bleft));
            } else {
                return bleft + sb.reverse().toString();
            }
        }
        return sb.reverse().toString();
    }

   private String plusOne(String s) {
       StringBuilder sb = new StringBuilder();
        int mark = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            int tmp = char2int(s.charAt(i)) + mark;
            mark = tmp >= 2 ? 1: 0;
            sb.append(tmp % 2);
        }
        if (mark == 1) {
            sb.append(mark);
        }
        return sb.toString();
   }


    private int char2int(char ch) {
        if (ch == '0') {
            return 0;
        }
        if (ch == '1') {
            return 1;
        }
        throw new NumberFormatException();
    }
}
