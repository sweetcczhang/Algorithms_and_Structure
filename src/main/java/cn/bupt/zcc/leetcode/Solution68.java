package cn.bupt.zcc.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/5
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution68 {
    /**
     * 参照题解进行解答
     * https://leetcode.cn/problems/text-justification/solution/text-justification-by-ikaruga/
     * @param words
     * @param maxWidth
     * @return
     */
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int start = 0; 
        int countLength = 0;
        for (int i = 0; i < words.length; i++) {
            countLength += words[i].length() + 1;
            if (i+1 == words.length || words[i+1].length() + countLength >maxWidth){
                result.add(fillWord(words, start, i, maxWidth));
                start = i+1;
                countLength = 0;

            }
        }
        return result;
    }

    private String fillWord(String[] words, int start, int end, int maxWidth){
        boolean lastLine = words.length-1 == end;
        int wordCount = end - start + 1;
        // 计算需要的额外空格数
        int spaceCount = maxWidth + 1 - wordCount;
        for (int i = start; i <= end ; i++) {
            spaceCount -= words[i].length();
        }

        int spaceSuffix = 1;
        // 额外空平均到各个单词之间，每个单词之间的空格平均有几个
        int spaceAvg = (wordCount == 1) ? 1 : spaceCount / (wordCount-1);
        // 额外的空格不能均分的时候，会有余数
        int spaceExtra = (wordCount == 1) ? 1 : spaceCount % (wordCount-1);
        StringBuilder builder = new StringBuilder();
        // 填充空格
        for (int i = start; i < end; i++) {
            builder.append(words[i]);
            if (lastLine){
                builder.append(" ");
                continue;
            }
            int n = spaceSuffix + spaceAvg + ((i-start) < spaceExtra ? 1 : 0);
            while (n > 0){
                builder.append(" ");
                n--;
            }
        }
        //主要为了处理一行只有一个单词和最后一行的情况
        builder.append(words[end]);
        int lastLineSpace = maxWidth - builder.length();
        while (lastLineSpace > 0){
            builder.append(" ");
            lastLineSpace--;
        }
        return  builder.toString();
    }
    
}
