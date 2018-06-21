package lou.study.letcode;

/*
给定一个字符串 (s) 和一个字符模式 (p)。实现支持 '.' 和 '*' 的正则表达式匹配。

'.' 匹配任意单个字符。
'*' 匹配零个或多个前面的元素。

匹配应该覆盖整个字符串 (s) ，而不是部分字符串。

说明:

    s 可能为空，且只包含从 a-z 的小写字母。
    p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。

 */
public class RegMatch {
    class Solution {
        public boolean isMatch(String s, String p) {
            if (isEmpty(s)) return isMatchNull(p);
            if (isEmpty(p)) return false;
            if (p.charAt(0) == '*') return false;
            return doMatch(s, p);
        }

        private boolean doMatch(String s, String p) {
            if (equalChar(s.charAt(0), p.charAt(0))) {
                if (p.length() <= 1 || p.charAt(1) != '*') {
                    return isMatch(s.substring(1), p.substring(1));
                } else {
                    if (p.charAt(0) == '.') {
                        if (p.length() == 2) {
                            return true;
                        }
                        char next = p.charAt(2);
                        while (!isEmpty(s) && s.indexOf(next) >= 0) {
                            int index = s.indexOf(next);
                            if (index < 0) {
                                return false;
                            }
                            if (isMatch(s.substring(index), p.substring(2))) {
                                return true;
                            }
                            s = s.substring(index + 1);
                        }
                        return false;
                    }
                    if (s.length() >= 2 && s.charAt(1) == s.charAt(0)) {
                        return isMatch(s.substring(1), p);
                    } else {
                        if (p.length() == 2) {
                            if (s.length() == 1) return true;
                            return false;
                        } else if (p.charAt(2) == s.charAt(0)) {
                            return isMatch(s.substring(1), p.substring(3));
                        }
                        return isMatch(s.substring(1), p.substring(2));
                    }
                }
            } else {
                if (p.length() <= 1 || p.charAt(1) != '*') return false;
                return isMatch(s, p.substring(2));
            }
        }

        private boolean equalChar(char a, char b) {
            return a == b || b == '.';
        }

        private boolean isMatchNull(String p) {
            if (isEmpty(p)) return true;
            if (p.length() < 2) return false;
            if (p.charAt(1) != '*') return false;
            return isMatchNull(p.substring(2));
        }

        private boolean isEmpty(String str) {
            return str == null || str.length() == 0;
        }
    }
}
