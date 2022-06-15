package cn.bupt.zcc.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/9
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution102 {

    boolean flag = true;

    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> result = new LinkedList<>();
        if (root == null) return result;
        List<TreeNode> nodeList = new ArrayList<>();
        nodeList.add(root);
        while (nodeList.size() !=0){
            nodeList =traverse(result,nodeList);
        }

        return result;
    }

    List<TreeNode> traverse(LinkedList<List<Integer>> result,List<TreeNode> nodeList){
        List<TreeNode> temp =new ArrayList<>();
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i <nodeList.size() ; i++) {
            TreeNode node = nodeList.get(i);
            list.addLast(node.val);
            if (node.left!=null){
                temp.add(node.left);
            }
            if (node.right != null){
                temp.add(node.right);
            }
        }
        result.addFirst(list);
        return temp;
    }
}
