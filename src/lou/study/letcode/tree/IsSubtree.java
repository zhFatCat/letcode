package lou.study.letcode.tree;

public class IsSubtree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (isTreeEqual(s, t)) {
            return true;
        }
        if (s == null) {
            return false;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);

    }

    boolean isTreeEqual(TreeNode s, TreeNode t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }
        if (t == null) {
            return false;
        }
        if (s.val != t.val) {
            return false;
        }
        return isTreeEqual(s.left, t.left) && isTreeEqual(s.right, t.right);
    }
}
