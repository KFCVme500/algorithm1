package com.hzj.alg;

import java.util.HashSet;
import java.util.Set;

/**
 *
 */
public class hasCycle {
    /**
     * 环形链表
     * 快慢指针 ，二者终将相逢
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode s = head, f = head;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
            if(s == f) return true;
        }
        return false;
    }
    public boolean hasCycle1(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
