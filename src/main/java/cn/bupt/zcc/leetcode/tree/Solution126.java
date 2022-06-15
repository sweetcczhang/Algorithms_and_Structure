package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/14
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution126 {
    int sum =0;
    public int sumNumbers(TreeNode root) {
        if (root == null) return sum;
        traverse(root,new StringBuilder());
        return sum;
    }

    public void traverse(TreeNode root, StringBuilder builder){
        if (root == null){
            return;
        }
        builder.append(root.val);
        if (root.left == null && root.right == null){
            sum  += Integer.parseInt(builder.toString());
        }
        traverse(root.left,builder);
        traverse(root.right,builder);
        builder.deleteCharAt(builder.length()-1);
    }

}
