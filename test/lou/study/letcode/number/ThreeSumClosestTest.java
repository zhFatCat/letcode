package lou.study.letcode.number;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeSumClosestTest {

    @Test
    public void threeSumClosest() {
        ThreeSumClosest ts = new ThreeSumClosest();
        Assert.assertEquals(2, ts.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }
}