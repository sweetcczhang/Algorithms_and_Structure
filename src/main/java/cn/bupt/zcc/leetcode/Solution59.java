package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/3
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution59 {
    public static int[][] generateMatrix(int n) {
        int[][] matrix  = new int[n][n];
        for (int i = 0; i < n; i++) {
            matrix[i] = new int[n];
        }
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = n-1;
        int index = 1;
        while (left <= right && top <= bottom){
            for (int i = left; i<=right; i++){
                matrix[top][i] = index++;
            }
            for (int i = top+1; i <=bottom; i++) {
                matrix[i][right] = index++;
            }
            if (left < right && top < bottom){
                for (int i = right-1; i > left; i--) {
                    matrix[bottom][i]=index++;
                }
                for (int i = bottom; i > top ; i--) {
                   matrix[i][left] = index++;
                }
            }
            left++;
            right--;
            bottom--;
            top++;
        }
        return matrix;
    }
    public static void main(String[] args){
        generateMatrix(3);
    }
}
