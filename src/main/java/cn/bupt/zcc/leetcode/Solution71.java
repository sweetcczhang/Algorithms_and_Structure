package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/5
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution71 {
    public static String simplifyPath(String path) {
        if (path.length() == 1) return path;
        path = path.trim();
        String[] split = path.split("/");
        List<String> result = new ArrayList<>();
        for (String s: split) {
            if (s.equals("") || s.equals(".")) continue;
            if (s.equals("..") ){
                if (result.size()>0){
                    result.remove(result.size()-1);
                }
            }else {
                result.add(s);
            }


        }
        if (result.size() == 0) return "/";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.size(); i++) {
            sb.append("/").append(result.get(i));
        }


    return sb.toString();
    }

    public static void main(String[] args){
        String path = "/../";
        System.out.println(simplifyPath(path));
    }

}
