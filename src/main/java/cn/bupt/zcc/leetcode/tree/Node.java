package cn.bupt.zcc.leetcode.tree;

/**
 * Created by zhangchengcheng on 2022/6/12
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
