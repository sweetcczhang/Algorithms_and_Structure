package cn.bupt.zcc.leetcode.tree;

import cn.bupt.zcc.leetcode.ListNode;

/**
 * Created by zhangchengcheng on 2022/6/11
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution109 {
    ListNode cur;
    public TreeNode sortedListToBST(ListNode head) {
        int len = 0;
        for (ListNode p = head; p!=null; p = p.next){
            len++;
        }
        cur = head;
        return buildBST(0,len-1);
    }

    public TreeNode buildBST(int start, int end){
        if (start > end){
            return null;
        }
        int mid = (end - start)/2 + start;
        TreeNode left = buildBST(start, mid-1);
        TreeNode root = new TreeNode(cur.val);
        cur = cur.next;
        TreeNode right = buildBST(mid+1, end);
        root.left = left;
        root.right = right;
        return root;
    }
}
