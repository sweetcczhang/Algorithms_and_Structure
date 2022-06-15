package cn.bupt.zcc.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/11
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution113 {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return result;
        searchPathSum(root, targetSum, new ArrayList<>());
        return result;
    }

    public void searchPathSum(TreeNode root, int targetSum, List<Integer> path){
        if (root.left==null && root.right==null){
            if (root.val == targetSum){
                path.add(root.val);
                result.add(new ArrayList<>(path));
                path.remove(path.size()-1);
            }
            return;
        }
        path.add(root.val);
        if (root.left !=null){
            searchPathSum(root.left,targetSum-root.val,path);
        }
        if (root.right !=null){
            searchPathSum(root.right,targetSum-root.val,path);
        }
        path.remove(path.size()-1);
    }

}
