package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/3
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution54 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;
       while (left <= right && top <= bottom){
           for (int i = left; i<=right; i++){
               result.add(matrix[top][i]);
           }
           for (int i = top+1; i <=bottom; i++) {
               result.add(matrix[i][right]);
           }
           if (left < right && top < bottom){
               for (int i = right-1; i > left; i--) {
                   result.add(matrix[bottom][i]);
               }
               for (int i = bottom; i > top ; i--) {
                   result.add(matrix[i][left]);
               }
           }
           left++;
           right--;
           bottom--;
           top++;
       }

        return result;
    }
    public static void main(String[] args){

    }
}
