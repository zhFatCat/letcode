package lou.study.letcode;

// result accepted
public class AddTwoNum2 {
    //Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int total = l1.val + l2.val;
            ListNode tail;
            ListNode head = new ListNode(total % 10);
            tail = head;

            ListNode tmp1 = l1.next;
            ListNode tmp2 = l2.next;
            int flag = total / 10;

            while (tmp1 != null && tmp2 != null) {
                total = tmp1.val + tmp2.val + flag;
                ListNode node = new ListNode(total % 10);
                flag = total / 10;
                tail.next = node;
                tail = node;
                tmp1 = tmp1.next;
                tmp2 = tmp2.next;
            }
            if (tmp1 != null) {
                addRest(tmp1, tail, flag);
            } else {
                if (tmp2 != null) {
                    addRest(tmp2, tail, flag);
                } else if (flag != 0){
                    tail.next = new ListNode(flag);
                }
            }
            return head;
        }

        private void addRest(ListNode node, ListNode tail, int flag) {
            int newFlag = flag;
            while (node != null) {
                int total = node.val + newFlag;
                ListNode tmp = new ListNode(total % 10);
                newFlag = total / 10;
                tail.next = tmp;
                tail = tmp;
                node = node.next;
            }
            if (newFlag != 0) tail.next = new ListNode(flag);
        }
    }
}
