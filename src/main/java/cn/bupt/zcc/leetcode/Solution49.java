package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangchengcheng on 2022/6/3
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution49 {
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        if (strs.length <=1){
            List<String> temp = new ArrayList<>();
            temp.add(strs[0]);
            result.add(temp);
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            int[] table = new int[26];
            for (int j = 0; j < strs[i].length(); j++) {
                table[strs[i].charAt(j)-'a']++;
            }
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                if (table[j] !=0){
                    builder.append((char)('a' + j));
                    builder.append(table[j]);
                }
            }
            if (!map.containsKey(builder.toString())){
                map.put(builder.toString(),new ArrayList<>());
            }
            map.get(builder.toString()).add(strs[i]);
        }
        map.forEach((key,value) -> result.add(value));

        return result;
    }

    public static void main(String[] args){
        String[] str =new String[]{"eat","tea","tan","ate","nat","bat"};
        groupAnagrams(str);
    }

}
