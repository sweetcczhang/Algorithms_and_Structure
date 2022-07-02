package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/19
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution230 {
    int result;
    int index;
    public int kthSmallest(TreeNode root, int k) {
        traverse(root,k);
        return result;
    }

    private void traverse(TreeNode root, int k){
        if (root == null){
            return;
        }
        traverse(root.left,k);
        index ++;
        if (index == k){
            result = root.val;
            return;
        }
        traverse(root.right,k);
    }
}
