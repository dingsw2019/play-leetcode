
class Solution {

    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) return null;
        if (head.next == null) return head;

        // 构建环形链表
        ListNode old_tail = head;
        int n;
        for (n = 1; old_tail.next != null; n ++)
            old_tail = old_tail.next;
        old_tail.next = head;

        // 找到新的尾节点的前一个节点
        ListNode new_tail = head;
        for (int i = 0; i < n - (k%n) - 1; i ++)
            new_tail = new_tail.next;

        // 新的头节点
        ListNode new_head = new_tail.next;
        // 断了环形链表
        new_tail.next = null;

        return new_head;
    }
}