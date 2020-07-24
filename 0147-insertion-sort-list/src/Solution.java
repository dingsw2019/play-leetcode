public class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = head;
        ListNode cur = head.next;

        while (cur != null){

            if (prev.val < cur.val) {
                prev = cur;
                cur = cur.next;
            } else {

                ListNode p = dummyHead;
                // 跳过小于 cur 的节点
                while (p.next != null && p.next.val < cur.val)
                    p = p.next;

                // 重新排列节点
                prev.next = cur.next;
                cur.next = p.next;
                p.next = cur;

                cur = prev.next;
            }
        }

        return dummyHead.next;
    }
}
