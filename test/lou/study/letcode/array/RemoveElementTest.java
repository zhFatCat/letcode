package lou.study.letcode.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void removeElement() {
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        Assert.assertEquals(5, removeElement.removeElement(nums, val));
        int[] a = new int[0];
        Assert.assertEquals(0, removeElement.removeElement(a, 0));
        int[] b = {2};
        Assert.assertEquals(1, removeElement.removeElement(b, 3));
        int[] c = {3,2,2,3};
        Assert.assertEquals(2, removeElement.removeElement(c, 3));
    }
}