package cn.bupt.zcc.leetcode;

/**
 * Created by zhangchengcheng on 2022/6/5
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution69 {
    public static int mySqrt(int x) {
        if ( x == 0 || x==1) return x;
        if (x ==2 || x==3) return 1;
        int left = 0;
        int right =  x/2 + 1;
        while (left <= right){
            int mid  = left + (right-left)/2;
            if ((long) mid * mid <= x){
                left = mid + 1;
            }else {
                right = mid-1;
            }
        }

        return left-1;
    }

    public static void main(String[] args){
        System.out.println(mySqrt(4));
    }
}
