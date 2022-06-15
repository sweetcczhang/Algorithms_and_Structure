package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/3
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution51 {
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] table = new char[n][n];
        for (int i = 0; i < n; i++) {
           table[i] = new char[n];
            for (int j = 0; j < n; j++) {
                table[i][j] = '.';
            }
        }

        backTrack(result, table, n,0);
        return result;
    }

    private static void backTrack(List<List<String>> result, char[][] table, int n, int index){
        if (index == n){
            List<String> path = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                path.add(new String(table[i]));
            }
            result.add(new ArrayList<>(path));
            return;
        }
        char[] row =  table[index];
        for (int i = 0; i < n; i++) {
            if (!isValid(table, index, i)){
               continue;
            }
            row[i] = 'Q';
            backTrack(result, table,n, index+1);
            row[i] = '.';
        }
    }

    private static boolean isValid(char[][] table, int row, int col){
        int n = table[0].length;
        for (int i = 0; i < n; i++) {
            // 行是否有冲突
            if (table[row][i] == 'Q'){
                return false;
            }
            // 检查列是否有冲突
            if (table[i][col] == 'Q'){
                return false;
            }
        }
        int i = row;
        int j = col;
        // 检查左上方是否有冲突
        while (i >=0  && j >=0 ){
            if (table[i][j] == 'Q'){
                return false;
            }
            i--;
            j--;
        }
        i = row;
        j = col;
        // 检查右上方是否有冲突
        while (i >=0 && j <n){
            if (table[i][j] == 'Q'){
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public static void main(String[] args){
        solveNQueens(4);
    }

}
