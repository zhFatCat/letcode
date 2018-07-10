package lou.study.letcode.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoListsTest {
/*输入：1->2->4, 1->3->4
输出：1->1->2->3->4->4*/
    @Test
    public void mergeTwoLists() {
        MergeTwoLists ml = new MergeTwoLists();
        MergeTwoLists.ListNode l1 = new MergeTwoLists.ListNode(1);
        MergeTwoLists.ListNode n2 = new MergeTwoLists.ListNode(2);
        MergeTwoLists.ListNode n3 = new MergeTwoLists.ListNode(4);
        MergeTwoLists.ListNode l2 = new MergeTwoLists.ListNode(1);
        MergeTwoLists.ListNode n4 = new MergeTwoLists.ListNode(3);
        MergeTwoLists.ListNode n5 = new MergeTwoLists.ListNode(4);
        MergeTwoLists.ListNode result = new MergeTwoLists.ListNode(1);
        MergeTwoLists.ListNode tr1 = result;
        l1.next = n2;
        n2.next = n3;
        l2.next = n4;
        n4.next = n5;
        tr1.next = new MergeTwoLists.ListNode(1);
        tr1 = tr1.next;
        tr1.next = new MergeTwoLists.ListNode(2);
        tr1 = tr1.next;
        tr1.next = new MergeTwoLists.ListNode(3);
        tr1 = tr1.next;
        tr1.next = new MergeTwoLists.ListNode(4);
        tr1 = tr1.next;
        tr1.next = new MergeTwoLists.ListNode(4);
        Assert.assertEquals(result, ml.mergeTwoLists(l1, l2));
    }
}