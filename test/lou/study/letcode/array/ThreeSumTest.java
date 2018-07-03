package lou.study.letcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ThreeSumTest {

    @Test
    public void threeSum() {
        ThreeSum ts = new ThreeSum();
        int[] param = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = ts.threeSum(param);
        Assert.assertEquals(2, result.size());
    }
}