package lou.study.letcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RotateStringTest {

    @Test
    public void rotateString() {
        RotateString rs = new RotateString();
        Assert.assertTrue(rs.rotateString("abcde", "cdeab"));
        Assert.assertFalse(rs.rotateString("abcde", "abced"));
    }
}