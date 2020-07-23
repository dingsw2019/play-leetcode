import java.util.List;

public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        ListNode cur = head;

        while (cur != null && cur.next != null) {

            if (prev.next.val != cur.next.val) {
                prev = prev.next;
                cur = cur.next;
            } else {
                while (cur != null && cur.next != null && prev.next.val == cur.next.val) {
                    cur = cur.next;
                }
                prev.next = cur.next;
                cur = cur.next;
            }
        }

        return dummyHead.next;
    }
}
