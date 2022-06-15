package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/12
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution114 {
    public void flatten(TreeNode root) {
        if (root == null) return;
        flatten(root.left);
        flatten(root.right);
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.left = null;
        root.right = left;
        TreeNode p = root;
        while (p.right != null){
            p = p.right;
        }
        p.right = right;
    }
}
