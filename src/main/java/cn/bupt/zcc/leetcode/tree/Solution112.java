package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/11
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution112 {

    boolean result = false;

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        search(root, targetSum);

        return result;
    }

    public void search(TreeNode root, int targetSum){
        if (root.right == null && root.left==null){
            if (root.val == targetSum){
                result = true;
                return;
            }

        }
        if (root.left !=null){
            search(root.left, targetSum-root.val);
        }
        if (root.right != null){
            search(root.right, targetSum-root.val);
        }
    }
}
