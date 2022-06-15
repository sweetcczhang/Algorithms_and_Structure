package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/3
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length ==1) return intervals;
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        List<int[]> result = new ArrayList<>();
        int i =0;
        while (i < intervals.length){
            int j = i+1;
            int [] start = intervals[i];
            while (j< intervals.length && start[1] >= intervals[j][0]){
                start[1] = Math.max(start[1], intervals[j][1]);
                j++;
            }
            result.add(start);
            i =j;
        }
        int[][]  res = new int[result.size()][2];
        for (int j = 0; j < result.size(); j++) {
            res[j] = result.get(j);
        }
        return res;
    }
}
