package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/9
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution99 {
    private TreeNode pre = new TreeNode(Integer.MIN_VALUE);
    private TreeNode first;
    private TreeNode sencond;
    public void recoverTree(TreeNode root) {
        traverse(root);
        int temp = first.val;
        first.val = sencond.val;
        sencond.val = temp;

    }

    public void traverse(TreeNode root){
        if (root == null){
            return;
        }
        traverse(root.left);
        if (root.val < pre.val){
            if (first == null){
                first = pre;
            }
            sencond = root;
        }
        pre = root;
        traverse(root.right);
    }
}
