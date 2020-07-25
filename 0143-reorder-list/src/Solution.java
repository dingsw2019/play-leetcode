class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int val) { this.val = val; }
        ListNode() {}
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public void reorderList(ListNode head) {

        if (head == null || head.next == null || head.next.next == null)
            return;

        // 快慢指针二分链表
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 前一部分链表head, 后一部分链表after, after反转
//        ListNode after = slow.next;
//        slow.next = null;
//
//        after = reverse(after);
        ListNode after = reverse(slow.next);

        // 排序
        while (after != null) {
            ListNode afterNext = after.next;
            after.next = head.next;
            head.next = after;

            head = after.next;
            after = afterNext;
        }
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode next = cur.next;

            cur.next = prev;

            prev = cur;
            cur = next;
        }

        return prev;
    }

//    private ListNode reverse(ListNode head) {
//        if (head == null)
//            return null;
//
//        ListNode prev = head;
//        ListNode cur = head.next;
//
//        prev.next = null;
//
//        while (cur != null) {
//            ListNode next = cur.next;
//
//            cur.next = prev;
//
//            prev = cur;
//            cur = next;
//        }
//
//        return prev;
//    }
}