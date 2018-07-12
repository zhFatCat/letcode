package lou.study.letcode.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPalindromeTest {

    @Test
    public void isPalindrome() {
        IsPalindrome ip = new IsPalindrome();
        Assert.assertTrue(ip.isPalindrome(121));
    }
}