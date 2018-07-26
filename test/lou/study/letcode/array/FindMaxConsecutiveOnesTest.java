package lou.study.letcode.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindMaxConsecutiveOnesTest {
    FindMaxConsecutiveOnes fm = new FindMaxConsecutiveOnes();

    @Test
    public void findMaxConsecutiveOnes() {
        Assert.assertEquals(0, fm.findMaxConsecutiveOnes(new int[]{}));
        Assert.assertEquals(3, fm.findMaxConsecutiveOnes(new int[]{1, 0, 1, 1, 00, 1, 1, 1, 0, 0}));
        Assert.assertEquals(1, fm.findMaxConsecutiveOnes(new int[]{1}));
    }
}