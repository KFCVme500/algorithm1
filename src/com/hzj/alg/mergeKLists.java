package com.hzj.alg;

import java.util.ArrayList;
import java.util.Comparator;

public class mergeKLists {
    public static void main(String[] args) {

    }
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < lists.length; i++) {
            while (lists[i]!=null) {
                arrayList.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        ListNode head = null;
        arrayList.sort(Comparator.naturalOrder());
        for (Integer o : arrayList) {
            System.out.println(o);
            ListNode listNode = new ListNode(o);
            head.next = listNode;
        }
        return head;
    }
}
