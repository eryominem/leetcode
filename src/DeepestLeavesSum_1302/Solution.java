package DeepestLeavesSum_1302;

public class Solution {
    private int sum = 0;
    private int maxDepth = 0;

    public int deepestLeavesSum(TreeNode root) {
        maxDepth = dfsMaxDepth(root);
        dfsResult(root, 1);
        return sum;
    }

    public void dfsResult(TreeNode root, int depth) {
        if (root == null) {
            return;
        }

        if (depth == maxDepth) {
            sum += root.val;
        }
        dfsResult(root.left, depth + 1);
        dfsResult(root.right, depth + 1);
    }

    public int dfsMaxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(dfsMaxDepth(root.left), dfsMaxDepth(root.right)) + 1;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {
    }
    TreeNode(int val) {
        this.val = val;
    }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}