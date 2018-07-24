package lou.study.letcode.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryGapTest {

    @Test
    public void binaryGap() {
        BinaryGap bg = new BinaryGap();
        Assert.assertEquals(2, bg.binaryGap(22));
        Assert.assertEquals(2, bg.binaryGap(5));
        Assert.assertEquals(1, bg.binaryGap(6));
        Assert.assertEquals(0, bg.binaryGap(8));
    }
}