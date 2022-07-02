package cn.bupt.zcc.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/16
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution199 {
    List<Integer> result = new ArrayList<>();
    int depth = 0;
    public List<Integer> rightSideView(TreeNode root) {
        traverse(root);
        return result;
    }

    private void traverse(TreeNode root){
        if (root == null){
            return;
        }
        depth++;
        if (result.size() < depth){
            result.add(root.val);
        }
        traverse(root.right);
        traverse(root.left);
        depth--;
    }


}
