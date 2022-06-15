package cn.bupt.zcc.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangchengcheng on 2022/6/9
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution106 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i );
        }
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);

    }

    public TreeNode buildTree(int[] inorder,int inStart, int inEnd, int[] postorder,int postStart, int postEnd){
        if (inStart>inEnd){
            return null;
        }
        int val = postorder[postEnd];
        TreeNode root = new TreeNode(val);
        int index = map.get(val);

        int leftLen = index - inStart;
        root.left = buildTree(inorder,inStart,index-1,postorder,postStart,postStart+leftLen-1);
        root.right = buildTree(inorder,index+1, inEnd,postorder, postStart+leftLen,postEnd-1);

        return root;

    }
}
