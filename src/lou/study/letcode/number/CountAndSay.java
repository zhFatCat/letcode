package lou.study.letcode.number;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CountAndSay {
    public String countAndSay(int n) {
        char[] chars = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        String result = "1";
        if (n == 1) {
            return result;
        }
        while (n > 1) {
            --n;
            String next = "";
            for (int i = 0; i < result.length();) {
                int num = 0;
                char nextChar = result.charAt(i);
                while (i < result.length() && nextChar == result.charAt(i)) {
                    ++num;
                    ++i;
                }
                next = next + chars[num] + nextChar;
            }
            result = next;
        }
        return result;
    }
}
