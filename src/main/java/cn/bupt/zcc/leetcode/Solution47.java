package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/2
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,result,new ArrayList<>(),new boolean[nums.length]);
        return result;
    }

    private void dfs(int[] nums, List<List<Integer>> result,List<Integer> path, boolean[] visitor){
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (visitor[i] || (i > 0 && nums[i-1] == nums[i] && visitor[i-1])){
                continue;
            }
            path.add(nums[i]);
            visitor[i] = true;
            dfs(nums,result,path,visitor);
            visitor[i] = false;
            path.remove(path.size()-1);
        }
    }
}
