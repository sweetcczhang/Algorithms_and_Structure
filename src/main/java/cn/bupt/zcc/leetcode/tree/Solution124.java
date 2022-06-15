package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/14
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution124 {
    int max = Integer.MIN_VALUE;
    int single = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traverse(root);
        if (single <=0){
            return single;
        }
        return Math.max(max,single);
    }

    public int traverse(TreeNode root){
        if (root == null) return 0;
        int left = Math.max(0,traverse(root.left));
        int right = Math.max(0,traverse(root.right));

        single = Math.max(single,root.val);
        max = Math.max(left+right+root.val,max);

        return Math.max(left,right) + root.val;
    }
}
