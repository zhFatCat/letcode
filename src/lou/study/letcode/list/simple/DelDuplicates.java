package lou.study.letcode.list.simple;

import lou.study.letcode.model.ListNode;

public class DelDuplicates {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ln = head;
        while (ln != null && ln.next != null) {
            ListNode next = ln.next;
            while (next != null && ln.val == next.val) {
                next = next.next;
            }
            ln.next = next;
            ln = ln.next;
        }
        return head;
    }
}
