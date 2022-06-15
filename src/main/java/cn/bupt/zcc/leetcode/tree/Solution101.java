package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/9
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check(root.left,root.right);

    }

    public boolean check(TreeNode left, TreeNode right){
        if (left ==null || right ==null) return left == right;
        if (left.val != right.val) return false;

        return check(left.left,right.right) && check(left.right, right.left);
    }
}
