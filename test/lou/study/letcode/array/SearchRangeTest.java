package lou.study.letcode.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SearchRangeTest {

    @Test
    public void searchRange() {
        SearchRange sr = new SearchRange();
        int[] nums = {5, 7, 7, 8, 8, 10};
        Assert.assertArrayEquals(new int[]{3, 4}, sr.searchRange(nums, 8));
        Assert.assertArrayEquals(new int[]{-1, -1}, sr.searchRange(nums, 6));
        Assert.assertArrayEquals(new int[]{0, 0}, sr.searchRange(new int[]{1}, 1));
        Assert.assertArrayEquals(new int[]{0, 0}, sr.searchRange(new int[]{1, 3}, 1));
        Assert.assertArrayEquals(new int[]{-1, -1}, sr.searchRange(new int[]{1, 3}, -1));
        Assert.assertArrayEquals(new int[]{-1, -1}, sr.searchRange(new int[]{0,0,1,1,1,4,5,5}, 2));
    }
}