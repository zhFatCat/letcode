package lou.study.letcode.number;

public class Sqrt {
    public int mySqrt(int x) {
        int r = 0;
        while ((r + 1) * (r + 1) > 0 && (r + 1) * (r + 1) <= x) {
            ++r;
        }
        return r;

    }
}
