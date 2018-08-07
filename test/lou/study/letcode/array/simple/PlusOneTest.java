package lou.study.letcode.array.simple;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlusOneTest {

    @Test
    public void plusOne() {
        PlusOne po = new PlusOne();
        Assert.assertArrayEquals(new int[]{3, 2, 1}, po.plusOne(new int[]{3, 2, 0}));
        Assert.assertArrayEquals(new int[]{1, 0, 0}, po.plusOne(new int[]{9, 9}));
        Assert.assertArrayEquals(new int[]{4,3,2,2}, po.plusOne(new int[]{4,3,2,1}));
    }
}