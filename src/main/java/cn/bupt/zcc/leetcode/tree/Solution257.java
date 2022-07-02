package cn.bupt.zcc.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/21
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution257 {
    List<String> result = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) return result;
        traverse(root,"");
        return result;
    }

    private void traverse(TreeNode root, String builder){
        if (root == null){
            StringBuilder sb = new StringBuilder(builder);
            sb.append(root.val);
            if (root.left == null && root.right == null){
                result.add(sb.toString());
            }else {
                sb.append("->");
                traverse(root.left, sb.toString());
                traverse(root.right,sb.toString());
            }
        }
    }
}
