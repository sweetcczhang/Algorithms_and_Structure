package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by zhangchengcheng on 2022/6/2
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution46 {

    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        dfs(nums,result,new ArrayList<>(),new HashSet<>());
        return result;
    }

    public void dfs(int[] nums, List<List<Integer>> result, List<Integer> path, Set<Integer> set){
        if (path.size() == nums.length){
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                continue;
            }
            path.add(nums[i]);
            set.add(nums[i]);
            dfs(nums,result,path, set);
            path.remove(path.size()-1);
            set.remove(nums[i]);
        }
    }
}
