package cn.bupt.zcc.leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by zhangchengcheng on 2022/6/15
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class BSTIterator {
    Stack<TreeNode> stack = new Stack<>();
    public BSTIterator(TreeNode root) {
        traverse(root);

    }

    public int next() {
        TreeNode pop = stack.pop();
        traverse(pop.right);
        return pop.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
    private void  traverse(TreeNode root){
        while (root != null){
            stack.push(root);
            root = root.left;
        }
    }

}
