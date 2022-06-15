package cn.bupt.zcc.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/15
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public void  traverse(TreeNode root , List<Integer> result){
        if (root == null){
            return;
        }

        traverse(root.left,result);
        traverse(root.right,result);
        result.add(root.val);
    }
}
