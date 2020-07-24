public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null)
            return head;

        // 切割链表
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode after = slow.next;
        slow.next = null;

        // 合并排序
        ListNode left = sortList(head);
        ListNode right = sortList(after);
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;

        while (left != null && right != null) {
            if (left.val <= right.val) {
                cur.next = left;
                left = left.next;
            } else {
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }

        cur.next = (left == null) ? right : left;

        return dummyHead.next;
    }
}
