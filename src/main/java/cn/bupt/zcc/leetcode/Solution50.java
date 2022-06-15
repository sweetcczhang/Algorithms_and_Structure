package cn.bupt.zcc.leetcode;

/**
 * Created by zhangchengcheng on 2022/6/3
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution50 {
    public static double myPow(double x, int n) {
        if (x == 0.0 || x == 1.0) return x;
        if (n == 0) return 1;
        long p = n;
        if ( p<0){
            p = -p;
            x = 1.0/x;
        }
        double res = 1.0;
        while (p>0){
            if ((p & 1) == 1) res *= x;
            x *= x;
            p >>=1;
        }
        return res;
    }

    private static double qickMul(double x, long n){
        double res = 1.0;
        double mul = x;
        long i = 2;
        while( i<n){
            mul *= mul;
            i += i;
        }
        return mul * qickMul(x,n-i);
    }

    public static void main(String[] args){
        System.out.println(myPow(2.00000,2));
        System.out.println(Math.pow(2.00000,-2147483648));
    }
}
