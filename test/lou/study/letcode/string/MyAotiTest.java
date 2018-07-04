package lou.study.letcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyAotiTest {

    @Test
    public void myAtoi() {
        MyAoti aoti = new MyAoti();
        Assert.assertEquals(-42, aoti.myAtoi("   -42"));
        Assert.assertEquals(-2147483648, aoti.myAtoi("-91283472332"));
        Assert.assertEquals(4193, aoti.myAtoi("4193 with words"));
        Assert.assertEquals(-2147483648, aoti.myAtoi("-6147483648"));
        Assert.assertEquals(2147483646, aoti.myAtoi("2147483646"));
        Assert.assertEquals(2147483647, aoti.myAtoi("2147483648"));
    }
}