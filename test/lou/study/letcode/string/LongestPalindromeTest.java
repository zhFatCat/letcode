package lou.study.letcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromeTest {

    @Test
    public void longestPalindrome() {
        LongestPalindrome lp = new LongestPalindrome();
        Assert.assertEquals("bab", lp.longestPalindrome("babad"));
        Assert.assertEquals("s", lp.longestPalindrome("s"));
       // Assert.assertEquals("s", lp.longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
    }
}