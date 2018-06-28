package lou.study.letcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest {
    RemoveDuplicates ins = new RemoveDuplicates();
    @Test
    public void removeDuplicatesTest() {
        int[] a1 = {1,1,2};
        Assert.assertEquals(2, ins.removeDuplicates(a1));

    }

}