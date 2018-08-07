package lou.study.letcode.array.simple;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int[] result = null;
        if (digits[digits.length - 1] < 9) {
            result = digits.clone();
            result[digits.length - 1] = result[digits.length - 1] + 1;
            return result;
        }
        boolean isOverFlow = Arrays.stream(digits).allMatch((data) -> data == 9);
        if (isOverFlow) {
            result = new int[digits.length + 1];
            result[0] = 1;
            return result;
        }
        result = digits.clone();
        for (int i = result.length - 1; i >= 0; --i) {
            if (result[i] == 9) {
                result[i] = 0;
            } else {
                result[i] += 1;
                break;
            }
        }
        return result;
    }
}
