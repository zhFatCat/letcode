package lou.study.letcode;

import java.util.HashSet;
import java.util.Set;

/*
给定一个字符串，找出不含有重复字符的最长子串的长度。

示例：

给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。

给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。

给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。

 */
public class LengthOfLongestSubstring {
    public static class Solution {
        public int lengthOfLongestSubstring(String s) {
            if (s == null || s.length() == 0) {
                return 0;
            }
            int max = 0;
            Set<Character> characters = new HashSet<>(s.length());
            int length = s.length();
            for (int i = 0; i < length; i++) {
                int tmp = 0;
                characters.clear();
                for (int j = i; j < length; j++) {
                    char ch = s.charAt(j);
                    if (characters.add(ch)) {
                        ++tmp;
                    } else {
                        i = j;
                        if (max < tmp) {
                            max = tmp;
                        }
                        break;
                    }
                }
                if (max < tmp) {
                    max = tmp;
                }
                if (max > (s.length() - i + 1)) {
                    return max;
                }
            }
            return max;

        }
    }

    public static void main(String[] args) {
        System.out.print(new Solution().lengthOfLongestSubstring("dvdf"));
    }
}
