package lou.study.letcode.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void mySqrt() {
        Sqrt sq = new Sqrt();
        Assert.assertEquals((int)Math.sqrt(2147395600), sq.mySqrt(2147395600));
        Assert.assertEquals(46340, sq.mySqrt(2147395600));
    }
}