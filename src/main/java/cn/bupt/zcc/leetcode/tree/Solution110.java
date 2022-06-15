package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/11
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution110 {
    boolean flag = true;
    public boolean isBalanced(TreeNode root) {
        maxLen(root);
        return flag;
    }

    public int maxLen(TreeNode root){
        if (!flag) return 0;
        if (root == null){
            return 0;
        }
        int left = maxLen(root.left);
        int right = maxLen(root.right);
        if (Math.abs(left-right)>1){
            flag =false;
        }
        return Math.max(left ,right) + 1;
    }
}
