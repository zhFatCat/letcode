package lou.study.letcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsValidBracketsTest {

    @Test
    public void isValid() {
        IsValidBrackets ib = new IsValidBrackets();
        Assert.assertTrue(ib.isValid("()"));
        Assert.assertTrue(ib.isValid("()[]{}"));
        Assert.assertTrue(ib.isValid(""));
        Assert.assertTrue(!ib.isValid("([)"));
        Assert.assertTrue(!ib.isValid("([)]"));
    }

    @Test
    public void isValidFailCase() {
        IsValidBrackets ib = new IsValidBrackets();
        Assert.assertTrue(ib.isValid("()[]{}"));
    }
    @Test
    public void isValidFailCase2() {
        IsValidBrackets ib = new IsValidBrackets();
        Assert.assertTrue(ib.isValid("{[]}"));
    }
}