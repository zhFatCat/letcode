package lou.study.letcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void longestCommonPrefix() {
        LongestCommonPrefix lp = new LongestCommonPrefix();
        Assert.assertEquals("fl", lp.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        Assert.assertEquals("", lp.longestCommonPrefix(new String[]{"dog","racecar","car"}));
        Assert.assertEquals("", lp.longestCommonPrefix(new String[]{}));
    }
}