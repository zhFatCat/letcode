package lou.study.letcode.string;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        String pre = "";
        int minSize = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            int len = strs[i].length();
            if (minSize > len) {
                minSize = len;
            }
        }
        if (minSize == 0) {
            return pre;
        }
        int commonLen = 0;
        while (commonLen < minSize) {
            char next = strs[0].charAt(commonLen);
            for (int j = 1; j < strs.length; j++){
                if (strs[j].charAt(commonLen) != next) {
                    return strs[0].substring(0, commonLen);
                }
            }
            ++commonLen;
        }
        return strs[0].substring(0, commonLen);
    }
}
