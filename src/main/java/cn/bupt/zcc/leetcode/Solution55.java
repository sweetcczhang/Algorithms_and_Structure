package cn.bupt.zcc.leetcode;

/**
 * Created by zhangchengcheng on 2022/6/3
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution55 {
    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max,nums[i]+i);
            if (i == nums.length - 1) return true;
            if (max <=i){
                return false;
            }
        }
        return true;
    }
}
