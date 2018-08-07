package lou.study.letcode.array.simple;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxSubArrayTest {

    @Test
    public void maxSubArray() {
        MaxSubArray ms = new MaxSubArray();
        Assert.assertEquals(6, ms.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void greedy2() {
        MaxSubArray ms = new MaxSubArray();
        Assert.assertEquals(6, ms.greedy2(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}