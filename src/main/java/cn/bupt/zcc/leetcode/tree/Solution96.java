package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/8
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution96 {
    static int[][] table;
    public int numTrees(int n) {
        table = new int[n+1][n+1];
        for (int i = 0; i <= n; i++) {
            table[i] = new int[n+1];
        }
        return count(1,n);
    }

    public static int count(int start, int end){
        if (start > end){
            return 1;
        }
        if (table[start][end] != 0){
            return table[start][end];
        }
        int res = 0;
        for (int i = 1; i <= end; i++) {
            int left = count(start,i-1);
            int right = count(i+1, end);
            res += left*right;
        }
        table[start][end] = res;

        return res;
    }
}
