package lou.study.letcode.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntTest {

    @Test
    public void reverse() {
        ReverseInt ri = new ReverseInt();
        Assert.assertEquals(123, ri.reverse(321));
        Assert.assertEquals(-123, ri.reverse(-321));
    }
}