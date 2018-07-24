package lou.study.letcode.number;

public class BinaryGap {
    public int binaryGap(int n) {
        int gap = 0;
        int i = 0;
        int next = 0;
        while (n > 0) {
            while (n % 2 == 0) {
                n = n >> 1;
                next++;
            }
            next++;
            if (i != 0) {
                gap = next - i > gap ? next - i : gap;
            }
            i = next;
            n = n >> 1;
        }
        return gap;
    }
}
