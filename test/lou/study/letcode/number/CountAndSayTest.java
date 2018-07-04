package lou.study.letcode.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountAndSayTest {

    @Test
    public void countAndSay() {
        CountAndSay cs = new CountAndSay();
        Assert.assertEquals("11", cs.countAndSay(2));
        Assert.assertEquals("111221", cs.countAndSay(5));
    }
}