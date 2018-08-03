package lou.study.letcode.string;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntTest {

    @Test
    public void romanToInt() {
        RomanToInt ri = new RomanToInt();
        Assert.assertEquals(3, ri.romanToInt("III"));
        Assert.assertEquals(4, ri.romanToInt("IV"));
        Assert.assertEquals(9, ri.romanToInt("IX"));
        Assert.assertEquals(58, ri.romanToInt("LVIII"));
        Assert.assertEquals(1994, ri.romanToInt("MCMXCIV"));
    }
}