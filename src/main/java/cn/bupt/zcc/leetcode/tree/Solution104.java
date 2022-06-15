package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/9
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution104 {
    public int maxDepth(TreeNode root) {
        return traverse(root);
    }
    public int traverse (TreeNode root){
        if (root ==null) return 0;
        int left = traverse(root.left);
        int right = traverse(root.right);
        return Math.max(left,right) + 1;
    }
}
