package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/3
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution57 {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        if (intervals.length == 0){
            int[][] a =new int[1][2];
            a[0] = newInterval;
            return a;
        }
        List<int[]> result = new ArrayList<>();
        int i =0;
        while (i < intervals.length){
            int [] start = intervals[i];
            if (start[0] > newInterval[1]){
                result.add(newInterval);
            }
            if (start[1] <newInterval[0]){
                result.add(start);
                i++;
            }else {
                start[0] = Math.min(start[0],newInterval[0]);
                start[1] = Math.max(start[1], newInterval[1]);
                int j = i+1;
                while (j< intervals.length && start[1] >= intervals[j][0]){
                    start[1] = Math.max(start[1], intervals[j][1]);
                    j++;
                }
                result.add(start);
                i = j;
                break;
            }
        }
        for (int j = i; j < intervals.length; j++) {
            result.add(intervals[j]);
        }
        if (result.get(result.size()-1)[1] < newInterval[0]){
            result.add(newInterval);
        }
        int[][]  res = new int[result.size()][2];
        for (int j = 0; j < result.size(); j++) {
            res[j] = result.get(j);
        }
        return res;

    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        String[] s1 = s.split(" ");
        return s1[s1.length-1].length();
    }
    public static void main(String[] args){
        int[][]  nums = {{1,3},{6,9}};
        int[] in = {2,5};
        insert(nums,in);
    }
}
