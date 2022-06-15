package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/9
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return traverse(p,q);
    }
    private boolean traverse(TreeNode p, TreeNode q){
        if (p==null && q== null){
            return true;
        }
        if (p==null && q!=null){
            return false;
        }
        if (p!=null && q==null){
            return false;
        }

        boolean left = traverse(p.left,q.left);
        if ( !left) return false;
        if (p.val != q.val){
            return false;
        }
        boolean right = traverse(p.right, q.right);
        return right;
    }
}
