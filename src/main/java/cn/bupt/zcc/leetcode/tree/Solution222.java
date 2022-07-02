package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/19
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution222 {

    public int countNodes(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = 0;
        TreeNode leftNode = root;
        while (leftNode.left !=null){
            left++;
            leftNode = leftNode.left;
        }
        int rigth = 0;
        TreeNode rightNode = root;
        while (rightNode.right !=null){
            rigth++;
            rightNode = rightNode.right;
        }
        if (left == rigth){
            return (int) Math.pow(2,left+1)-1;
        }

        return countNodes(root.left ) + countNodes(root.right) + 1;
    }
}
