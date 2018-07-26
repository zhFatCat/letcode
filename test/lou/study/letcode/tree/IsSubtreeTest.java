package lou.study.letcode.tree;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsSubtreeTest {
    IsSubtree is = new IsSubtree();

    @Test
    public void isSubtree() {
        Assert.assertTrue(is.isSubtree(new IsSubtree.TreeNode(1), new IsSubtree.TreeNode(1)));
    }
}