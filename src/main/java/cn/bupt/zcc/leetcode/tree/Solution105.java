package cn.bupt.zcc.leetcode.tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangchengcheng on 2022/6/9
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution105 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i],i);
        }

        return buildTree(preorder,0,preorder.length-1, inorder,0, inorder.length-1);
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd ,int[] inorder,int inStart, int inEnd){
        if (preStart > preEnd){
            return null;
        }

        TreeNode root = new TreeNode(preorder[preStart]);

        int index = map.get(preorder[preStart]);

        int leftLen = index-inStart;
        int rightLen = inEnd - index;
        root.left = buildTree(preorder,preStart +1, preStart+leftLen, inorder,inStart, index-1);
        root.right = buildTree(preorder,preStart+leftLen+1,preEnd,inorder,index+1,inEnd);
        return root;
    }
}
