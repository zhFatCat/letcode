package lou.study.letcode.array;

public class MergeTwoLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        ListNode t1 = l1;
        ListNode t2 = l2;
        int nextVal;
        if (l1 == null && l2 == null) {
            return null;
        }
        if (t1 == null) {
            nextVal = t2.val;
            t2 = t2.next;
        } else if (t2 == null) {
            nextVal = t1.val;
            t1 = t1.next;
        } else {
            if (t1.val > t2.val) {
                nextVal = t2.val;
                t2 = t2.next;
            } else {
                nextVal = t1.val;
                t1 = t1.next;
            }
        }
        head = new ListNode(nextVal);
        tail = head;
        while (t1 != null || t2 != null) {
            if (t1 == null) {
                nextVal = t2.val;
                t2 = t2.next;
            } else if (t2 == null) {
                nextVal = t1.val;
                t1 = t1.next;
            } else {
                if (t1.val > t2.val) {
                    nextVal = t2.val;
                    t2 = t2.next;
                } else {
                    nextVal = t1.val;
                    t1 = t1.next;
                }
            }
            tail.next = new ListNode(nextVal);
            tail = tail.next;
        }
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        @Override
        public boolean equals(Object obj) {
            ListNode n = ListNode.class.cast(obj);
            if (this == null && obj == null) {
                return true;
            }
            ListNode t1 = this;
            ListNode t2 = n;
            while (t1 != null || t2 != null) {
                if (t1 == null || t2 == null) {
                    return false;
                }
                if (t1.val != t2.val) {
                    return false;
                }
                t1 = t1.next;
                t2 = t2.next;
            }
            return true;
        }
    }
}
