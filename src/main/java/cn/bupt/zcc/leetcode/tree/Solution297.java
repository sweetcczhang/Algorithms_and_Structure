package cn.bupt.zcc.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhangchengcheng on 2022/6/28
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution297 {
    // Encodes a tree to a single string.
    private final static String SPLIT = ",";

    private final static String NULL = "#";

    public String serialize(TreeNode root) {
        StringBuilder stringBuilder = new StringBuilder();
        traverse(root,stringBuilder);
        return stringBuilder.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> queue = new LinkedList<>();
        for (String s : data.split(SPLIT)){
            queue.add(s);
        }
        return buildTree(queue);
    }

    private void traverse(TreeNode root, StringBuilder stringBuilder){
        if (root == null){
            stringBuilder.append(NULL).append(SPLIT);
            return;
        }
        stringBuilder.append(root.val).append(SPLIT);
        traverse(root.left,stringBuilder);
        traverse(root.right,stringBuilder);
    }

    private TreeNode buildTree(Queue<String> nodeList){
        if (nodeList.isEmpty()) return null;
        String first = nodeList.poll();
        if (NULL.equals(first)){
            return null;
        }
        TreeNode root = new TreeNode(Integer.valueOf(first));
        root.left = buildTree(nodeList);
        root.right = buildTree(nodeList);
        return root;
    }


}
