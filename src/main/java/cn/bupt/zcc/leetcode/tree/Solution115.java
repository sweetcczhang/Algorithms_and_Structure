package cn.bupt.zcc.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by zhangchengcheng on 2022/6/12
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution115 {
    public Node connect(Node root) {
        if (root == null) return null;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            Node first = queue.poll();
            if (first.left !=null){
                queue.add(first.left);
            }
            if (first.right!=null){
                queue.add(first.right);
            }
            if (size == 1){
                continue;
            }
            for (int i = 0; i < size-1; i++) {
                Node second = queue.poll();
                first.next = second;
                first = second;
                if (first.left !=null){
                    queue.add(first.left);
                }
                if (first.right!=null){
                    queue.add(first.right);
                }
            }
        }
        return root;
    }
}
