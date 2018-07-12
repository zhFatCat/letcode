package lou.study.letcode.number;

public class ReverseInt {
    public int reverse(int x) {
        if (x < 10 && x > -10) {
            return x;
        }
        boolean negtive = x > 0 ? false : true;
        int tmp = negtive ? -x : x;
        String s = String.valueOf(tmp);
        String rs = new StringBuffer(s).reverse().toString();
        try {
            return negtive ? -Integer.parseInt(rs) : Integer.parseInt(rs);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
