package lou.study.letcode.string.simple;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String b = s.trim();
        return b.length() - b.lastIndexOf(' ') - 1;
    }
}
