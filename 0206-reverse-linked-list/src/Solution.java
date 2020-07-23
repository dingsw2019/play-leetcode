import java.util.List;

public class Solution {

    private class ListNode {
        int value;
        public ListNode next;

        public ListNode(int v){
            this.value = v;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null, cur = head;

        while (cur != null) {

            ListNode next = cur.next;

            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }

    public ListNode reverseList2(ListNode head) {

        if (head.next == null)
            return head;

        ListNode last = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
