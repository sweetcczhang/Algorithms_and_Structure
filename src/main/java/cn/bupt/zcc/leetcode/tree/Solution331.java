package cn.bupt.zcc.leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by zhangchengcheng on 2022/7/2
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution331 {
    final static String NULL = "#";
    public static boolean isValidSerialization(String preorder) {
        Queue<String> preOrderList = new LinkedList<>();
        for (String s : preorder.split(",")){
            preOrderList.add(s);
        }
        return validPreOrder(preOrderList) && preOrderList.isEmpty();
    }

    private static boolean  validPreOrder(Queue<String> preOrderList){
        if (preOrderList.isEmpty()){
            return false;
        }
        String first = preOrderList.poll();
        if (NULL.equals(first)){
            return true;
        }
        if (preOrderList.size() < 2) {
            return false;
        }
        boolean left = validPreOrder(preOrderList);
        boolean right = validPreOrder(preOrderList);

        return left && right;
    }

    public static void main(String[] args){
        String test = "9,#,#,1";
        isValidSerialization(test);
    }
}
