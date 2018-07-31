package lou.study.letcode.tree;

import java.util.ArrayList;
import java.util.List;

public class MinimumDifference {
    public int getMinimumDifference(TreeNode root) {
        int min = Integer.MAX_VALUE;
        List<Integer> vals = new ArrayList<Integer>();
        treeValToList(root, vals);
        for (int i = 0; i < vals.size(); i++) {
            for (int j = i + 1; j < vals.size(); j++) {
                int minus = Math.abs(vals.get(i) - vals.get(j));
                min = min > minus ? minus : min;
            }
        }
        return min;
    }

    private void treeValToList(TreeNode root, List<Integer> vals) {
        if (root != null) {
            vals.add(root.val);
            treeValToList(root.left, vals);
            treeValToList(root.right, vals);
        }
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
