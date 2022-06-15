package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/9
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution98 {

    private TreeNode pre ;
    private boolean result = true;
    public boolean isValidBST(TreeNode root) {
        traverse(root);
        return result;
    }
    private void traverse(TreeNode root){
        if (root == null){
            return ;
        }
        traverse(root.left);
        if ( pre!=null && root.val <= pre.val){
            result = false;
            return;
        }
        pre = root;
        traverse(root.right);
    }
}
