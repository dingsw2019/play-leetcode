public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode partition(ListNode head, int x) {

        ListNode before = new ListNode(0);
        ListNode beforeP = before;
        ListNode after = new ListNode(0);
        ListNode afterP = after;

        ListNode cur = head;
        while ( cur != null ) {
            if (cur.val < x) {
                beforeP.next = cur;
                beforeP = beforeP.next;
            } else {
                afterP.next = cur;
                afterP = afterP.next;
            }
            cur = cur.next;
        }

        afterP.next = null;
        beforeP.next = after.next;

        return before.next;
    }
}
