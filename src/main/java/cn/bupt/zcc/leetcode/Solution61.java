package cn.bupt.zcc.leetcode;

import java.util.List;

/**
 * Created by zhangchengcheng on 2022/6/4
 * E-mail: sweetzcc@163.com
 * Github: https://github.com/sweetcczhang
 */
public class Solution61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if (k==0 ||head == null || head.next==null) return head;
        ListNode firth = new ListNode(0);
        firth.next = head;
        head = firth;
        int length = 0;
        while (firth.next!=null){
            length++;
            firth = firth.next;
        }

        firth = head;
        k = k % length;
        if (k == 0) return head;
        k = length -k;

        while ( k>0){
           firth = firth.next;
           k--;
        }

        ListNode sencond = firth.next;
        firth.next = null;
        firth = sencond;
        while (sencond.next !=null){
            sencond = sencond.next;
        }
        sencond.next = head.next;

        return firth;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode next = new ListNode(2);
        head.next = next;
        rotateRight(head,2);
    }
}
