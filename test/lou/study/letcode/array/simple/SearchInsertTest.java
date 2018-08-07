package lou.study.letcode.array.simple;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchInsertTest {

    @Test
    public void searchInsert() {
        SearchInsert si = new SearchInsert();
        Assert.assertEquals(2, si.searchInsert(new int[]{1,3,5,6}, 5));
        Assert.assertEquals(1, si.searchInsert(new int[]{1,3,5,6}, 2));
        Assert.assertEquals(0, si.searchInsert(new int[]{1,3,5,6}, 0));
        Assert.assertEquals(4, si.searchInsert(new int[]{1,3,5,6}, 7));
    }
}