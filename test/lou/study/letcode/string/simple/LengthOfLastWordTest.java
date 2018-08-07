package lou.study.letcode.string.simple;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWord() {
        LengthOfLastWord ll = new LengthOfLastWord();
        Assert.assertEquals(2, ll.lengthOfLastWord("aaa bb"));
        Assert.assertEquals(5, ll.lengthOfLastWord("aaabb"));
        Assert.assertEquals(5, ll.lengthOfLastWord("aaabb "));
    }
}