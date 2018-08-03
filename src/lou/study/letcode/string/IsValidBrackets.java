package lou.study.letcode.string;

import java.util.Stack;

public class IsValidBrackets {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        for (int i= 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                if (stack.size() != 1) {
                    return false;
                }
                return isPair(s.charAt(i), stack.pop());
            }
            char next = s.charAt(i);
            if (!isPair(next, s.charAt(i + 1))) {
                if (isPre(next)) {
                    stack.push(next);
                } else if (stack.isEmpty() || !isPair(next, stack.pop())) {
                    return false;
                }
            } else {
                ++i;
            }
        }
        return stack.isEmpty();
    }

    private boolean isPre(char c) {
        return  c == '(' || c == '[' || c == '{';
    }

    private boolean isPair(char a, char b) {
        switch (a) {
            case '(':
                return b == ')';
            case '[':
                return b == ']';
            case '{':
                return b == '}';
            case ')':
                return b == '(';
            case ']':
                return b == '[';
            case '}':
                return b == '{';
            default:
                throw new IllegalArgumentException();
        }
    }
}
