package cn.bupt.zcc.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/7
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution95 {
    public static List<TreeNode> generateTrees(int n) {

        return traverse(1,n);
    }

    public static List<TreeNode> traverse(int start, int end){
        List<TreeNode> res = new LinkedList<>();
        if (start > end){
            res.add(null);
            return res;
        }
        for (int i = start; i <= end; i++) {
            List<TreeNode> leftTree = traverse(start,i-1);
            List<TreeNode> rightTree = traverse(i+1,end);
            for (TreeNode left : leftTree){
                for (TreeNode right : rightTree){
                    TreeNode root =new  TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        generateTrees(3);
    }

}
