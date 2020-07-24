public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len ++;
            cur = cur.next;
        }

        int sort = len - n;
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        cur = dummyHead;
        while (sort >= 0) {
            if (sort == 0) {
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode.next = null;
            }
            cur = cur.next;
            sort--;
        }

        return dummyHead.next;
    }
}
