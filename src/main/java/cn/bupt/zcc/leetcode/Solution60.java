package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by zhangchengcheng on 2022/6/4
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution60 {
    public static String getPermutation(int n, int k) {
        List<String> result = new ArrayList<>();
        backTrack(result,n,k,new AtomicInteger(),new StringBuilder(), new boolean[n+1]);
        return result.get(0);
    }

    private static void backTrack(List<String> result, int n, int k, AtomicInteger index, StringBuilder builder, boolean[] table){
        if ( builder.length() == n){
            index.getAndAdd(1);
            if (index.get() == k){
                result.add(new String(builder));
            }
            return;
        }
        for (int i = 1; i <= n; i++) {
            if (index.get() == k) return;
            if (table[i]){
                continue;
            }
            builder.append(i);
            table[i] = true;
            backTrack(result,n,k,index,builder,table);
            table[i] = false;
            builder.deleteCharAt(builder.length()-1);

        }
    }

    public static void main(String[] args){
        System.out.println(getPermutation(3,1));
    }

}
