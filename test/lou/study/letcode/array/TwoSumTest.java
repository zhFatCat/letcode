package lou.study.letcode.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void twoSum() {
        TwoSum ts = new TwoSum();
        int[] exp = {0, 1};
        int[] array = {2, 7, 11, 15};
        assertArrayEquals(exp, ts.twoSum(array, 9));
    }
}