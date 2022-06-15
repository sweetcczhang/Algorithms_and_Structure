package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/11
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution108 {

    public TreeNode sortedArrayToBST(int[] nums) {
        return  buildBST(nums,0,nums.length-1);
    }


    public TreeNode buildBST(int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        int mid = (end-start)/2 + start;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums,start, mid-1);
        root.right = buildBST(nums,mid+1, end);
        return root;
    }
}
